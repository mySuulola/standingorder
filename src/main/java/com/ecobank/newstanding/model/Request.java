package com.ecobank.newstanding.model;

public class Request {

    private String affiliateCode;
    private String frequency;
    private String mobileno;
    private String transactiontype;
    private String amount;
    private String sourceaccount;
    private String nooftransactions;
    private String ccy;
    private String startdate;
    private String enddate;
    private String accName;
    private String accValue;
    private String destinationBankCode;
    private String bankName;

    public String getAffiliateCode() {
        return affiliateCode;
    }

    public void setAffiliateCode(String affiliateCode) {
        this.affiliateCode = affiliateCode;
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

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccValue() {
        return accValue;
    }

    public void setAccValue(String accValue) {
        this.accValue = accValue;
    }

    public String getDestinationBankCode() {
        return destinationBankCode;
    }

    public void setDestinationBankCode(String destinationBankCode) {
        this.destinationBankCode = destinationBankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Request{" +
                "affiliateCode='" + affiliateCode + '\'' +
                ", frequency='" + frequency + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", transactiontype='" + transactiontype + '\'' +
                ", amount='" + amount + '\'' +
                ", sourceaccount='" + sourceaccount + '\'' +
                ", nooftransactions='" + nooftransactions + '\'' +
                ", ccy='" + ccy + '\'' +
                ", startdate='" + startdate + '\'' +
                ", enddate='" + enddate + '\'' +
                ", accName='" + accName + '\'' +
                ", accValue='" + accValue + '\'' +
                ", destinationBankCode='" + destinationBankCode + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }

}
