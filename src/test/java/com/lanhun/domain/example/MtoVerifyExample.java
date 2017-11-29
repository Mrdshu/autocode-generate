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
public class MtoVerifyExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoVerifyExample() {
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
			
		public Criteria andCodeIsNull() {
		    addCriterion("code is null");
		    return (Criteria) this;
		}
	
		public Criteria andCodeIsNotNull() {
		    addCriterion("code is not null");
		    return (Criteria) this;
		}
	
		public Criteria andCodeEqualTo(String value) {
		    addCriterion("code =", value, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeNotEqualTo(String value) {
		    addCriterion("code <>", value, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeGreaterThan(String value) {
		    addCriterion("code >", value, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeGreaterThanOrEqualTo(String value) {
		    addCriterion("code >=", value, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeLessThan(String value) {
		    addCriterion("code <", value, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeLessThanOrEqualTo(String value) {
		    addCriterion("code <=", value, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeIn(List<String> values) {
		    addCriterion("code in", values, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeNotIn(List<String> values) {
		    addCriterion("code not in", values, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeBetween(String value1, String value2) {
		    addCriterion("code between", value1, value2, "code");
		    return (Criteria) this;
		}
	
		public Criteria andCodeNotBetween(String value1, String value2) {
		    addCriterion("code not between", value1, value2, "code");
		    return (Criteria) this;
		}
		
			
		public Criteria andExpiredIsNull() {
		    addCriterion("expired is null");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredIsNotNull() {
		    addCriterion("expired is not null");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredEqualTo(Date value) {
		    addCriterion("expired =", value, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredNotEqualTo(Date value) {
		    addCriterion("expired <>", value, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredGreaterThan(Date value) {
		    addCriterion("expired >", value, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredGreaterThanOrEqualTo(Date value) {
		    addCriterion("expired >=", value, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredLessThan(Date value) {
		    addCriterion("expired <", value, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredLessThanOrEqualTo(Date value) {
		    addCriterion("expired <=", value, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredIn(List<Date> values) {
		    addCriterion("expired in", values, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredNotIn(List<Date> values) {
		    addCriterion("expired not in", values, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredBetween(Date value1, Date value2) {
		    addCriterion("expired between", value1, value2, "expired");
		    return (Criteria) this;
		}
	
		public Criteria andExpiredNotBetween(Date value1, Date value2) {
		    addCriterion("expired not between", value1, value2, "expired");
		    return (Criteria) this;
		}
		
			
		public Criteria andUserIdIsNull() {
		    addCriterion("user_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdIsNotNull() {
		    addCriterion("user_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdEqualTo(Long value) {
		    addCriterion("user_id =", value, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdNotEqualTo(Long value) {
		    addCriterion("user_id <>", value, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdGreaterThan(Long value) {
		    addCriterion("user_id >", value, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("user_id >=", value, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdLessThan(Long value) {
		    addCriterion("user_id <", value, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdLessThanOrEqualTo(Long value) {
		    addCriterion("user_id <=", value, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdIn(List<Long> values) {
		    addCriterion("user_id in", values, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdNotIn(List<Long> values) {
		    addCriterion("user_id not in", values, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdBetween(Long value1, Long value2) {
		    addCriterion("user_id between", value1, value2, "userId");
		    return (Criteria) this;
		}
	
		public Criteria andUserIdNotBetween(Long value1, Long value2) {
		    addCriterion("user_id not between", value1, value2, "userId");
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
		
			
		public Criteria andTypeIsNull() {
		    addCriterion("type is null");
		    return (Criteria) this;
		}
	
		public Criteria andTypeIsNotNull() {
		    addCriterion("type is not null");
		    return (Criteria) this;
		}
	
		public Criteria andTypeEqualTo(Integer value) {
		    addCriterion("type =", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeNotEqualTo(Integer value) {
		    addCriterion("type <>", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeGreaterThan(Integer value) {
		    addCriterion("type >", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
		    addCriterion("type >=", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeLessThan(Integer value) {
		    addCriterion("type <", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeLessThanOrEqualTo(Integer value) {
		    addCriterion("type <=", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeIn(List<Integer> values) {
		    addCriterion("type in", values, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeNotIn(List<Integer> values) {
		    addCriterion("type not in", values, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeBetween(Integer value1, Integer value2) {
		    addCriterion("type between", value1, value2, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
		    addCriterion("type not between", value1, value2, "type");
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
		
			
		public Criteria andTargetIsNull() {
		    addCriterion("target is null");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIsNotNull() {
		    addCriterion("target is not null");
		    return (Criteria) this;
		}
	
		public Criteria andTargetEqualTo(String value) {
		    addCriterion("target =", value, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetNotEqualTo(String value) {
		    addCriterion("target <>", value, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetGreaterThan(String value) {
		    addCriterion("target >", value, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetGreaterThanOrEqualTo(String value) {
		    addCriterion("target >=", value, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetLessThan(String value) {
		    addCriterion("target <", value, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetLessThanOrEqualTo(String value) {
		    addCriterion("target <=", value, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIn(List<String> values) {
		    addCriterion("target in", values, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetNotIn(List<String> values) {
		    addCriterion("target not in", values, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetBetween(String value1, String value2) {
		    addCriterion("target between", value1, value2, "target");
		    return (Criteria) this;
		}
	
		public Criteria andTargetNotBetween(String value1, String value2) {
		    addCriterion("target not between", value1, value2, "target");
		    return (Criteria) this;
		}
		
			
		public Criteria andTokenIsNull() {
		    addCriterion("token is null");
		    return (Criteria) this;
		}
	
		public Criteria andTokenIsNotNull() {
		    addCriterion("token is not null");
		    return (Criteria) this;
		}
	
		public Criteria andTokenEqualTo(String value) {
		    addCriterion("token =", value, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenNotEqualTo(String value) {
		    addCriterion("token <>", value, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenGreaterThan(String value) {
		    addCriterion("token >", value, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenGreaterThanOrEqualTo(String value) {
		    addCriterion("token >=", value, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenLessThan(String value) {
		    addCriterion("token <", value, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenLessThanOrEqualTo(String value) {
		    addCriterion("token <=", value, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenIn(List<String> values) {
		    addCriterion("token in", values, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenNotIn(List<String> values) {
		    addCriterion("token not in", values, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenBetween(String value1, String value2) {
		    addCriterion("token between", value1, value2, "token");
		    return (Criteria) this;
		}
	
		public Criteria andTokenNotBetween(String value1, String value2) {
		    addCriterion("token not between", value1, value2, "token");
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