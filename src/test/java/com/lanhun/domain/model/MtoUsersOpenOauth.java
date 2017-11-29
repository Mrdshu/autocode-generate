package com.lanhun.domain.model;



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
public class MtoUsersOpenOauth {
		
	    
	private String accessToken;
		
	    
	private String refreshToken;
		
	    
	private String oauthUserId;
		
	    
	private Long userId;
		
	    
	private String oauthCode;
		
	    
	private Integer oauthType;
		
	    
	private Long id;
		
	    
	private String expireIn;
		
	
		
	public String getAccessToken() {
        return accessToken;
    }

	public void setAccessToken(String accessToken) {
    	 this.accessToken = accessToken;
	}
		
	public String getRefreshToken() {
        return refreshToken;
    }

	public void setRefreshToken(String refreshToken) {
    	 this.refreshToken = refreshToken;
	}
		
	public String getOauthUserId() {
        return oauthUserId;
    }

	public void setOauthUserId(String oauthUserId) {
    	 this.oauthUserId = oauthUserId;
	}
		
	public Long getUserId() {
        return userId;
    }

	public void setUserId(Long userId) {
    	 this.userId = userId;
	}
		
	public String getOauthCode() {
        return oauthCode;
    }

	public void setOauthCode(String oauthCode) {
    	 this.oauthCode = oauthCode;
	}
		
	public Integer getOauthType() {
        return oauthType;
    }

	public void setOauthType(Integer oauthType) {
    	 this.oauthType = oauthType;
	}
		
	public Long getId() {
        return id;
    }

	public void setId(Long id) {
    	 this.id = id;
	}
		
	public String getExpireIn() {
        return expireIn;
    }

	public void setExpireIn(String expireIn) {
    	 this.expireIn = expireIn;
	}
	}