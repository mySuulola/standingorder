package com.ecobank.newstanding.controller;

import com.ecobank.newstanding.model.Request;
import com.ecobank.newstanding.model.Response;
import com.ecobank.newstanding.model.StandingOrderPostingRequest;
import com.ecobank.newstanding.service.StandingOrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.SysexMessage;
@RestController
@RequestMapping("/")
public class StandingOrderController {

    @Autowired
    private StandingOrderImpl service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greetings() {
        return "Hello World";
    }

    @RequestMapping(
            path="/createstandingorder",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<?>  createStandingOrder(@RequestBody Request request, HttpServletRequest httpServletRequest) {
        try {
            System.out.println("hey");
            System.out.println(request.getAmount());

//            System.out.println(request.toString());


            System.out.println("Hiiiiiiiii");
//            System.out.println(request.toString());
            Response response = service.createStandingOrderHandler(
                    request.getAffiliateCode(),
                    request.getFrequency(),
                    request.getMobileno(),
                    request.getTransactiontype(),
                    request.getAmount(),
                    request.getSourceaccount(),
                    request.getNooftransactions(),
                    request.getCcy(),
                    request.getStartdate(),
                    request.getEnddate(),
                    request.getAccName(),
                    request.getAccValue(),
                    request.getDestinationBankCode(),
                    request.getBankName()
                    );
            System.out.println("got here??");
            System.out.println(response.toString());

            if(response != null) {
                System.out.println("h");
                return new ResponseEntity<>(response, HttpStatus.OK);
            }else {
                System.out.println("i");
                throw new RestClientException("Oops something went wrong");
            }
        }catch (Exception exception) {
            System.out.println("hi");
            System.out.println("Err: "+exception);
            throw new RestClientException("Oops something went wrong");
        }
    }

}
