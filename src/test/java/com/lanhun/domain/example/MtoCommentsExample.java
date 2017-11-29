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
 * @date 2016-01-12 16:11:46
 * @version
 */
public class MtoCommentsExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoCommentsExample() {
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
		
			
		public Criteria andToIdIsNull() {
		    addCriterion("to_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andToIdIsNotNull() {
		    addCriterion("to_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andToIdEqualTo(Long value) {
		    addCriterion("to_id =", value, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdNotEqualTo(Long value) {
		    addCriterion("to_id <>", value, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdGreaterThan(Long value) {
		    addCriterion("to_id >", value, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("to_id >=", value, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdLessThan(Long value) {
		    addCriterion("to_id <", value, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdLessThanOrEqualTo(Long value) {
		    addCriterion("to_id <=", value, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdIn(List<Long> values) {
		    addCriterion("to_id in", values, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdNotIn(List<Long> values) {
		    addCriterion("to_id not in", values, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdBetween(Long value1, Long value2) {
		    addCriterion("to_id between", value1, value2, "toId");
		    return (Criteria) this;
		}
	
		public Criteria andToIdNotBetween(Long value1, Long value2) {
		    addCriterion("to_id not between", value1, value2, "toId");
		    return (Criteria) this;
		}
		
			
		public Criteria andPidIsNull() {
		    addCriterion("pid is null");
		    return (Criteria) this;
		}
	
		public Criteria andPidIsNotNull() {
		    addCriterion("pid is not null");
		    return (Criteria) this;
		}
	
		public Criteria andPidEqualTo(Long value) {
		    addCriterion("pid =", value, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidNotEqualTo(Long value) {
		    addCriterion("pid <>", value, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidGreaterThan(Long value) {
		    addCriterion("pid >", value, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidGreaterThanOrEqualTo(Long value) {
		    addCriterion("pid >=", value, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidLessThan(Long value) {
		    addCriterion("pid <", value, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidLessThanOrEqualTo(Long value) {
		    addCriterion("pid <=", value, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidIn(List<Long> values) {
		    addCriterion("pid in", values, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidNotIn(List<Long> values) {
		    addCriterion("pid not in", values, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidBetween(Long value1, Long value2) {
		    addCriterion("pid between", value1, value2, "pid");
		    return (Criteria) this;
		}
	
		public Criteria andPidNotBetween(Long value1, Long value2) {
		    addCriterion("pid not between", value1, value2, "pid");
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
		
			
		public Criteria andAuthorIdIsNull() {
		    addCriterion("author_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdIsNotNull() {
		    addCriterion("author_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdEqualTo(Long value) {
		    addCriterion("author_id =", value, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdNotEqualTo(Long value) {
		    addCriterion("author_id <>", value, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdGreaterThan(Long value) {
		    addCriterion("author_id >", value, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("author_id >=", value, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdLessThan(Long value) {
		    addCriterion("author_id <", value, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdLessThanOrEqualTo(Long value) {
		    addCriterion("author_id <=", value, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdIn(List<Long> values) {
		    addCriterion("author_id in", values, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdNotIn(List<Long> values) {
		    addCriterion("author_id not in", values, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdBetween(Long value1, Long value2) {
		    addCriterion("author_id between", value1, value2, "authorId");
		    return (Criteria) this;
		}
	
		public Criteria andAuthorIdNotBetween(Long value1, Long value2) {
		    addCriterion("author_id not between", value1, value2, "authorId");
		    return (Criteria) this;
		}
		
			
		public Criteria andContentIsNull() {
		    addCriterion("content is null");
		    return (Criteria) this;
		}
	
		public Criteria andContentIsNotNull() {
		    addCriterion("content is not null");
		    return (Criteria) this;
		}
	
		public Criteria andContentEqualTo(String value) {
		    addCriterion("content =", value, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentNotEqualTo(String value) {
		    addCriterion("content <>", value, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentGreaterThan(String value) {
		    addCriterion("content >", value, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentGreaterThanOrEqualTo(String value) {
		    addCriterion("content >=", value, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentLessThan(String value) {
		    addCriterion("content <", value, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentLessThanOrEqualTo(String value) {
		    addCriterion("content <=", value, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentIn(List<String> values) {
		    addCriterion("content in", values, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentNotIn(List<String> values) {
		    addCriterion("content not in", values, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentBetween(String value1, String value2) {
		    addCriterion("content between", value1, value2, "content");
		    return (Criteria) this;
		}
	
		public Criteria andContentNotBetween(String value1, String value2) {
		    addCriterion("content not between", value1, value2, "content");
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