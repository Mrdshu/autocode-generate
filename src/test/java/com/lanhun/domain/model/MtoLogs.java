package com.lanhun.domain.model;


import java.util.Date;


/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016-01-12 16:11:45
 * @version
 */
public class MtoLogs {
		
	    
	private Long userId;
		
	    
	private Date created;
		
	    
	private String ip;
		
	    
	private Long targetId;
		
	    
	private Long id;
		
	    
	private Integer type;
		
	
		
	public Long getUserId() {
        return userId;
    }

	public void setUserId(Long userId) {
    	 this.userId = userId;
	}
		
	public Date getCreated() {
        return created;
    }

	public void setCreated(Date created) {
    	 this.created = created;
	}
		
	public String getIp() {
        return ip;
    }

	public void setIp(String ip) {
    	 this.ip = ip;
	}
		
	public Long getTargetId() {
        return targetId;
    }

	public void setTargetId(Long targetId) {
    	 this.targetId = targetId;
	}
		
	public Long getId() {
        return id;
    }

	public void setId(Long id) {
    	 this.id = id;
	}
		
	public Integer getType() {
        return type;
    }

	public void setType(Integer type) {
    	 this.type = type;
	}
	}