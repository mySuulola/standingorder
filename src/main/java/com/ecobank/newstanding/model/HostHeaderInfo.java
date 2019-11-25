package com.ecobank.newstanding.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class HostHeaderInfo {

    private String sourceCode;
    private String requestId;
    private String requestToken;
    private String requestType;
    private String affiliateCode;
    private String operatorCode;
    private String ipAddress;
    private String sourceChannelId;

    public HostHeaderInfo() {
        this.sourceCode = "ECOBANKMOBILE";
        this.requestId = "123456";
        this.requestToken = "123456";
        this.requestType = "STANDINGORDER";
        this.affiliateCode = "";
        this.operatorCode = "";
        this.ipAddress = "1.1.1.1";
        this.sourceChannelId = "MOBILE";

    }

    public HostHeaderInfo(String sourceCode, String requestId, String requestToken, String requestType, String affiliateCode, String operatorCode, String ipAddress, String sourceChannelId) {
        this.sourceCode = sourceCode;
        this.requestId = requestId;
        this.requestToken = requestToken;
        this.requestType = requestType;
        this.affiliateCode = affiliateCode;
        this.operatorCode = operatorCode;
        this.ipAddress = ipAddress;
        this.sourceChannelId = sourceChannelId;
    }


    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestToken() {
        return requestToken;
    }

    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getAffiliateCode() {
        return affiliateCode;
    }

    public void setAffiliateCode(String affiliateCode) {
        this.affiliateCode = affiliateCode;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getSourceChannelId() {
        return sourceChannelId;
    }

    public void setSourceChannelId(String sourceChannelId) {
        this.sourceChannelId = sourceChannelId;
    }

    @Override
    public String toString() {
        return "HostHeaderInfo{" +
                "sourceCode='" + sourceCode + '\'' +
                ", requestId='" + requestId + '\'' +
                ", requestToken='" + requestToken + '\'' +
                ", requestType='" + requestType + '\'' +
                ", affiliateCode='" + affiliateCode + '\'' +
                ", operatorCode='" + operatorCode + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", sourceChannelId='" + sourceChannelId + '\'' +
                '}';
    }
}
