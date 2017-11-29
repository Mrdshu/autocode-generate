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
public class MtoFavors {
		
	    
	private Long postId;
		
	    
	private Date created;
		
	    
	private Long id;
		
	    
	private Long ownId;
		
	
		
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
		
	public Long getOwnId() {
        return ownId;
    }

	public void setOwnId(Long ownId) {
    	 this.ownId = ownId;
	}
	}