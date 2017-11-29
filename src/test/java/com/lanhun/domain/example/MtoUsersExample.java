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
public class MtoUsersExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoUsersExample() {
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
		
			
		public Criteria andGenderIsNull() {
		    addCriterion("gender is null");
		    return (Criteria) this;
		}
	
		public Criteria andGenderIsNotNull() {
		    addCriterion("gender is not null");
		    return (Criteria) this;
		}
	
		public Criteria andGenderEqualTo(Integer value) {
		    addCriterion("gender =", value, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderNotEqualTo(Integer value) {
		    addCriterion("gender <>", value, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderGreaterThan(Integer value) {
		    addCriterion("gender >", value, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
		    addCriterion("gender >=", value, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderLessThan(Integer value) {
		    addCriterion("gender <", value, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderLessThanOrEqualTo(Integer value) {
		    addCriterion("gender <=", value, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderIn(List<Integer> values) {
		    addCriterion("gender in", values, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderNotIn(List<Integer> values) {
		    addCriterion("gender not in", values, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderBetween(Integer value1, Integer value2) {
		    addCriterion("gender between", value1, value2, "gender");
		    return (Criteria) this;
		}
	
		public Criteria andGenderNotBetween(Integer value1, Integer value2) {
		    addCriterion("gender not between", value1, value2, "gender");
		    return (Criteria) this;
		}
		
			
		public Criteria andSignatureIsNull() {
		    addCriterion("signature is null");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureIsNotNull() {
		    addCriterion("signature is not null");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureEqualTo(String value) {
		    addCriterion("signature =", value, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureNotEqualTo(String value) {
		    addCriterion("signature <>", value, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureGreaterThan(String value) {
		    addCriterion("signature >", value, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureGreaterThanOrEqualTo(String value) {
		    addCriterion("signature >=", value, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureLessThan(String value) {
		    addCriterion("signature <", value, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureLessThanOrEqualTo(String value) {
		    addCriterion("signature <=", value, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureIn(List<String> values) {
		    addCriterion("signature in", values, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureNotIn(List<String> values) {
		    addCriterion("signature not in", values, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureBetween(String value1, String value2) {
		    addCriterion("signature between", value1, value2, "signature");
		    return (Criteria) this;
		}
	
		public Criteria andSignatureNotBetween(String value1, String value2) {
		    addCriterion("signature not between", value1, value2, "signature");
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
		
			
		public Criteria andLastLoginIsNull() {
		    addCriterion("last_login is null");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginIsNotNull() {
		    addCriterion("last_login is not null");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginEqualTo(Date value) {
		    addCriterion("last_login =", value, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginNotEqualTo(Date value) {
		    addCriterion("last_login <>", value, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginGreaterThan(Date value) {
		    addCriterion("last_login >", value, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginGreaterThanOrEqualTo(Date value) {
		    addCriterion("last_login >=", value, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginLessThan(Date value) {
		    addCriterion("last_login <", value, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginLessThanOrEqualTo(Date value) {
		    addCriterion("last_login <=", value, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginIn(List<Date> values) {
		    addCriterion("last_login in", values, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginNotIn(List<Date> values) {
		    addCriterion("last_login not in", values, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginBetween(Date value1, Date value2) {
		    addCriterion("last_login between", value1, value2, "lastLogin");
		    return (Criteria) this;
		}
	
		public Criteria andLastLoginNotBetween(Date value1, Date value2) {
		    addCriterion("last_login not between", value1, value2, "lastLogin");
		    return (Criteria) this;
		}
		
			
		public Criteria andMobileIsNull() {
		    addCriterion("mobile is null");
		    return (Criteria) this;
		}
	
		public Criteria andMobileIsNotNull() {
		    addCriterion("mobile is not null");
		    return (Criteria) this;
		}
	
		public Criteria andMobileEqualTo(String value) {
		    addCriterion("mobile =", value, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileNotEqualTo(String value) {
		    addCriterion("mobile <>", value, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileGreaterThan(String value) {
		    addCriterion("mobile >", value, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileGreaterThanOrEqualTo(String value) {
		    addCriterion("mobile >=", value, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileLessThan(String value) {
		    addCriterion("mobile <", value, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileLessThanOrEqualTo(String value) {
		    addCriterion("mobile <=", value, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileIn(List<String> values) {
		    addCriterion("mobile in", values, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileNotIn(List<String> values) {
		    addCriterion("mobile not in", values, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileBetween(String value1, String value2) {
		    addCriterion("mobile between", value1, value2, "mobile");
		    return (Criteria) this;
		}
	
		public Criteria andMobileNotBetween(String value1, String value2) {
		    addCriterion("mobile not between", value1, value2, "mobile");
		    return (Criteria) this;
		}
		
			
		public Criteria andFollowsIsNull() {
		    addCriterion("follows is null");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsIsNotNull() {
		    addCriterion("follows is not null");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsEqualTo(Integer value) {
		    addCriterion("follows =", value, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsNotEqualTo(Integer value) {
		    addCriterion("follows <>", value, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsGreaterThan(Integer value) {
		    addCriterion("follows >", value, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsGreaterThanOrEqualTo(Integer value) {
		    addCriterion("follows >=", value, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsLessThan(Integer value) {
		    addCriterion("follows <", value, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsLessThanOrEqualTo(Integer value) {
		    addCriterion("follows <=", value, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsIn(List<Integer> values) {
		    addCriterion("follows in", values, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsNotIn(List<Integer> values) {
		    addCriterion("follows not in", values, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsBetween(Integer value1, Integer value2) {
		    addCriterion("follows between", value1, value2, "follows");
		    return (Criteria) this;
		}
	
		public Criteria andFollowsNotBetween(Integer value1, Integer value2) {
		    addCriterion("follows not between", value1, value2, "follows");
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
		
			
		public Criteria andAvatarIsNull() {
		    addCriterion("avatar is null");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarIsNotNull() {
		    addCriterion("avatar is not null");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarEqualTo(String value) {
		    addCriterion("avatar =", value, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarNotEqualTo(String value) {
		    addCriterion("avatar <>", value, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarGreaterThan(String value) {
		    addCriterion("avatar >", value, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarGreaterThanOrEqualTo(String value) {
		    addCriterion("avatar >=", value, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarLessThan(String value) {
		    addCriterion("avatar <", value, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarLessThanOrEqualTo(String value) {
		    addCriterion("avatar <=", value, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarIn(List<String> values) {
		    addCriterion("avatar in", values, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarNotIn(List<String> values) {
		    addCriterion("avatar not in", values, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarBetween(String value1, String value2) {
		    addCriterion("avatar between", value1, value2, "avatar");
		    return (Criteria) this;
		}
	
		public Criteria andAvatarNotBetween(String value1, String value2) {
		    addCriterion("avatar not between", value1, value2, "avatar");
		    return (Criteria) this;
		}
		
			
		public Criteria andSourceIsNull() {
		    addCriterion("source is null");
		    return (Criteria) this;
		}
	
		public Criteria andSourceIsNotNull() {
		    addCriterion("source is not null");
		    return (Criteria) this;
		}
	
		public Criteria andSourceEqualTo(Integer value) {
		    addCriterion("source =", value, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceNotEqualTo(Integer value) {
		    addCriterion("source <>", value, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceGreaterThan(Integer value) {
		    addCriterion("source >", value, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
		    addCriterion("source >=", value, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceLessThan(Integer value) {
		    addCriterion("source <", value, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceLessThanOrEqualTo(Integer value) {
		    addCriterion("source <=", value, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceIn(List<Integer> values) {
		    addCriterion("source in", values, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceNotIn(List<Integer> values) {
		    addCriterion("source not in", values, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceBetween(Integer value1, Integer value2) {
		    addCriterion("source between", value1, value2, "source");
		    return (Criteria) this;
		}
	
		public Criteria andSourceNotBetween(Integer value1, Integer value2) {
		    addCriterion("source not between", value1, value2, "source");
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
		
			
		public Criteria andFansIsNull() {
		    addCriterion("fans is null");
		    return (Criteria) this;
		}
	
		public Criteria andFansIsNotNull() {
		    addCriterion("fans is not null");
		    return (Criteria) this;
		}
	
		public Criteria andFansEqualTo(Integer value) {
		    addCriterion("fans =", value, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansNotEqualTo(Integer value) {
		    addCriterion("fans <>", value, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansGreaterThan(Integer value) {
		    addCriterion("fans >", value, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansGreaterThanOrEqualTo(Integer value) {
		    addCriterion("fans >=", value, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansLessThan(Integer value) {
		    addCriterion("fans <", value, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansLessThanOrEqualTo(Integer value) {
		    addCriterion("fans <=", value, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansIn(List<Integer> values) {
		    addCriterion("fans in", values, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansNotIn(List<Integer> values) {
		    addCriterion("fans not in", values, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansBetween(Integer value1, Integer value2) {
		    addCriterion("fans between", value1, value2, "fans");
		    return (Criteria) this;
		}
	
		public Criteria andFansNotBetween(Integer value1, Integer value2) {
		    addCriterion("fans not between", value1, value2, "fans");
		    return (Criteria) this;
		}
		
			
		public Criteria andPasswordIsNull() {
		    addCriterion("password is null");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordIsNotNull() {
		    addCriterion("password is not null");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordEqualTo(String value) {
		    addCriterion("password =", value, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordNotEqualTo(String value) {
		    addCriterion("password <>", value, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordGreaterThan(String value) {
		    addCriterion("password >", value, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
		    addCriterion("password >=", value, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordLessThan(String value) {
		    addCriterion("password <", value, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordLessThanOrEqualTo(String value) {
		    addCriterion("password <=", value, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordIn(List<String> values) {
		    addCriterion("password in", values, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordNotIn(List<String> values) {
		    addCriterion("password not in", values, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordBetween(String value1, String value2) {
		    addCriterion("password between", value1, value2, "password");
		    return (Criteria) this;
		}
	
		public Criteria andPasswordNotBetween(String value1, String value2) {
		    addCriterion("password not between", value1, value2, "password");
		    return (Criteria) this;
		}
		
			
		public Criteria andRoleIdIsNull() {
		    addCriterion("role_id is null");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdIsNotNull() {
		    addCriterion("role_id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdEqualTo(Integer value) {
		    addCriterion("role_id =", value, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdNotEqualTo(Integer value) {
		    addCriterion("role_id <>", value, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdGreaterThan(Integer value) {
		    addCriterion("role_id >", value, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
		    addCriterion("role_id >=", value, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdLessThan(Integer value) {
		    addCriterion("role_id <", value, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
		    addCriterion("role_id <=", value, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdIn(List<Integer> values) {
		    addCriterion("role_id in", values, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdNotIn(List<Integer> values) {
		    addCriterion("role_id not in", values, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdBetween(Integer value1, Integer value2) {
		    addCriterion("role_id between", value1, value2, "roleId");
		    return (Criteria) this;
		}
	
		public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
		    addCriterion("role_id not between", value1, value2, "roleId");
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
		
			
		public Criteria andActiveEmailIsNull() {
		    addCriterion("active_email is null");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailIsNotNull() {
		    addCriterion("active_email is not null");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailEqualTo(Integer value) {
		    addCriterion("active_email =", value, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailNotEqualTo(Integer value) {
		    addCriterion("active_email <>", value, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailGreaterThan(Integer value) {
		    addCriterion("active_email >", value, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailGreaterThanOrEqualTo(Integer value) {
		    addCriterion("active_email >=", value, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailLessThan(Integer value) {
		    addCriterion("active_email <", value, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailLessThanOrEqualTo(Integer value) {
		    addCriterion("active_email <=", value, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailIn(List<Integer> values) {
		    addCriterion("active_email in", values, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailNotIn(List<Integer> values) {
		    addCriterion("active_email not in", values, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailBetween(Integer value1, Integer value2) {
		    addCriterion("active_email between", value1, value2, "activeEmail");
		    return (Criteria) this;
		}
	
		public Criteria andActiveEmailNotBetween(Integer value1, Integer value2) {
		    addCriterion("active_email not between", value1, value2, "activeEmail");
		    return (Criteria) this;
		}
		
			
		public Criteria andUpdatedIsNull() {
		    addCriterion("updated is null");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedIsNotNull() {
		    addCriterion("updated is not null");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedEqualTo(Date value) {
		    addCriterion("updated =", value, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedNotEqualTo(Date value) {
		    addCriterion("updated <>", value, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedGreaterThan(Date value) {
		    addCriterion("updated >", value, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
		    addCriterion("updated >=", value, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedLessThan(Date value) {
		    addCriterion("updated <", value, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedLessThanOrEqualTo(Date value) {
		    addCriterion("updated <=", value, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedIn(List<Date> values) {
		    addCriterion("updated in", values, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedNotIn(List<Date> values) {
		    addCriterion("updated not in", values, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedBetween(Date value1, Date value2) {
		    addCriterion("updated between", value1, value2, "updated");
		    return (Criteria) this;
		}
	
		public Criteria andUpdatedNotBetween(Date value1, Date value2) {
		    addCriterion("updated not between", value1, value2, "updated");
		    return (Criteria) this;
		}
		
			
		public Criteria andEmailIsNull() {
		    addCriterion("email is null");
		    return (Criteria) this;
		}
	
		public Criteria andEmailIsNotNull() {
		    addCriterion("email is not null");
		    return (Criteria) this;
		}
	
		public Criteria andEmailEqualTo(String value) {
		    addCriterion("email =", value, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailNotEqualTo(String value) {
		    addCriterion("email <>", value, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailGreaterThan(String value) {
		    addCriterion("email >", value, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailGreaterThanOrEqualTo(String value) {
		    addCriterion("email >=", value, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailLessThan(String value) {
		    addCriterion("email <", value, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailLessThanOrEqualTo(String value) {
		    addCriterion("email <=", value, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailIn(List<String> values) {
		    addCriterion("email in", values, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailNotIn(List<String> values) {
		    addCriterion("email not in", values, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailBetween(String value1, String value2) {
		    addCriterion("email between", value1, value2, "email");
		    return (Criteria) this;
		}
	
		public Criteria andEmailNotBetween(String value1, String value2) {
		    addCriterion("email not between", value1, value2, "email");
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
		
			
		public Criteria andUsernameIsNull() {
		    addCriterion("username is null");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameIsNotNull() {
		    addCriterion("username is not null");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameEqualTo(String value) {
		    addCriterion("username =", value, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameNotEqualTo(String value) {
		    addCriterion("username <>", value, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameGreaterThan(String value) {
		    addCriterion("username >", value, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
		    addCriterion("username >=", value, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameLessThan(String value) {
		    addCriterion("username <", value, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameLessThanOrEqualTo(String value) {
		    addCriterion("username <=", value, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameIn(List<String> values) {
		    addCriterion("username in", values, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameNotIn(List<String> values) {
		    addCriterion("username not in", values, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameBetween(String value1, String value2) {
		    addCriterion("username between", value1, value2, "username");
		    return (Criteria) this;
		}
	
		public Criteria andUsernameNotBetween(String value1, String value2) {
		    addCriterion("username not between", value1, value2, "username");
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