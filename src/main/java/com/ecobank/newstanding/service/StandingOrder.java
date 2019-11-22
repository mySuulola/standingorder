package com.ecobank.newstanding.service;


import com.ecobank.newstanding.model.HostHeaderInfo;
import com.ecobank.newstanding.model.Response;
import com.ecobank.newstanding.model.StandingOrderPostingRequest;



public interface StandingOrder {

    HostHeaderInfo prepHostHeader(String affiliateCode);
    Response createStandingOrderHandler(
            String affCode,
            String frequency,
            String mobileno,
            String transactionType,
            String amount,
            String sourceaccount,
            String nooftransactions,
            String ccy,
            String startdate,
            String enddate,
            String accName,
            String accValue,
            String destinationBankCode,
            String bankName
            );
}
