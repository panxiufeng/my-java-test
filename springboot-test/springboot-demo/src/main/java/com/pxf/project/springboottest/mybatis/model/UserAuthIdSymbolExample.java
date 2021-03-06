package com.pxf.project.springboottest.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAuthIdSymbolExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public UserAuthIdSymbolExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
     */
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

        public Criteria andSymbolIdIsNull() {
            addCriterion("SYMBOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIdIsNotNull() {
            addCriterion("SYMBOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolIdEqualTo(String value) {
            addCriterion("SYMBOL_ID =", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotEqualTo(String value) {
            addCriterion("SYMBOL_ID <>", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdGreaterThan(String value) {
            addCriterion("SYMBOL_ID >", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYMBOL_ID >=", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdLessThan(String value) {
            addCriterion("SYMBOL_ID <", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdLessThanOrEqualTo(String value) {
            addCriterion("SYMBOL_ID <=", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdLike(String value) {
            addCriterion("SYMBOL_ID like", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotLike(String value) {
            addCriterion("SYMBOL_ID not like", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdIn(List<String> values) {
            addCriterion("SYMBOL_ID in", values, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotIn(List<String> values) {
            addCriterion("SYMBOL_ID not in", values, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdBetween(String value1, String value2) {
            addCriterion("SYMBOL_ID between", value1, value2, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotBetween(String value1, String value2) {
            addCriterion("SYMBOL_ID not between", value1, value2, "symbolId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNull() {
            addCriterion("AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNotNull() {
            addCriterion("AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthIdEqualTo(String value) {
            addCriterion("AUTH_ID =", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotEqualTo(String value) {
            addCriterion("AUTH_ID <>", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThan(String value) {
            addCriterion("AUTH_ID >", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_ID >=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThan(String value) {
            addCriterion("AUTH_ID <", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThanOrEqualTo(String value) {
            addCriterion("AUTH_ID <=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLike(String value) {
            addCriterion("AUTH_ID like", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotLike(String value) {
            addCriterion("AUTH_ID not like", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIn(List<String> values) {
            addCriterion("AUTH_ID in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotIn(List<String> values) {
            addCriterion("AUTH_ID not in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdBetween(String value1, String value2) {
            addCriterion("AUTH_ID between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotBetween(String value1, String value2) {
            addCriterion("AUTH_ID not between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andIdentifiersIsNull() {
            addCriterion("IDENTIFIERS is null");
            return (Criteria) this;
        }

        public Criteria andIdentifiersIsNotNull() {
            addCriterion("IDENTIFIERS is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifiersEqualTo(String value) {
            addCriterion("IDENTIFIERS =", value, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersNotEqualTo(String value) {
            addCriterion("IDENTIFIERS <>", value, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersGreaterThan(String value) {
            addCriterion("IDENTIFIERS >", value, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFIERS >=", value, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersLessThan(String value) {
            addCriterion("IDENTIFIERS <", value, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFIERS <=", value, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersLike(String value) {
            addCriterion("IDENTIFIERS like", value, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersNotLike(String value) {
            addCriterion("IDENTIFIERS not like", value, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersIn(List<String> values) {
            addCriterion("IDENTIFIERS in", values, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersNotIn(List<String> values) {
            addCriterion("IDENTIFIERS not in", values, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersBetween(String value1, String value2) {
            addCriterion("IDENTIFIERS between", value1, value2, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifiersNotBetween(String value1, String value2) {
            addCriterion("IDENTIFIERS not between", value1, value2, "identifiers");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindIsNull() {
            addCriterion("IDENTIFY_KIND is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindIsNotNull() {
            addCriterion("IDENTIFY_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindEqualTo(String value) {
            addCriterion("IDENTIFY_KIND =", value, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindNotEqualTo(String value) {
            addCriterion("IDENTIFY_KIND <>", value, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindGreaterThan(String value) {
            addCriterion("IDENTIFY_KIND >", value, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFY_KIND >=", value, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindLessThan(String value) {
            addCriterion("IDENTIFY_KIND <", value, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFY_KIND <=", value, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindLike(String value) {
            addCriterion("IDENTIFY_KIND like", value, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindNotLike(String value) {
            addCriterion("IDENTIFY_KIND not like", value, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindIn(List<String> values) {
            addCriterion("IDENTIFY_KIND in", values, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindNotIn(List<String> values) {
            addCriterion("IDENTIFY_KIND not in", values, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindBetween(String value1, String value2) {
            addCriterion("IDENTIFY_KIND between", value1, value2, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdentifyKindNotBetween(String value1, String value2) {
            addCriterion("IDENTIFY_KIND not between", value1, value2, "identifyKind");
            return (Criteria) this;
        }

        public Criteria andIdStatusIsNull() {
            addCriterion("ID_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andIdStatusIsNotNull() {
            addCriterion("ID_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andIdStatusEqualTo(String value) {
            addCriterion("ID_STATUS =", value, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusNotEqualTo(String value) {
            addCriterion("ID_STATUS <>", value, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusGreaterThan(String value) {
            addCriterion("ID_STATUS >", value, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ID_STATUS >=", value, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusLessThan(String value) {
            addCriterion("ID_STATUS <", value, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusLessThanOrEqualTo(String value) {
            addCriterion("ID_STATUS <=", value, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusLike(String value) {
            addCriterion("ID_STATUS like", value, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusNotLike(String value) {
            addCriterion("ID_STATUS not like", value, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusIn(List<String> values) {
            addCriterion("ID_STATUS in", values, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusNotIn(List<String> values) {
            addCriterion("ID_STATUS not in", values, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusBetween(String value1, String value2) {
            addCriterion("ID_STATUS between", value1, value2, "idStatus");
            return (Criteria) this;
        }

        public Criteria andIdStatusNotBetween(String value1, String value2) {
            addCriterion("ID_STATUS not between", value1, value2, "idStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table console_user_auth_id_symbol
     *
     * @mbggenerated
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