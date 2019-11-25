package com.ecobank.newstanding.controller;

import com.ecobank.newstanding.model.Request;
import com.ecobank.newstanding.model.Response;
import com.ecobank.newstanding.service.StandingOrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import javax.servlet.http.HttpServletRequest;

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
    public ResponseEntity<Response> createStandingOrder(@RequestBody Request request, HttpServletRequest httpServletRequest) {
        try {
          Response response = service.createStandingOrderHandler(request);

          System.out.println(response.toString());

            if(response != null) {
                System.out.println("h");
                return new ResponseEntity<Response>(response, HttpStatus.OK);
            }else {
                System.out.println("i");
                Response failedRes = new Response("99", "failed");
                return new ResponseEntity<Response>(failedRes, HttpStatus.NOT_FOUND);
            }
        }catch (Exception exception) {
            System.out.println("hi");
            System.out.println("Err: "+exception);
        }
        return null;
    }

}
