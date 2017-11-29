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
public class MtoAttachsExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoAttachsExample() {
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
			
		public Criteria andPreviewIsNull() {
		    addCriterion("preview is null");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewIsNotNull() {
		    addCriterion("preview is not null");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewEqualTo(String value) {
		    addCriterion("preview =", value, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewNotEqualTo(String value) {
		    addCriterion("preview <>", value, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewGreaterThan(String value) {
		    addCriterion("preview >", value, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewGreaterThanOrEqualTo(String value) {
		    addCriterion("preview >=", value, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewLessThan(String value) {
		    addCriterion("preview <", value, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewLessThanOrEqualTo(String value) {
		    addCriterion("preview <=", value, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewIn(List<String> values) {
		    addCriterion("preview in", values, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewNotIn(List<String> values) {
		    addCriterion("preview not in", values, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewBetween(String value1, String value2) {
		    addCriterion("preview between", value1, value2, "preview");
		    return (Criteria) this;
		}
	
		public Criteria andPreviewNotBetween(String value1, String value2) {
		    addCriterion("preview not between", value1, value2, "preview");
		    return (Criteria) this;
		}
		
			
		public Criteria andOriginalIsNull() {
		    addCriterion("original is null");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalIsNotNull() {
		    addCriterion("original is not null");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalEqualTo(String value) {
		    addCriterion("original =", value, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalNotEqualTo(String value) {
		    addCriterion("original <>", value, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalGreaterThan(String value) {
		    addCriterion("original >", value, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalGreaterThanOrEqualTo(String value) {
		    addCriterion("original >=", value, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalLessThan(String value) {
		    addCriterion("original <", value, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalLessThanOrEqualTo(String value) {
		    addCriterion("original <=", value, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalIn(List<String> values) {
		    addCriterion("original in", values, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalNotIn(List<String> values) {
		    addCriterion("original not in", values, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalBetween(String value1, String value2) {
		    addCriterion("original between", value1, value2, "original");
		    return (Criteria) this;
		}
	
		public Criteria andOriginalNotBetween(String value1, String value2) {
		    addCriterion("original not between", value1, value2, "original");
		    return (Criteria) this;
		}
		
			
		public Criteria andWidthIsNull() {
		    addCriterion("width is null");
		    return (Criteria) this;
		}
	
		public Criteria andWidthIsNotNull() {
		    addCriterion("width is not null");
		    return (Criteria) this;
		}
	
		public Criteria andWidthEqualTo(Integer value) {
		    addCriterion("width =", value, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthNotEqualTo(Integer value) {
		    addCriterion("width <>", value, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthGreaterThan(Integer value) {
		    addCriterion("width >", value, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
		    addCriterion("width >=", value, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthLessThan(Integer value) {
		    addCriterion("width <", value, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthLessThanOrEqualTo(Integer value) {
		    addCriterion("width <=", value, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthIn(List<Integer> values) {
		    addCriterion("width in", values, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthNotIn(List<Integer> values) {
		    addCriterion("width not in", values, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthBetween(Integer value1, Integer value2) {
		    addCriterion("width between", value1, value2, "width");
		    return (Criteria) this;
		}
	
		public Criteria andWidthNotBetween(Integer value1, Integer value2) {
		    addCriterion("width not between", value1, value2, "width");
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
		
			
		public Criteria andScreenshotIsNull() {
		    addCriterion("screenshot is null");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotIsNotNull() {
		    addCriterion("screenshot is not null");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotEqualTo(String value) {
		    addCriterion("screenshot =", value, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotNotEqualTo(String value) {
		    addCriterion("screenshot <>", value, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotGreaterThan(String value) {
		    addCriterion("screenshot >", value, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotGreaterThanOrEqualTo(String value) {
		    addCriterion("screenshot >=", value, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotLessThan(String value) {
		    addCriterion("screenshot <", value, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotLessThanOrEqualTo(String value) {
		    addCriterion("screenshot <=", value, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotIn(List<String> values) {
		    addCriterion("screenshot in", values, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotNotIn(List<String> values) {
		    addCriterion("screenshot not in", values, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotBetween(String value1, String value2) {
		    addCriterion("screenshot between", value1, value2, "screenshot");
		    return (Criteria) this;
		}
	
		public Criteria andScreenshotNotBetween(String value1, String value2) {
		    addCriterion("screenshot not between", value1, value2, "screenshot");
		    return (Criteria) this;
		}
		
			
		public Criteria andStoreIsNull() {
		    addCriterion("store is null");
		    return (Criteria) this;
		}
	
		public Criteria andStoreIsNotNull() {
		    addCriterion("store is not null");
		    return (Criteria) this;
		}
	
		public Criteria andStoreEqualTo(Integer value) {
		    addCriterion("store =", value, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreNotEqualTo(Integer value) {
		    addCriterion("store <>", value, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreGreaterThan(Integer value) {
		    addCriterion("store >", value, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreGreaterThanOrEqualTo(Integer value) {
		    addCriterion("store >=", value, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreLessThan(Integer value) {
		    addCriterion("store <", value, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreLessThanOrEqualTo(Integer value) {
		    addCriterion("store <=", value, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreIn(List<Integer> values) {
		    addCriterion("store in", values, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreNotIn(List<Integer> values) {
		    addCriterion("store not in", values, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreBetween(Integer value1, Integer value2) {
		    addCriterion("store between", value1, value2, "store");
		    return (Criteria) this;
		}
	
		public Criteria andStoreNotBetween(Integer value1, Integer value2) {
		    addCriterion("store not between", value1, value2, "store");
		    return (Criteria) this;
		}
		
			
		public Criteria andHeightIsNull() {
		    addCriterion("height is null");
		    return (Criteria) this;
		}
	
		public Criteria andHeightIsNotNull() {
		    addCriterion("height is not null");
		    return (Criteria) this;
		}
	
		public Criteria andHeightEqualTo(Integer value) {
		    addCriterion("height =", value, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightNotEqualTo(Integer value) {
		    addCriterion("height <>", value, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightGreaterThan(Integer value) {
		    addCriterion("height >", value, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
		    addCriterion("height >=", value, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightLessThan(Integer value) {
		    addCriterion("height <", value, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightLessThanOrEqualTo(Integer value) {
		    addCriterion("height <=", value, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightIn(List<Integer> values) {
		    addCriterion("height in", values, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightNotIn(List<Integer> values) {
		    addCriterion("height not in", values, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightBetween(Integer value1, Integer value2) {
		    addCriterion("height between", value1, value2, "height");
		    return (Criteria) this;
		}
	
		public Criteria andHeightNotBetween(Integer value1, Integer value2) {
		    addCriterion("height not between", value1, value2, "height");
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