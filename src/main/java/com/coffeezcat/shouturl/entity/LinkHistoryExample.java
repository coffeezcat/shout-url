package com.coffeezcat.shouturl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LinkHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkHistoryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNull() {
            addCriterion("link_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNotNull() {
            addCriterion("link_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkIdEqualTo(String value) {
            addCriterion("link_id =", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotEqualTo(String value) {
            addCriterion("link_id <>", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThan(String value) {
            addCriterion("link_id >", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("link_id >=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThan(String value) {
            addCriterion("link_id <", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThanOrEqualTo(String value) {
            addCriterion("link_id <=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLike(String value) {
            addCriterion("link_id like", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotLike(String value) {
            addCriterion("link_id not like", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdIn(List<String> values) {
            addCriterion("link_id in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotIn(List<String> values) {
            addCriterion("link_id not in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdBetween(String value1, String value2) {
            addCriterion("link_id between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotBetween(String value1, String value2) {
            addCriterion("link_id not between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIsNull() {
            addCriterion("link_code is null");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIsNotNull() {
            addCriterion("link_code is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCodeEqualTo(String value) {
            addCriterion("link_code =", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotEqualTo(String value) {
            addCriterion("link_code <>", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeGreaterThan(String value) {
            addCriterion("link_code >", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("link_code >=", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLessThan(String value) {
            addCriterion("link_code <", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLessThanOrEqualTo(String value) {
            addCriterion("link_code <=", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLike(String value) {
            addCriterion("link_code like", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotLike(String value) {
            addCriterion("link_code not like", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIn(List<String> values) {
            addCriterion("link_code in", values, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotIn(List<String> values) {
            addCriterion("link_code not in", values, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeBetween(String value1, String value2) {
            addCriterion("link_code between", value1, value2, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotBetween(String value1, String value2) {
            addCriterion("link_code not between", value1, value2, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andCRefererIsNull() {
            addCriterion("c_referer is null");
            return (Criteria) this;
        }

        public Criteria andCRefererIsNotNull() {
            addCriterion("c_referer is not null");
            return (Criteria) this;
        }

        public Criteria andCRefererEqualTo(String value) {
            addCriterion("c_referer =", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererNotEqualTo(String value) {
            addCriterion("c_referer <>", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererGreaterThan(String value) {
            addCriterion("c_referer >", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererGreaterThanOrEqualTo(String value) {
            addCriterion("c_referer >=", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererLessThan(String value) {
            addCriterion("c_referer <", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererLessThanOrEqualTo(String value) {
            addCriterion("c_referer <=", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererLike(String value) {
            addCriterion("c_referer like", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererNotLike(String value) {
            addCriterion("c_referer not like", value, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererIn(List<String> values) {
            addCriterion("c_referer in", values, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererNotIn(List<String> values) {
            addCriterion("c_referer not in", values, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererBetween(String value1, String value2) {
            addCriterion("c_referer between", value1, value2, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCRefererNotBetween(String value1, String value2) {
            addCriterion("c_referer not between", value1, value2, "cReferer");
            return (Criteria) this;
        }

        public Criteria andCIpIsNull() {
            addCriterion("c_ip is null");
            return (Criteria) this;
        }

        public Criteria andCIpIsNotNull() {
            addCriterion("c_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCIpEqualTo(String value) {
            addCriterion("c_ip =", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpNotEqualTo(String value) {
            addCriterion("c_ip <>", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpGreaterThan(String value) {
            addCriterion("c_ip >", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpGreaterThanOrEqualTo(String value) {
            addCriterion("c_ip >=", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpLessThan(String value) {
            addCriterion("c_ip <", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpLessThanOrEqualTo(String value) {
            addCriterion("c_ip <=", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpLike(String value) {
            addCriterion("c_ip like", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpNotLike(String value) {
            addCriterion("c_ip not like", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpIn(List<String> values) {
            addCriterion("c_ip in", values, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpNotIn(List<String> values) {
            addCriterion("c_ip not in", values, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpBetween(String value1, String value2) {
            addCriterion("c_ip between", value1, value2, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpNotBetween(String value1, String value2) {
            addCriterion("c_ip not between", value1, value2, "cIp");
            return (Criteria) this;
        }

        public Criteria andCDeviceIsNull() {
            addCriterion("c_device is null");
            return (Criteria) this;
        }

        public Criteria andCDeviceIsNotNull() {
            addCriterion("c_device is not null");
            return (Criteria) this;
        }

        public Criteria andCDeviceEqualTo(String value) {
            addCriterion("c_device =", value, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceNotEqualTo(String value) {
            addCriterion("c_device <>", value, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceGreaterThan(String value) {
            addCriterion("c_device >", value, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("c_device >=", value, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceLessThan(String value) {
            addCriterion("c_device <", value, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceLessThanOrEqualTo(String value) {
            addCriterion("c_device <=", value, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceLike(String value) {
            addCriterion("c_device like", value, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceNotLike(String value) {
            addCriterion("c_device not like", value, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceIn(List<String> values) {
            addCriterion("c_device in", values, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceNotIn(List<String> values) {
            addCriterion("c_device not in", values, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceBetween(String value1, String value2) {
            addCriterion("c_device between", value1, value2, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCDeviceNotBetween(String value1, String value2) {
            addCriterion("c_device not between", value1, value2, "cDevice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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