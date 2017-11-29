package com.mrtree.auto.generator.db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionFactory {
	private static String url = "";
	private static String driver="";
	private static String user = "";
	private static String password = "";

	static {
		Properties properties = new Properties(); 
		try {
			FileInputStream fileInputStream = new FileInputStream("src/main/resources/config/db.properties"); 
			properties.load(fileInputStream);
			url = properties.getProperty("url");
			driver = properties.getProperty("driver");
			user = properties.getProperty("user"); 
			password = properties.getProperty("password"); 
		} catch (Throwable e) {   
			e.printStackTrace(); 
		} 
	}
	private int poolSize = 1;  
	 
	private BlockingQueue<Connection> connectionPool = new LinkedBlockingQueue<>();
   

	private byte[] lock = new byte[0];

	/**
	 * 获取连接，连接池未满则创建连接并放入连接池先
	 * 
	 * 从连接池取出一个连接
	 * @return
	 */
	public Connection getConnection() {
		synchronized (lock) {
			try {
				Connection connection = null;
				if (connectionPool.size() < poolSize) {//连接池未满，则创建新连接,并放入连接池
					connection = createNewConnection();
					connectionPool.put(connection);
				} 
				connection = connectionPool.take();
				return connection;
				
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

	}

	
	/**
	 * 创建新连接
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	
	private Connection createNewConnection() throws ClassNotFoundException, SQLException {
		Connection connection;
		Class.forName(driver);
		connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

	/**
	 * 关闭连接，重新放入连接池
	 * @param connection
	 */
	public void close(Connection connection) {
		synchronized (lock) {
			connectionPool.add(connection);
		}
	}
	
	/**
	 * 从连接池中移除一个连接，不重新入队
	 * @param connection
	 */
	public void remove(Connection connection){
		synchronized (lock) {
			connection=null;
		}
	}
	
	private ConnectionFactory(){
	}
	
	public static ConnectionFactory getIntance(){
		return FactoryHolder.factory;
	}
	
	private static class FactoryHolder{
		static ConnectionFactory factory=new ConnectionFactory();
	}
	
	public static void main(String[] args) {
		
	}

}
