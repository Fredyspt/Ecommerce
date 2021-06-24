package com.github.fredyspt.ecommerce.controllers;

import com.github.fredyspt.ecommerce.exceptions.GenericBadRequest;
import com.github.fredyspt.ecommerce.model.Payment;
import com.github.fredyspt.ecommerce.util.Constant;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RequestMapping("/api/*")
@RestController
public class PaymentController {
    ArrayList<Payment> paymentsList = new ArrayList<>();

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})

    @PostMapping("/user/payment/add")
    public void addPaymentMethod(@RequestBody Map<String, Object> requestMap){
        if(!requestMap.containsKey(Constant.KEY_CARD_NUMBER)){
            throw new GenericBadRequest("No card number provided");
        }

        if(!requestMap.containsKey(Constant.KEY_CVV)){
            throw new GenericBadRequest("No CVV provided");
        }

        if(!requestMap.containsKey(Constant.KEY_EXPIRATION_DATE)){
            throw new GenericBadRequest("No expiration date provided");
        }


        Payment newPayment = new Payment(requestMap);
        paymentsList.add(newPayment);
    }

    @GetMapping("/user/payment")
    public ArrayList<Payment> getPaymentsList(){
        if(paymentsList.size() == 0){
            throw new GenericBadRequest("No payment methods available");
        }

        return paymentsList;
    }


}
