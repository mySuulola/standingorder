package com.ecobank.newstanding.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//        "hostHeaderInfo",
//        "frequency",
//        "mobileno",
//        "transactiontype",
//        "amount",
//        "sourceaccount",
//        "nooftransactions",
//        "ccy",
//        "startdate",
//        "enddate",
//        "extensions"
//})

public class StandingOrderPostingRequest {

//    @XmlElement(required = true)
    protected HostHeaderInfo hostHeaderInfo;

//    @XmlElement(required = true)
    protected String frequency;

//    @XmlElement(required = true)
    protected String mobileno;

//    @XmlElement(required = true)
    protected String transactiontype;

//    @XmlElement(required = true)
    protected String amount;

//    @XmlElement(required = true)
    protected String sourceaccount;

//    @XmlElement(required = true)
    protected String nooftransactions;

//    @XmlElement(required = true)
    protected String ccy;

//    @XmlElement(required = true)
    protected String startdate;

//    @XmlElement(required = true)
    protected String enddate;

//    @XmlElement(name="extensions", required = true)
    protected Extensions[] extensions ;


    public HostHeaderInfo getHostHeaderInfo() {
        return hostHeaderInfo;
    }

    public void setHostHeaderInfo(HostHeaderInfo hostHeaderInfo) {
        this.hostHeaderInfo = hostHeaderInfo;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSourceaccount() {
        return sourceaccount;
    }

    public void setSourceaccount(String sourceaccount) {
        this.sourceaccount = sourceaccount;
    }

    public String getNooftransactions() {
        return nooftransactions;
    }

    public void setNooftransactions(String nooftransactions) {
        this.nooftransactions = nooftransactions;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Extensions[] getExtensions() {
        return extensions;
    }

    public void setExtensions(Extensions[] extensions) {
        this.extensions = extensions;
    }

    public StandingOrderPostingRequest() {
    }

    public StandingOrderPostingRequest(HostHeaderInfo hostHeaderInfo, String frequency, String mobileno, String transactiontype, String amount, String sourceaccount, String nooftransactions, String ccy, String startdate, String enddate, Extensions[] extensions) {
        this.hostHeaderInfo = hostHeaderInfo;
        this.frequency = frequency;
        this.mobileno = mobileno;
        this.transactiontype = transactiontype;
        this.amount = amount;
        this.sourceaccount = sourceaccount;
        this.nooftransactions = nooftransactions;
        this.ccy = ccy;
        this.startdate = startdate;
        this.enddate = enddate;
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return "StandingOrderPostingRequest{" +
                "hostHeaderInfo=" + hostHeaderInfo +
                ", frequency='" + frequency + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", transactiontype='" + transactiontype + '\'' +
                ", amount='" + amount + '\'' +
                ", sourceaccount='" + sourceaccount + '\'' +
                ", nooftransactions='" + nooftransactions + '\'' +
                ", ccy='" + ccy + '\'' +
                ", startdate='" + startdate + '\'' +
                ", enddate='" + enddate + '\'' +
                ", extensions=" + Arrays.toString(extensions) +
                '}';
    }
}
