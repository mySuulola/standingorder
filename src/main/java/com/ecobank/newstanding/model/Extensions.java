package com.ecobank.newstanding.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//        "udfName",
//        "udfValue",
//})

public class Extensions {

//    @XmlElement(required = true)
    protected String udfName;

//    @XmlElement(required = true)
    protected String udfValue;


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

    public Extensions() {
    }

    public Extensions(String udfName, String udfValue) {
        this.udfName = udfName;
        this.udfValue = udfValue;
    }
}
