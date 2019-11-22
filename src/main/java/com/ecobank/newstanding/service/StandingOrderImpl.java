package com.ecobank.newstanding.service;

import com.ecobank.newstanding.model.Extensions;
import com.ecobank.newstanding.model.HostHeaderInfo;
import com.ecobank.newstanding.model.Response;
import com.ecobank.newstanding.model.StandingOrderPostingRequest;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StandingOrderImpl implements StandingOrder {

    public HostHeaderInfo prepHostHeader(String affiliateCode){
        HostHeaderInfo hostHeaderDetails = new HostHeaderInfo();
        hostHeaderDetails.setSourceCode("ECOBANKMOBILE");
        hostHeaderDetails.setRequestId("123456");
        hostHeaderDetails.setRequestToken("12371y3kkh3k2rj234");
        hostHeaderDetails.setRequestType("STANDINGORDER");
        hostHeaderDetails.setAffiliateCode(affiliateCode);
        hostHeaderDetails.setOperatorCode("");
        hostHeaderDetails.setIpAddress("1.1.1.1");
        hostHeaderDetails.setSourceChannelId("MOBILE");

        return hostHeaderDetails;
    }

    @Override
    public Response createStandingOrderHandler(
            String affiliateCode,
            String frequency,
            String mobileno,
            String transactionType,
            String amount,
            String sourceaccount,
            String nooftransactions,
            String ccy,
            String startdate,
            String  enddate,
            String accName,
            String accValue,
            String destinationBankCode,
            String bankName) {

        HostHeaderInfo hostHeaderDetails = prepHostHeader(affiliateCode);
        System.out.println("host created");

//        List<Extensions> extensions = new ArrayList<>(2);
        Extensions extensions1 = new Extensions();
        Extensions extensions2 = new Extensions();
//        for (Extensions ex: extensions){
//            ex.setUdfValue(accName);
//            ex.setUdfValue(accValue);
//        }

        extensions1.setUdfName(accName);
        extensions1.setUdfValue(accValue);
//        System.out.println("Extension created");

        extensions2.setUdfName(destinationBankCode);
        extensions2.setUdfValue(bankName);

        Extensions[] extensions = {extensions1,extensions2};

        System.out.println("Extension created");
        StandingOrderPostingRequest payload = new StandingOrderPostingRequest();
        payload.setHostHeaderInfo(hostHeaderDetails);
        payload.setFrequency(frequency);
        payload.setMobileno(mobileno);
        payload.setTransactiontype(transactionType);
        payload.setAmount(amount);
        payload.setSourceaccount(sourceaccount);
        payload.setNooftransactions(nooftransactions);
        payload.setCcy(ccy);
        payload.setStartdate(startdate);
        payload.setEnddate(enddate);
        payload.setExtensions(extensions);

//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.setContentType(MediaType.APPLICATION_XML);
//        requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

//        HttpEntity<?> requestEntity = new HttpEntity<>(payload, requestHeaders);
        System.out.println("payload created");
        HttpEntity<?> requestEntity = new HttpEntity<>(payload);


        String url = "http://demo3286216.mockable.io/createstandingorder";

        System.out.println("I'm here");
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Response> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                Response.class
        );
        System.out.println("call made");

        return responseEntity != null ? responseEntity.getBody() : new Response("99","Failed");
    }
}
