package com.ecobank.newstanding.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//        "sourceCode",
//        "requestId",
//        "requestToken",
//        "requestType",
//        "affiliateCode",
//        "operatorCode",
//        "ipAddress",
//        "sourceChannelId"
//})

public class HostHeaderInfo {

//    @XmlElement(required = true)
    protected String sourceCode;

//    @XmlElement(required = true)
    protected String requestId;

//    @XmlElement(required = true)
    protected String requestToken;

//    @XmlElement(required = true)
    protected String requestType;

//    @XmlElement(required = true)
    protected String affiliateCode;

//    @XmlElement(required = true)
    protected String operatorCode;

//    @XmlElement(required = true)
    protected String ipAddress;

//    @XmlElement(required = true)
    protected String sourceChannelId;


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

    public HostHeaderInfo() {
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
