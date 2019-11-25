package com.ecobank.newstanding.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Extensions {

    private String udfName;
    private String udfValue;

    public Extensions() {
    }

    public Extensions(String udfName, String udfValue) {
        this.udfName = udfName;
        this.udfValue = udfValue;
    }


    public String getUdfName() {
        return udfName;
    }

    public void setUdfName(String udfName) {
        this.udfName = udfName;
    }

    public String getUdfValue() {
        return udfValue;
    }

    public void setUdfValue(String udfValue) {
        this.udfValue = udfValue;
    }

    @Override
    public String toString() {
        return "Extensions{" +
                "udfName='" + udfName + '\'' +
                ", udfValue='" + udfValue + '\'' +
                '}';
    }
}
