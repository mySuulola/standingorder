package com.ecobank.newstanding.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StandingOrderPayload {

    private HostHeaderInfo hostHeaderInfo;
    private String frequency;
    private String mobileno;
    private String transactiontype;
    private String amount;
    private String sourceaccount;
    private String nooftransactions;
    private String ccy;
    private String startdate;
    private String enddate;
    private Extensions[] extensions;


    public StandingOrderPayload() {
    }

    public StandingOrderPayload(
            HostHeaderInfo hostHeaderInfo,
            String frequency,
            String mobileno,
            String transactiontype,
            String amount,
            String sourceaccount,
            String nooftransactions,
            String ccy,
            String startdate,
            String enddate,
            Extensions[] extensions
    ) {
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
