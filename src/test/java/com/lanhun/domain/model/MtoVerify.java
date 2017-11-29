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
public class MtoVerify {
		
	    
	private String code;
		
	    
	private Date expired;
		
	    
	private Long userId;
		
	    
	private Date created;
		
	    
	private Long id;
		
	    
	private Integer type;
		
	    
	private Integer status;
		
	    
	private String target;
		
	    
	private String token;
		
	
		
	public String getCode() {
        return code;
    }

	public void setCode(String code) {
    	 this.code = code;
	}
		
	public Date getExpired() {
        return expired;
    }

	public void setExpired(Date expired) {
    	 this.expired = expired;
	}
		
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
		
	public Integer getType() {
        return type;
    }

	public void setType(Integer type) {
    	 this.type = type;
	}
		
	public Integer getStatus() {
        return status;
    }

	public void setStatus(Integer status) {
    	 this.status = status;
	}
		
	public String getTarget() {
        return target;
    }

	public void setTarget(String target) {
    	 this.target = target;
	}
		
	public String getToken() {
        return token;
    }

	public void setToken(String token) {
    	 this.token = token;
	}
	}