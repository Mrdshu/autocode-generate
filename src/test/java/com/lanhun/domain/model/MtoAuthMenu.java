package com.lanhun.domain.model;



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
public class MtoAuthMenu {
		
	    
	private Long parentId;
		
	    
	private String name;
		
	    
	private String icon;
		
	    
	private String permission;
		
	    
	private Long id;
		
	    
	private Integer sort;
		
	    
	private String parentIds;
		
	    
	private String url;
		
	
		
	public Long getParentId() {
        return parentId;
    }

	public void setParentId(Long parentId) {
    	 this.parentId = parentId;
	}
		
	public String getName() {
        return name;
    }

	public void setName(String name) {
    	 this.name = name;
	}
		
	public String getIcon() {
        return icon;
    }

	public void setIcon(String icon) {
    	 this.icon = icon;
	}
		
	public String getPermission() {
        return permission;
    }

	public void setPermission(String permission) {
    	 this.permission = permission;
	}
		
	public Long getId() {
        return id;
    }

	public void setId(Long id) {
    	 this.id = id;
	}
		
	public Integer getSort() {
        return sort;
    }

	public void setSort(Integer sort) {
    	 this.sort = sort;
	}
		
	public String getParentIds() {
        return parentIds;
    }

	public void setParentIds(String parentIds) {
    	 this.parentIds = parentIds;
	}
		
	public String getUrl() {
        return url;
    }

	public void setUrl(String url) {
    	 this.url = url;
	}
	}