package com.lanhun.domain.example;

import java.util.ArrayList;
import java.util.List;
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
public class MtoNotifyExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoNotifyExample() {
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
			
		public Criteria andFromIdIsNull() {
		    addCriterion("from_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdIsNotNull() {
		    addCriterion("from_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdEqualTo(Long value) {
		    addCriterion("from_id =", value, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdNotEqualTo(Long value) {
		    addCriterion("from_id <>", value, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdGreaterThan(Long value) {
		    addCriterion("from_id >", value, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("from_id >=", value, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdLessThan(Long value) {
		    addCriterion("from_id <", value, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdLessThanOrEqualTo(Long value) {
		    addCriterion("from_id <=", value, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdIn(List<Long> values) {
		    addCriterion("from_id in", values, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdNotIn(List<Long> values) {
		    addCriterion("from_id not in", values, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdBetween(Long value1, Long value2) {
		    addCriterion("from_id between", value1, value2, "fromId");
		    return (Criteria) this;
		}
	
		public Criteria andFromIdNotBetween(Long value1, Long value2) {
		    addCriterion("from_id not between", value1, value2, "fromId");
		    return (Criteria) this;
		}
		
			
		public Criteria andPostIdIsNull() {
		    addCriterion("post_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdIsNotNull() {
		    addCriterion("post_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdEqualTo(Long value) {
		    addCriterion("post_id =", value, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdNotEqualTo(Long value) {
		    addCriterion("post_id <>", value, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdGreaterThan(Long value) {
		    addCriterion("post_id >", value, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("post_id >=", value, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdLessThan(Long value) {
		    addCriterion("post_id <", value, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdLessThanOrEqualTo(Long value) {
		    addCriterion("post_id <=", value, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdIn(List<Long> values) {
		    addCriterion("post_id in", values, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdNotIn(List<Long> values) {
		    addCriterion("post_id not in", values, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdBetween(Long value1, Long value2) {
		    addCriterion("post_id between", value1, value2, "postId");
		    return (Criteria) this;
		}
	
		public Criteria andPostIdNotBetween(Long value1, Long value2) {
		    addCriterion("post_id not between", value1, value2, "postId");
		    return (Criteria) this;
		}
		
			
		public Criteria andCreatedIsNull() {
		    addCriterion("created is null");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedIsNotNull() {
		    addCriterion("created is not null");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedEqualTo(Date value) {
		    addCriterion("created =", value, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedNotEqualTo(Date value) {
		    addCriterion("created <>", value, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedGreaterThan(Date value) {
		    addCriterion("created >", value, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
		    addCriterion("created >=", value, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedLessThan(Date value) {
		    addCriterion("created <", value, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedLessThanOrEqualTo(Date value) {
		    addCriterion("created <=", value, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedIn(List<Date> values) {
		    addCriterion("created in", values, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedNotIn(List<Date> values) {
		    addCriterion("created not in", values, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedBetween(Date value1, Date value2) {
		    addCriterion("created between", value1, value2, "created");
		    return (Criteria) this;
		}
	
		public Criteria andCreatedNotBetween(Date value1, Date value2) {
		    addCriterion("created not between", value1, value2, "created");
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
		
			
		public Criteria andEventIsNull() {
		    addCriterion("event is null");
		    return (Criteria) this;
		}
	
		public Criteria andEventIsNotNull() {
		    addCriterion("event is not null");
		    return (Criteria) this;
		}
	
		public Criteria andEventEqualTo(Integer value) {
		    addCriterion("event =", value, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventNotEqualTo(Integer value) {
		    addCriterion("event <>", value, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventGreaterThan(Integer value) {
		    addCriterion("event >", value, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventGreaterThanOrEqualTo(Integer value) {
		    addCriterion("event >=", value, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventLessThan(Integer value) {
		    addCriterion("event <", value, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventLessThanOrEqualTo(Integer value) {
		    addCriterion("event <=", value, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventIn(List<Integer> values) {
		    addCriterion("event in", values, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventNotIn(List<Integer> values) {
		    addCriterion("event not in", values, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventBetween(Integer value1, Integer value2) {
		    addCriterion("event between", value1, value2, "event");
		    return (Criteria) this;
		}
	
		public Criteria andEventNotBetween(Integer value1, Integer value2) {
		    addCriterion("event not between", value1, value2, "event");
		    return (Criteria) this;
		}
		
			
		public Criteria andOwnIdIsNull() {
		    addCriterion("own_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdIsNotNull() {
		    addCriterion("own_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdEqualTo(Long value) {
		    addCriterion("own_id =", value, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdNotEqualTo(Long value) {
		    addCriterion("own_id <>", value, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdGreaterThan(Long value) {
		    addCriterion("own_id >", value, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("own_id >=", value, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdLessThan(Long value) {
		    addCriterion("own_id <", value, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdLessThanOrEqualTo(Long value) {
		    addCriterion("own_id <=", value, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdIn(List<Long> values) {
		    addCriterion("own_id in", values, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdNotIn(List<Long> values) {
		    addCriterion("own_id not in", values, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdBetween(Long value1, Long value2) {
		    addCriterion("own_id between", value1, value2, "ownId");
		    return (Criteria) this;
		}
	
		public Criteria andOwnIdNotBetween(Long value1, Long value2) {
		    addCriterion("own_id not between", value1, value2, "ownId");
		    return (Criteria) this;
		}
		
			
		public Criteria andStatusIsNull() {
		    addCriterion("status is null");
		    return (Criteria) this;
		}
	
		public Criteria andStatusIsNotNull() {
		    addCriterion("status is not null");
		    return (Criteria) this;
		}
	
		public Criteria andStatusEqualTo(Integer value) {
		    addCriterion("status =", value, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusNotEqualTo(Integer value) {
		    addCriterion("status <>", value, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusGreaterThan(Integer value) {
		    addCriterion("status >", value, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
		    addCriterion("status >=", value, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusLessThan(Integer value) {
		    addCriterion("status <", value, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusLessThanOrEqualTo(Integer value) {
		    addCriterion("status <=", value, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusIn(List<Integer> values) {
		    addCriterion("status in", values, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusNotIn(List<Integer> values) {
		    addCriterion("status not in", values, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusBetween(Integer value1, Integer value2) {
		    addCriterion("status between", value1, value2, "status");
		    return (Criteria) this;
		}
	
		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
		    addCriterion("status not between", value1, value2, "status");
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