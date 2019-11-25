package com.ecobank.newstanding.service;

import com.ecobank.newstanding.model.*;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class StandingOrderImpl implements StandingOrder {


    public Response createStandingOrderHandler(@RequestBody Request request) {

        System.out.println("jdf");
        System.out.println(request.toString());
        System.out.println("jdsfkfd");
        HostHeaderInfo hostHeaderInfo = new HostHeaderInfo();
        hostHeaderInfo.setAffiliateCode(request.getAffiliateCode());

        //Extension
        Extensions extensions1 = new Extensions();
        Extensions extensions2 = new Extensions();
        extensions1.setUdfName(request.getAccName());
        extensions1.setUdfValue(request.getAccValue());
        extensions2.setUdfName(request.getBankName());
        extensions2.setUdfValue(request.getDestinationBankCode());

        Extensions[] extensions = {extensions1, extensions2};

        System.out.println(extensions.toString());
        for (Extensions ex : extensions) {
            System.out.println(ex.toString());
        }

        StandingOrderPayload payload = new StandingOrderPayload();
        payload.setHostHeaderInfo(hostHeaderInfo);
        payload.setFrequency(request.getFrequency());
        payload.setMobileno(request.getMobileno());
        payload.setTransactiontype(request.getTransactiontype());
        payload.setAmount(request.getAmount());
        payload.setSourceaccount(request.getSourceaccount());
        payload.setNooftransactions(request.getNooftransactions());
        payload.setCcy(request.getCcy());
        payload.setStartdate(request.getStartdate());
        payload.setEnddate(request.getEnddate());
        payload.setExtensions(extensions);


        System.out.println(payload.toString());

//        for (Extensions ex: extensions){
//            ex.setUdfValue(accName);
//            ex.setUdfValue(accValue);
//        }


        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<?> requestEntity = new HttpEntity<>(payload, requestHeaders);

        String url = "http://demo3286216.mockable.io/createstandingorder";
        System.out.println("I'm here");
        RestTemplate restTemplate = new RestTemplate();
//
        ResponseEntity<Response> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                Response.class
        );
        return responseEntity != null ? responseEntity.getBody() : new Response("99","Failed");
    }
}
