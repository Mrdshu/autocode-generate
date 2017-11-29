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
 * @date 2016-01-12 16:11:46
 * @version
 */
public class MtoComments {
		
	    
	private Date created;
		
	    
	private Long toId;
		
	    
	private Long pid;
		
	    
	private Long id;
		
	    
	private Long authorId;
		
	    
	private String content;
		
	    
	private Integer status;
		
	
		
	public Date getCreated() {
        return created;
    }

	public void setCreated(Date created) {
    	 this.created = created;
	}
		
	public Long getToId() {
        return toId;
    }

	public void setToId(Long toId) {
    	 this.toId = toId;
	}
		
	public Long getPid() {
        return pid;
    }

	public void setPid(Long pid) {
    	 this.pid = pid;
	}
		
	public Long getId() {
        return id;
    }

	public void setId(Long id) {
    	 this.id = id;
	}
		
	public Long getAuthorId() {
        return authorId;
    }

	public void setAuthorId(Long authorId) {
    	 this.authorId = authorId;
	}
		
	public String getContent() {
        return content;
    }

	public void setContent(String content) {
    	 this.content = content;
	}
		
	public Integer getStatus() {
        return status;
    }

	public void setStatus(Integer status) {
    	 this.status = status;
	}
	}