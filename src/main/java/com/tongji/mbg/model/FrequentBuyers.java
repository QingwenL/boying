package com.tongji.mbg.model;

import java.io.Serializable;

public class FrequentBuyers implements Serializable {
    private Integer frequentId;

    private Integer userId;

    private String name;

    /**
     * 常用购票人的身份证号码
     *
     * @mbg.generated
     */
    private String identityNumber;

    /**
     * 是否为默认常用购票人
     *
     * @mbg.generated
     */
    private Boolean defaultBuyer;

    private static final long serialVersionUID = 1L;

    public Integer getFrequentId() {
        return frequentId;
    }

    public void setFrequentId(Integer frequentId) {
        this.frequentId = frequentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Boolean getDefaultBuyer() {
        return defaultBuyer;
    }

    public void setDefaultBuyer(Boolean defaultBuyer) {
        this.defaultBuyer = defaultBuyer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", frequentId=").append(frequentId);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", identityNumber=").append(identityNumber);
        sb.append(", defaultBuyer=").append(defaultBuyer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}