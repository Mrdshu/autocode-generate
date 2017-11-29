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
public class MtoFeeds {
		
	    
	private Long postId;
		
	    
	private Date created;
		
	    
	private Long id;
		
	    
	private Long authorId;
		
	    
	private Integer type;
		
	    
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
		
	public Long getAuthorId() {
        return authorId;
    }

	public void setAuthorId(Long authorId) {
    	 this.authorId = authorId;
	}
		
	public Integer getType() {
        return type;
    }

	public void setType(Integer type) {
    	 this.type = type;
	}
		
	public Long getOwnId() {
        return ownId;
    }

	public void setOwnId(Long ownId) {
    	 this.ownId = ownId;
	}
	}