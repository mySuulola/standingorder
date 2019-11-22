package com.ecobank.newstanding.model;

public class Request {

    protected String affiliateCode;
    protected String frequency;
    protected String mobileno;
    protected String transactiontype;
    protected String amount;
    protected String sourceaccount;
    protected String nooftransactions;
    protected String ccy;
    protected String startdate;
    protected String enddate;
    protected String accName;
    protected String accValue;
    protected String destinationBankCode;
    protected String bankName;
//    protected Extensions[] extensions ;

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

    //    public Extensions[] getExtensions() {
//        return extensions;
//    }
//
//    public void setExtensions(Extensions[] extensions) {
//        this.extensions = extensions;
//    }
}
