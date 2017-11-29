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
public class MtoGroupExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoGroupExample() {
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
			
		public Criteria andTemplateIsNull() {
		    addCriterion("template is null");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateIsNotNull() {
		    addCriterion("template is not null");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateEqualTo(String value) {
		    addCriterion("template =", value, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateNotEqualTo(String value) {
		    addCriterion("template <>", value, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateGreaterThan(String value) {
		    addCriterion("template >", value, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateGreaterThanOrEqualTo(String value) {
		    addCriterion("template >=", value, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateLessThan(String value) {
		    addCriterion("template <", value, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateLessThanOrEqualTo(String value) {
		    addCriterion("template <=", value, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateIn(List<String> values) {
		    addCriterion("template in", values, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateNotIn(List<String> values) {
		    addCriterion("template not in", values, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateBetween(String value1, String value2) {
		    addCriterion("template between", value1, value2, "template");
		    return (Criteria) this;
		}
	
		public Criteria andTemplateNotBetween(String value1, String value2) {
		    addCriterion("template not between", value1, value2, "template");
		    return (Criteria) this;
		}
		
			
		public Criteria andKeyIsNull() {
		    addCriterion("key_ is null");
		    return (Criteria) this;
		}
	
		public Criteria andKeyIsNotNull() {
		    addCriterion("key_ is not null");
		    return (Criteria) this;
		}
	
		public Criteria andKeyEqualTo(String value) {
		    addCriterion("key_ =", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyNotEqualTo(String value) {
		    addCriterion("key_ <>", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyGreaterThan(String value) {
		    addCriterion("key_ >", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyGreaterThanOrEqualTo(String value) {
		    addCriterion("key_ >=", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyLessThan(String value) {
		    addCriterion("key_ <", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyLessThanOrEqualTo(String value) {
		    addCriterion("key_ <=", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyIn(List<String> values) {
		    addCriterion("key_ in", values, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyNotIn(List<String> values) {
		    addCriterion("key_ not in", values, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyBetween(String value1, String value2) {
		    addCriterion("key_ between", value1, value2, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyNotBetween(String value1, String value2) {
		    addCriterion("key_ not between", value1, value2, "key");
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
		
			
		public Criteria andIconIsNull() {
		    addCriterion("icon is null");
		    return (Criteria) this;
		}
	
		public Criteria andIconIsNotNull() {
		    addCriterion("icon is not null");
		    return (Criteria) this;
		}
	
		public Criteria andIconEqualTo(String value) {
		    addCriterion("icon =", value, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconNotEqualTo(String value) {
		    addCriterion("icon <>", value, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconGreaterThan(String value) {
		    addCriterion("icon >", value, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconGreaterThanOrEqualTo(String value) {
		    addCriterion("icon >=", value, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconLessThan(String value) {
		    addCriterion("icon <", value, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconLessThanOrEqualTo(String value) {
		    addCriterion("icon <=", value, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconIn(List<String> values) {
		    addCriterion("icon in", values, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconNotIn(List<String> values) {
		    addCriterion("icon not in", values, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconBetween(String value1, String value2) {
		    addCriterion("icon between", value1, value2, "icon");
		    return (Criteria) this;
		}
	
		public Criteria andIconNotBetween(String value1, String value2) {
		    addCriterion("icon not between", value1, value2, "icon");
		    return (Criteria) this;
		}
		
			
		public Criteria andAliasIsNull() {
		    addCriterion("alias is null");
		    return (Criteria) this;
		}
	
		public Criteria andAliasIsNotNull() {
		    addCriterion("alias is not null");
		    return (Criteria) this;
		}
	
		public Criteria andAliasEqualTo(String value) {
		    addCriterion("alias =", value, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasNotEqualTo(String value) {
		    addCriterion("alias <>", value, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasGreaterThan(String value) {
		    addCriterion("alias >", value, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasGreaterThanOrEqualTo(String value) {
		    addCriterion("alias >=", value, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasLessThan(String value) {
		    addCriterion("alias <", value, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasLessThanOrEqualTo(String value) {
		    addCriterion("alias <=", value, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasIn(List<String> values) {
		    addCriterion("alias in", values, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasNotIn(List<String> values) {
		    addCriterion("alias not in", values, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasBetween(String value1, String value2) {
		    addCriterion("alias between", value1, value2, "alias");
		    return (Criteria) this;
		}
	
		public Criteria andAliasNotBetween(String value1, String value2) {
		    addCriterion("alias not between", value1, value2, "alias");
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
	
		public Criteria andIdEqualTo(Integer value) {
		    addCriterion("id =", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotEqualTo(Integer value) {
		    addCriterion("id <>", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdGreaterThan(Integer value) {
		    addCriterion("id >", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
		    addCriterion("id >=", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdLessThan(Integer value) {
		    addCriterion("id <", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdLessThanOrEqualTo(Integer value) {
		    addCriterion("id <=", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdIn(List<Integer> values) {
		    addCriterion("id in", values, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotIn(List<Integer> values) {
		    addCriterion("id not in", values, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdBetween(Integer value1, Integer value2) {
		    addCriterion("id between", value1, value2, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotBetween(Integer value1, Integer value2) {
		    addCriterion("id not between", value1, value2, "id");
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