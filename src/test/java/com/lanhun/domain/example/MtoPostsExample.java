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
public class MtoPostsExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoPostsExample() {
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
			
		public Criteria andSummaryIsNull() {
		    addCriterion("summary is null");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryIsNotNull() {
		    addCriterion("summary is not null");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryEqualTo(String value) {
		    addCriterion("summary =", value, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryNotEqualTo(String value) {
		    addCriterion("summary <>", value, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryGreaterThan(String value) {
		    addCriterion("summary >", value, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryGreaterThanOrEqualTo(String value) {
		    addCriterion("summary >=", value, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryLessThan(String value) {
		    addCriterion("summary <", value, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryLessThanOrEqualTo(String value) {
		    addCriterion("summary <=", value, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryIn(List<String> values) {
		    addCriterion("summary in", values, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryNotIn(List<String> values) {
		    addCriterion("summary not in", values, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryBetween(String value1, String value2) {
		    addCriterion("summary between", value1, value2, "summary");
		    return (Criteria) this;
		}
	
		public Criteria andSummaryNotBetween(String value1, String value2) {
		    addCriterion("summary not between", value1, value2, "summary");
		    return (Criteria) this;
		}
		
			
		public Criteria andEditorIsNull() {
		    addCriterion("editor is null");
		    return (Criteria) this;
		}
	
		public Criteria andEditorIsNotNull() {
		    addCriterion("editor is not null");
		    return (Criteria) this;
		}
	
		public Criteria andEditorEqualTo(String value) {
		    addCriterion("editor =", value, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorNotEqualTo(String value) {
		    addCriterion("editor <>", value, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorGreaterThan(String value) {
		    addCriterion("editor >", value, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorGreaterThanOrEqualTo(String value) {
		    addCriterion("editor >=", value, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorLessThan(String value) {
		    addCriterion("editor <", value, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorLessThanOrEqualTo(String value) {
		    addCriterion("editor <=", value, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorIn(List<String> values) {
		    addCriterion("editor in", values, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorNotIn(List<String> values) {
		    addCriterion("editor not in", values, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorBetween(String value1, String value2) {
		    addCriterion("editor between", value1, value2, "editor");
		    return (Criteria) this;
		}
	
		public Criteria andEditorNotBetween(String value1, String value2) {
		    addCriterion("editor not between", value1, value2, "editor");
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
		
			
		public Criteria andImagesIsNull() {
		    addCriterion("images is null");
		    return (Criteria) this;
		}
	
		public Criteria andImagesIsNotNull() {
		    addCriterion("images is not null");
		    return (Criteria) this;
		}
	
		public Criteria andImagesEqualTo(Integer value) {
		    addCriterion("images =", value, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesNotEqualTo(Integer value) {
		    addCriterion("images <>", value, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesGreaterThan(Integer value) {
		    addCriterion("images >", value, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesGreaterThanOrEqualTo(Integer value) {
		    addCriterion("images >=", value, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesLessThan(Integer value) {
		    addCriterion("images <", value, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesLessThanOrEqualTo(Integer value) {
		    addCriterion("images <=", value, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesIn(List<Integer> values) {
		    addCriterion("images in", values, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesNotIn(List<Integer> values) {
		    addCriterion("images not in", values, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesBetween(Integer value1, Integer value2) {
		    addCriterion("images between", value1, value2, "images");
		    return (Criteria) this;
		}
	
		public Criteria andImagesNotBetween(Integer value1, Integer value2) {
		    addCriterion("images not between", value1, value2, "images");
		    return (Criteria) this;
		}
		
			
		public Criteria andCommentsIsNull() {
		    addCriterion("comments is null");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsIsNotNull() {
		    addCriterion("comments is not null");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsEqualTo(Integer value) {
		    addCriterion("comments =", value, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsNotEqualTo(Integer value) {
		    addCriterion("comments <>", value, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsGreaterThan(Integer value) {
		    addCriterion("comments >", value, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsGreaterThanOrEqualTo(Integer value) {
		    addCriterion("comments >=", value, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsLessThan(Integer value) {
		    addCriterion("comments <", value, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsLessThanOrEqualTo(Integer value) {
		    addCriterion("comments <=", value, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsIn(List<Integer> values) {
		    addCriterion("comments in", values, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsNotIn(List<Integer> values) {
		    addCriterion("comments not in", values, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsBetween(Integer value1, Integer value2) {
		    addCriterion("comments between", value1, value2, "comments");
		    return (Criteria) this;
		}
	
		public Criteria andCommentsNotBetween(Integer value1, Integer value2) {
		    addCriterion("comments not between", value1, value2, "comments");
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
		
			
		public Criteria andFavorsIsNull() {
		    addCriterion("favors is null");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsIsNotNull() {
		    addCriterion("favors is not null");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsEqualTo(Integer value) {
		    addCriterion("favors =", value, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsNotEqualTo(Integer value) {
		    addCriterion("favors <>", value, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsGreaterThan(Integer value) {
		    addCriterion("favors >", value, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsGreaterThanOrEqualTo(Integer value) {
		    addCriterion("favors >=", value, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsLessThan(Integer value) {
		    addCriterion("favors <", value, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsLessThanOrEqualTo(Integer value) {
		    addCriterion("favors <=", value, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsIn(List<Integer> values) {
		    addCriterion("favors in", values, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsNotIn(List<Integer> values) {
		    addCriterion("favors not in", values, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsBetween(Integer value1, Integer value2) {
		    addCriterion("favors between", value1, value2, "favors");
		    return (Criteria) this;
		}
	
		public Criteria andFavorsNotBetween(Integer value1, Integer value2) {
		    addCriterion("favors not between", value1, value2, "favors");
		    return (Criteria) this;
		}
		
			
		public Criteria andPrivacyIsNull() {
		    addCriterion("privacy is null");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyIsNotNull() {
		    addCriterion("privacy is not null");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyEqualTo(Integer value) {
		    addCriterion("privacy =", value, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyNotEqualTo(Integer value) {
		    addCriterion("privacy <>", value, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyGreaterThan(Integer value) {
		    addCriterion("privacy >", value, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyGreaterThanOrEqualTo(Integer value) {
		    addCriterion("privacy >=", value, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyLessThan(Integer value) {
		    addCriterion("privacy <", value, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyLessThanOrEqualTo(Integer value) {
		    addCriterion("privacy <=", value, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyIn(List<Integer> values) {
		    addCriterion("privacy in", values, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyNotIn(List<Integer> values) {
		    addCriterion("privacy not in", values, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyBetween(Integer value1, Integer value2) {
		    addCriterion("privacy between", value1, value2, "privacy");
		    return (Criteria) this;
		}
	
		public Criteria andPrivacyNotBetween(Integer value1, Integer value2) {
		    addCriterion("privacy not between", value1, value2, "privacy");
		    return (Criteria) this;
		}
		
			
		public Criteria andLastImageIdIsNull() {
		    addCriterion("last_image_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdIsNotNull() {
		    addCriterion("last_image_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdEqualTo(Long value) {
		    addCriterion("last_image_id =", value, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdNotEqualTo(Long value) {
		    addCriterion("last_image_id <>", value, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdGreaterThan(Long value) {
		    addCriterion("last_image_id >", value, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("last_image_id >=", value, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdLessThan(Long value) {
		    addCriterion("last_image_id <", value, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdLessThanOrEqualTo(Long value) {
		    addCriterion("last_image_id <=", value, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdIn(List<Long> values) {
		    addCriterion("last_image_id in", values, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdNotIn(List<Long> values) {
		    addCriterion("last_image_id not in", values, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdBetween(Long value1, Long value2) {
		    addCriterion("last_image_id between", value1, value2, "lastImageId");
		    return (Criteria) this;
		}
	
		public Criteria andLastImageIdNotBetween(Long value1, Long value2) {
		    addCriterion("last_image_id not between", value1, value2, "lastImageId");
		    return (Criteria) this;
		}
		
			
		public Criteria andTitleIsNull() {
		    addCriterion("title is null");
		    return (Criteria) this;
		}
	
		public Criteria andTitleIsNotNull() {
		    addCriterion("title is not null");
		    return (Criteria) this;
		}
	
		public Criteria andTitleEqualTo(String value) {
		    addCriterion("title =", value, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleNotEqualTo(String value) {
		    addCriterion("title <>", value, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleGreaterThan(String value) {
		    addCriterion("title >", value, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleGreaterThanOrEqualTo(String value) {
		    addCriterion("title >=", value, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleLessThan(String value) {
		    addCriterion("title <", value, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleLessThanOrEqualTo(String value) {
		    addCriterion("title <=", value, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleIn(List<String> values) {
		    addCriterion("title in", values, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleNotIn(List<String> values) {
		    addCriterion("title not in", values, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleBetween(String value1, String value2) {
		    addCriterion("title between", value1, value2, "title");
		    return (Criteria) this;
		}
	
		public Criteria andTitleNotBetween(String value1, String value2) {
		    addCriterion("title not between", value1, value2, "title");
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
		
			
		public Criteria andTagsIsNull() {
		    addCriterion("tags is null");
		    return (Criteria) this;
		}
	
		public Criteria andTagsIsNotNull() {
		    addCriterion("tags is not null");
		    return (Criteria) this;
		}
	
		public Criteria andTagsEqualTo(String value) {
		    addCriterion("tags =", value, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsNotEqualTo(String value) {
		    addCriterion("tags <>", value, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsGreaterThan(String value) {
		    addCriterion("tags >", value, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsGreaterThanOrEqualTo(String value) {
		    addCriterion("tags >=", value, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsLessThan(String value) {
		    addCriterion("tags <", value, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsLessThanOrEqualTo(String value) {
		    addCriterion("tags <=", value, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsIn(List<String> values) {
		    addCriterion("tags in", values, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsNotIn(List<String> values) {
		    addCriterion("tags not in", values, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsBetween(String value1, String value2) {
		    addCriterion("tags between", value1, value2, "tags");
		    return (Criteria) this;
		}
	
		public Criteria andTagsNotBetween(String value1, String value2) {
		    addCriterion("tags not between", value1, value2, "tags");
		    return (Criteria) this;
		}
		
			
		public Criteria andMarkdownIsNull() {
		    addCriterion("markdown is null");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownIsNotNull() {
		    addCriterion("markdown is not null");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownEqualTo(String value) {
		    addCriterion("markdown =", value, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownNotEqualTo(String value) {
		    addCriterion("markdown <>", value, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownGreaterThan(String value) {
		    addCriterion("markdown >", value, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownGreaterThanOrEqualTo(String value) {
		    addCriterion("markdown >=", value, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownLessThan(String value) {
		    addCriterion("markdown <", value, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownLessThanOrEqualTo(String value) {
		    addCriterion("markdown <=", value, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownIn(List<String> values) {
		    addCriterion("markdown in", values, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownNotIn(List<String> values) {
		    addCriterion("markdown not in", values, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownBetween(String value1, String value2) {
		    addCriterion("markdown between", value1, value2, "markdown");
		    return (Criteria) this;
		}
	
		public Criteria andMarkdownNotBetween(String value1, String value2) {
		    addCriterion("markdown not between", value1, value2, "markdown");
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
		
			
		public Criteria andGroupIsNull() {
		    addCriterion("group_ is null");
		    return (Criteria) this;
		}
	
		public Criteria andGroupIsNotNull() {
		    addCriterion("group_ is not null");
		    return (Criteria) this;
		}
	
		public Criteria andGroupEqualTo(Integer value) {
		    addCriterion("group_ =", value, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupNotEqualTo(Integer value) {
		    addCriterion("group_ <>", value, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupGreaterThan(Integer value) {
		    addCriterion("group_ >", value, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupGreaterThanOrEqualTo(Integer value) {
		    addCriterion("group_ >=", value, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupLessThan(Integer value) {
		    addCriterion("group_ <", value, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupLessThanOrEqualTo(Integer value) {
		    addCriterion("group_ <=", value, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupIn(List<Integer> values) {
		    addCriterion("group_ in", values, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupNotIn(List<Integer> values) {
		    addCriterion("group_ not in", values, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupBetween(Integer value1, Integer value2) {
		    addCriterion("group_ between", value1, value2, "group");
		    return (Criteria) this;
		}
	
		public Criteria andGroupNotBetween(Integer value1, Integer value2) {
		    addCriterion("group_ not between", value1, value2, "group");
		    return (Criteria) this;
		}
		
			
		public Criteria andViewsIsNull() {
		    addCriterion("views is null");
		    return (Criteria) this;
		}
	
		public Criteria andViewsIsNotNull() {
		    addCriterion("views is not null");
		    return (Criteria) this;
		}
	
		public Criteria andViewsEqualTo(Integer value) {
		    addCriterion("views =", value, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsNotEqualTo(Integer value) {
		    addCriterion("views <>", value, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsGreaterThan(Integer value) {
		    addCriterion("views >", value, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
		    addCriterion("views >=", value, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsLessThan(Integer value) {
		    addCriterion("views <", value, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsLessThanOrEqualTo(Integer value) {
		    addCriterion("views <=", value, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsIn(List<Integer> values) {
		    addCriterion("views in", values, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsNotIn(List<Integer> values) {
		    addCriterion("views not in", values, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsBetween(Integer value1, Integer value2) {
		    addCriterion("views between", value1, value2, "views");
		    return (Criteria) this;
		}
	
		public Criteria andViewsNotBetween(Integer value1, Integer value2) {
		    addCriterion("views not between", value1, value2, "views");
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