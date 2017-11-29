package com.lanhun.domain.example;

import java.util.ArrayList;
import java.util.List;

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
public class MtoFriendLinkExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoFriendLinkExample() {
		super();
		oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
		return orderByClause;
    }

    public void setDistinct(boolean distinct) {
		this.distinct = distinct;
    }

    public boolean isDistinct() {
		return distinct;
    }

    public List<Criteria> getOredCriteria() {
		return oredCriteria;
    }

    public void or(Criteria criteria) {
		oredCriteria.add(criteria);
    }

  

    public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
    }

    public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
		    oredCriteria.add(criteria);
		}
		return criteria;
    }

    protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
    }

    public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
    }

    protected abstract static class GeneratedCriteria {
 		protected List<Criterion> criteria;
		protected GeneratedCriteria() {
	   		 criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
		    return criteria.size() > 0;
		}
	
		public List<Criterion> getAllCriteria() {
		    return criteria;
		}
	
		public List<Criterion> getCriteria() {
		    return criteria;
		}
	

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
	
		public Criteria join(String condition) {
		    addCriterion(condition);
		    return (Criteria) this;
		}
			
		public Criteria andSiteNameIsNull() {
		    addCriterion("site_name is null");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameIsNotNull() {
		    addCriterion("site_name is not null");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameEqualTo(String value) {
		    addCriterion("site_name =", value, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameNotEqualTo(String value) {
		    addCriterion("site_name <>", value, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameGreaterThan(String value) {
		    addCriterion("site_name >", value, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
		    addCriterion("site_name >=", value, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameLessThan(String value) {
		    addCriterion("site_name <", value, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameLessThanOrEqualTo(String value) {
		    addCriterion("site_name <=", value, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameIn(List<String> values) {
		    addCriterion("site_name in", values, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameNotIn(List<String> values) {
		    addCriterion("site_name not in", values, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameBetween(String value1, String value2) {
		    addCriterion("site_name between", value1, value2, "siteName");
		    return (Criteria) this;
		}
	
		public Criteria andSiteNameNotBetween(String value1, String value2) {
		    addCriterion("site_name not between", value1, value2, "siteName");
		    return (Criteria) this;
		}
		
			
		public Criteria andLogoIsNull() {
		    addCriterion("logo is null");
		    return (Criteria) this;
		}
	
		public Criteria andLogoIsNotNull() {
		    addCriterion("logo is not null");
		    return (Criteria) this;
		}
	
		public Criteria andLogoEqualTo(String value) {
		    addCriterion("logo =", value, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoNotEqualTo(String value) {
		    addCriterion("logo <>", value, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoGreaterThan(String value) {
		    addCriterion("logo >", value, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoGreaterThanOrEqualTo(String value) {
		    addCriterion("logo >=", value, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoLessThan(String value) {
		    addCriterion("logo <", value, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoLessThanOrEqualTo(String value) {
		    addCriterion("logo <=", value, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoIn(List<String> values) {
		    addCriterion("logo in", values, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoNotIn(List<String> values) {
		    addCriterion("logo not in", values, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoBetween(String value1, String value2) {
		    addCriterion("logo between", value1, value2, "logo");
		    return (Criteria) this;
		}
	
		public Criteria andLogoNotBetween(String value1, String value2) {
		    addCriterion("logo not between", value1, value2, "logo");
		    return (Criteria) this;
		}
		
			
		public Criteria andRemarkIsNull() {
		    addCriterion("remark is null");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkIsNotNull() {
		    addCriterion("remark is not null");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkEqualTo(String value) {
		    addCriterion("remark =", value, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkNotEqualTo(String value) {
		    addCriterion("remark <>", value, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkGreaterThan(String value) {
		    addCriterion("remark >", value, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
		    addCriterion("remark >=", value, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkLessThan(String value) {
		    addCriterion("remark <", value, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkLessThanOrEqualTo(String value) {
		    addCriterion("remark <=", value, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkIn(List<String> values) {
		    addCriterion("remark in", values, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkNotIn(List<String> values) {
		    addCriterion("remark not in", values, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkBetween(String value1, String value2) {
		    addCriterion("remark between", value1, value2, "remark");
		    return (Criteria) this;
		}
	
		public Criteria andRemarkNotBetween(String value1, String value2) {
		    addCriterion("remark not between", value1, value2, "remark");
		    return (Criteria) this;
		}
		
			
		public Criteria andIdIsNull() {
		    addCriterion("id is null");
		    return (Criteria) this;
		}
	
		public Criteria andIdIsNotNull() {
		    addCriterion("id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andIdEqualTo(Long value) {
		    addCriterion("id =", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotEqualTo(Long value) {
		    addCriterion("id <>", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdGreaterThan(Long value) {
		    addCriterion("id >", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("id >=", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdLessThan(Long value) {
		    addCriterion("id <", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdLessThanOrEqualTo(Long value) {
		    addCriterion("id <=", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdIn(List<Long> values) {
		    addCriterion("id in", values, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotIn(List<Long> values) {
		    addCriterion("id not in", values, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdBetween(Long value1, Long value2) {
		    addCriterion("id between", value1, value2, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotBetween(Long value1, Long value2) {
		    addCriterion("id not between", value1, value2, "id");
		    return (Criteria) this;
		}
		
			
		public Criteria andSortIsNull() {
		    addCriterion("sort is null");
		    return (Criteria) this;
		}
	
		public Criteria andSortIsNotNull() {
		    addCriterion("sort is not null");
		    return (Criteria) this;
		}
	
		public Criteria andSortEqualTo(Integer value) {
		    addCriterion("sort =", value, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortNotEqualTo(Integer value) {
		    addCriterion("sort <>", value, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortGreaterThan(Integer value) {
		    addCriterion("sort >", value, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortGreaterThanOrEqualTo(Integer value) {
		    addCriterion("sort >=", value, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortLessThan(Integer value) {
		    addCriterion("sort <", value, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortLessThanOrEqualTo(Integer value) {
		    addCriterion("sort <=", value, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortIn(List<Integer> values) {
		    addCriterion("sort in", values, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortNotIn(List<Integer> values) {
		    addCriterion("sort not in", values, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortBetween(Integer value1, Integer value2) {
		    addCriterion("sort between", value1, value2, "sort");
		    return (Criteria) this;
		}
	
		public Criteria andSortNotBetween(Integer value1, Integer value2) {
		    addCriterion("sort not between", value1, value2, "sort");
		    return (Criteria) this;
		}
		
			
		public Criteria andUrlIsNull() {
		    addCriterion("url is null");
		    return (Criteria) this;
		}
	
		public Criteria andUrlIsNotNull() {
		    addCriterion("url is not null");
		    return (Criteria) this;
		}
	
		public Criteria andUrlEqualTo(String value) {
		    addCriterion("url =", value, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlNotEqualTo(String value) {
		    addCriterion("url <>", value, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlGreaterThan(String value) {
		    addCriterion("url >", value, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlGreaterThanOrEqualTo(String value) {
		    addCriterion("url >=", value, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlLessThan(String value) {
		    addCriterion("url <", value, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlLessThanOrEqualTo(String value) {
		    addCriterion("url <=", value, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlIn(List<String> values) {
		    addCriterion("url in", values, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlNotIn(List<String> values) {
		    addCriterion("url not in", values, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlBetween(String value1, String value2) {
		    addCriterion("url between", value1, value2, "url");
		    return (Criteria) this;
		}
	
		public Criteria andUrlNotBetween(String value1, String value2) {
		    addCriterion("url not between", value1, value2, "url");
		    return (Criteria) this;
		}
		
		    }

    public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
		    super();
		}
    }
    
     /**
     * @author hz15101769
	 * @date 2016-01-12 16:11:45
     * @version 
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

}