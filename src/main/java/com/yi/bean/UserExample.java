package com.yi.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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
            super();
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
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

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
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

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regTime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(String value) {
            addCriterion("regTime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(String value) {
            addCriterion("regTime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(String value) {
            addCriterion("regTime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(String value) {
            addCriterion("regTime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(String value) {
            addCriterion("regTime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(String value) {
            addCriterion("regTime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLike(String value) {
            addCriterion("regTime like", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotLike(String value) {
            addCriterion("regTime not like", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<String> values) {
            addCriterion("regTime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<String> values) {
            addCriterion("regTime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(String value1, String value2) {
            addCriterion("regTime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(String value1, String value2) {
            addCriterion("regTime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeIsNull() {
            addCriterion("lastSignTime is null");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeIsNotNull() {
            addCriterion("lastSignTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeEqualTo(String value) {
            addCriterion("lastSignTime =", value, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeNotEqualTo(String value) {
            addCriterion("lastSignTime <>", value, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeGreaterThan(String value) {
            addCriterion("lastSignTime >", value, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeGreaterThanOrEqualTo(String value) {
            addCriterion("lastSignTime >=", value, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeLessThan(String value) {
            addCriterion("lastSignTime <", value, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeLessThanOrEqualTo(String value) {
            addCriterion("lastSignTime <=", value, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeLike(String value) {
            addCriterion("lastSignTime like", value, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeNotLike(String value) {
            addCriterion("lastSignTime not like", value, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeIn(List<String> values) {
            addCriterion("lastSignTime in", values, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeNotIn(List<String> values) {
            addCriterion("lastSignTime not in", values, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeBetween(String value1, String value2) {
            addCriterion("lastSignTime between", value1, value2, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andLastsigntimeNotBetween(String value1, String value2) {
            addCriterion("lastSignTime not between", value1, value2, "lastsigntime");
            return (Criteria) this;
        }

        public Criteria andSignstateIsNull() {
            addCriterion("signState is null");
            return (Criteria) this;
        }

        public Criteria andSignstateIsNotNull() {
            addCriterion("signState is not null");
            return (Criteria) this;
        }

        public Criteria andSignstateEqualTo(Integer value) {
            addCriterion("signState =", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotEqualTo(Integer value) {
            addCriterion("signState <>", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateGreaterThan(Integer value) {
            addCriterion("signState >", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("signState >=", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateLessThan(Integer value) {
            addCriterion("signState <", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateLessThanOrEqualTo(Integer value) {
            addCriterion("signState <=", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateIn(List<Integer> values) {
            addCriterion("signState in", values, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotIn(List<Integer> values) {
            addCriterion("signState not in", values, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateBetween(Integer value1, Integer value2) {
            addCriterion("signState between", value1, value2, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotBetween(Integer value1, Integer value2) {
            addCriterion("signState not between", value1, value2, "signstate");
            return (Criteria) this;
        }

        public Criteria andTickeidIsNull() {
            addCriterion("tickeId is null");
            return (Criteria) this;
        }

        public Criteria andTickeidIsNotNull() {
            addCriterion("tickeId is not null");
            return (Criteria) this;
        }

        public Criteria andTickeidEqualTo(Integer value) {
            addCriterion("tickeId =", value, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidNotEqualTo(Integer value) {
            addCriterion("tickeId <>", value, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidGreaterThan(Integer value) {
            addCriterion("tickeId >", value, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tickeId >=", value, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidLessThan(Integer value) {
            addCriterion("tickeId <", value, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidLessThanOrEqualTo(Integer value) {
            addCriterion("tickeId <=", value, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidIn(List<Integer> values) {
            addCriterion("tickeId in", values, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidNotIn(List<Integer> values) {
            addCriterion("tickeId not in", values, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidBetween(Integer value1, Integer value2) {
            addCriterion("tickeId between", value1, value2, "tickeid");
            return (Criteria) this;
        }

        public Criteria andTickeidNotBetween(Integer value1, Integer value2) {
            addCriterion("tickeId not between", value1, value2, "tickeid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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