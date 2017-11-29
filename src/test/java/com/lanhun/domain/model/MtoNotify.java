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
public class MtoNotify {
		
	    
	private Long fromId;
		
	    
	private Long postId;
		
	    
	private Date created;
		
	    
	private Long id;
		
	    
	private Integer event;
		
	    
	private Long ownId;
		
	    
	private Integer status;
		
	
		
	public Long getFromId() {
        return fromId;
    }

	public void setFromId(Long fromId) {
    	 this.fromId = fromId;
	}
		
	public Long getPostId() {
        return postId;
    }

	public void setPostId(Long postId) {
    	 this.postId = postId;
	}
		
	public Date getCreated() {
        return created;
    }

	public void setCreated(Date created) {
    	 this.created = created;
	}
		
	public Long getId() {
        return id;
    }

	public void setId(Long id) {
    	 this.id = id;
	}
		
	public Integer getEvent() {
        return event;
    }

	public void setEvent(Integer event) {
    	 this.event = event;
	}
		
	public Long getOwnId() {
        return ownId;
    }

	public void setOwnId(Long ownId) {
    	 this.ownId = ownId;
	}
		
	public Integer getStatus() {
        return status;
    }

	public void setStatus(Integer status) {
    	 this.status = status;
	}
	}