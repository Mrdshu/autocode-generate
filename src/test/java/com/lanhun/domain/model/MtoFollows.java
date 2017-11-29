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
public class MtoFollows {
		
	    
	private Long userId;
		
	    
	private Date created;
		
	    
	private Long id;
		
	    
	private Long followId;
		
	
		
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
		
	public Long getId() {
        return id;
    }

	public void setId(Long id) {
    	 this.id = id;
	}
		
	public Long getFollowId() {
        return followId;
    }

	public void setFollowId(Long followId) {
    	 this.followId = followId;
	}
	}