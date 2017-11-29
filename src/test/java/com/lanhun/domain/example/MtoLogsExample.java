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
public class MtoLogsExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoLogsExample() {
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
		
			
		public Criteria andIpIsNull() {
		    addCriterion("ip is null");
		    return (Criteria) this;
		}
	
		public Criteria andIpIsNotNull() {
		    addCriterion("ip is not null");
		    return (Criteria) this;
		}
	
		public Criteria andIpEqualTo(String value) {
		    addCriterion("ip =", value, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpNotEqualTo(String value) {
		    addCriterion("ip <>", value, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpGreaterThan(String value) {
		    addCriterion("ip >", value, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpGreaterThanOrEqualTo(String value) {
		    addCriterion("ip >=", value, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpLessThan(String value) {
		    addCriterion("ip <", value, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpLessThanOrEqualTo(String value) {
		    addCriterion("ip <=", value, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpIn(List<String> values) {
		    addCriterion("ip in", values, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpNotIn(List<String> values) {
		    addCriterion("ip not in", values, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpBetween(String value1, String value2) {
		    addCriterion("ip between", value1, value2, "ip");
		    return (Criteria) this;
		}
	
		public Criteria andIpNotBetween(String value1, String value2) {
		    addCriterion("ip not between", value1, value2, "ip");
		    return (Criteria) this;
		}
		
			
		public Criteria andTargetIdIsNull() {
		    addCriterion("target_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdIsNotNull() {
		    addCriterion("target_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdEqualTo(Long value) {
		    addCriterion("target_id =", value, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdNotEqualTo(Long value) {
		    addCriterion("target_id <>", value, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdGreaterThan(Long value) {
		    addCriterion("target_id >", value, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("target_id >=", value, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdLessThan(Long value) {
		    addCriterion("target_id <", value, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdLessThanOrEqualTo(Long value) {
		    addCriterion("target_id <=", value, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdIn(List<Long> values) {
		    addCriterion("target_id in", values, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdNotIn(List<Long> values) {
		    addCriterion("target_id not in", values, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdBetween(Long value1, Long value2) {
		    addCriterion("target_id between", value1, value2, "targetId");
		    return (Criteria) this;
		}
	
		public Criteria andTargetIdNotBetween(Long value1, Long value2) {
		    addCriterion("target_id not between", value1, value2, "targetId");
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