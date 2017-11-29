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
 * @date 2016-01-12 16:11:46
 * @version
 */
public class MtoTagsExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoTagsExample() {
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
			
		public Criteria andFeaturedIsNull() {
		    addCriterion("featured is null");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedIsNotNull() {
		    addCriterion("featured is not null");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedEqualTo(Integer value) {
		    addCriterion("featured =", value, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedNotEqualTo(Integer value) {
		    addCriterion("featured <>", value, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedGreaterThan(Integer value) {
		    addCriterion("featured >", value, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedGreaterThanOrEqualTo(Integer value) {
		    addCriterion("featured >=", value, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedLessThan(Integer value) {
		    addCriterion("featured <", value, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedLessThanOrEqualTo(Integer value) {
		    addCriterion("featured <=", value, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedIn(List<Integer> values) {
		    addCriterion("featured in", values, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedNotIn(List<Integer> values) {
		    addCriterion("featured not in", values, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedBetween(Integer value1, Integer value2) {
		    addCriterion("featured between", value1, value2, "featured");
		    return (Criteria) this;
		}
	
		public Criteria andFeaturedNotBetween(Integer value1, Integer value2) {
		    addCriterion("featured not between", value1, value2, "featured");
		    return (Criteria) this;
		}
		
			
		public Criteria andHotsIsNull() {
		    addCriterion("hots is null");
		    return (Criteria) this;
		}
	
		public Criteria andHotsIsNotNull() {
		    addCriterion("hots is not null");
		    return (Criteria) this;
		}
	
		public Criteria andHotsEqualTo(Integer value) {
		    addCriterion("hots =", value, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsNotEqualTo(Integer value) {
		    addCriterion("hots <>", value, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsGreaterThan(Integer value) {
		    addCriterion("hots >", value, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsGreaterThanOrEqualTo(Integer value) {
		    addCriterion("hots >=", value, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsLessThan(Integer value) {
		    addCriterion("hots <", value, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsLessThanOrEqualTo(Integer value) {
		    addCriterion("hots <=", value, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsIn(List<Integer> values) {
		    addCriterion("hots in", values, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsNotIn(List<Integer> values) {
		    addCriterion("hots not in", values, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsBetween(Integer value1, Integer value2) {
		    addCriterion("hots between", value1, value2, "hots");
		    return (Criteria) this;
		}
	
		public Criteria andHotsNotBetween(Integer value1, Integer value2) {
		    addCriterion("hots not between", value1, value2, "hots");
		    return (Criteria) this;
		}
		
			
		public Criteria andLastPostIdIsNull() {
		    addCriterion("last_post_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdIsNotNull() {
		    addCriterion("last_post_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdEqualTo(Long value) {
		    addCriterion("last_post_id =", value, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdNotEqualTo(Long value) {
		    addCriterion("last_post_id <>", value, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdGreaterThan(Long value) {
		    addCriterion("last_post_id >", value, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("last_post_id >=", value, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdLessThan(Long value) {
		    addCriterion("last_post_id <", value, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdLessThanOrEqualTo(Long value) {
		    addCriterion("last_post_id <=", value, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdIn(List<Long> values) {
		    addCriterion("last_post_id in", values, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdNotIn(List<Long> values) {
		    addCriterion("last_post_id not in", values, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdBetween(Long value1, Long value2) {
		    addCriterion("last_post_id between", value1, value2, "lastPostId");
		    return (Criteria) this;
		}
	
		public Criteria andLastPostIdNotBetween(Long value1, Long value2) {
		    addCriterion("last_post_id not between", value1, value2, "lastPostId");
		    return (Criteria) this;
		}
		
			
		public Criteria andNameIsNull() {
		    addCriterion("name is null");
		    return (Criteria) this;
		}
	
		public Criteria andNameIsNotNull() {
		    addCriterion("name is not null");
		    return (Criteria) this;
		}
	
		public Criteria andNameEqualTo(String value) {
		    addCriterion("name =", value, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameNotEqualTo(String value) {
		    addCriterion("name <>", value, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameGreaterThan(String value) {
		    addCriterion("name >", value, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameGreaterThanOrEqualTo(String value) {
		    addCriterion("name >=", value, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameLessThan(String value) {
		    addCriterion("name <", value, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameLessThanOrEqualTo(String value) {
		    addCriterion("name <=", value, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameIn(List<String> values) {
		    addCriterion("name in", values, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameNotIn(List<String> values) {
		    addCriterion("name not in", values, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameBetween(String value1, String value2) {
		    addCriterion("name between", value1, value2, "name");
		    return (Criteria) this;
		}
	
		public Criteria andNameNotBetween(String value1, String value2) {
		    addCriterion("name not between", value1, value2, "name");
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
		
			
		public Criteria andLockedIsNull() {
		    addCriterion("locked is null");
		    return (Criteria) this;
		}
	
		public Criteria andLockedIsNotNull() {
		    addCriterion("locked is not null");
		    return (Criteria) this;
		}
	
		public Criteria andLockedEqualTo(Integer value) {
		    addCriterion("locked =", value, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedNotEqualTo(Integer value) {
		    addCriterion("locked <>", value, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedGreaterThan(Integer value) {
		    addCriterion("locked >", value, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedGreaterThanOrEqualTo(Integer value) {
		    addCriterion("locked >=", value, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedLessThan(Integer value) {
		    addCriterion("locked <", value, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedLessThanOrEqualTo(Integer value) {
		    addCriterion("locked <=", value, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedIn(List<Integer> values) {
		    addCriterion("locked in", values, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedNotIn(List<Integer> values) {
		    addCriterion("locked not in", values, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedBetween(Integer value1, Integer value2) {
		    addCriterion("locked between", value1, value2, "locked");
		    return (Criteria) this;
		}
	
		public Criteria andLockedNotBetween(Integer value1, Integer value2) {
		    addCriterion("locked not between", value1, value2, "locked");
		    return (Criteria) this;
		}
		
			
		public Criteria andPostsIsNull() {
		    addCriterion("posts is null");
		    return (Criteria) this;
		}
	
		public Criteria andPostsIsNotNull() {
		    addCriterion("posts is not null");
		    return (Criteria) this;
		}
	
		public Criteria andPostsEqualTo(Integer value) {
		    addCriterion("posts =", value, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsNotEqualTo(Integer value) {
		    addCriterion("posts <>", value, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsGreaterThan(Integer value) {
		    addCriterion("posts >", value, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsGreaterThanOrEqualTo(Integer value) {
		    addCriterion("posts >=", value, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsLessThan(Integer value) {
		    addCriterion("posts <", value, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsLessThanOrEqualTo(Integer value) {
		    addCriterion("posts <=", value, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsIn(List<Integer> values) {
		    addCriterion("posts in", values, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsNotIn(List<Integer> values) {
		    addCriterion("posts not in", values, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsBetween(Integer value1, Integer value2) {
		    addCriterion("posts between", value1, value2, "posts");
		    return (Criteria) this;
		}
	
		public Criteria andPostsNotBetween(Integer value1, Integer value2) {
		    addCriterion("posts not between", value1, value2, "posts");
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
	 * @date 2016-01-12 16:11:46
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