package com.github.fredyspt.ecommerce.controllers;

import com.github.fredyspt.ecommerce.model.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/api/*")
@RestController
public class PaymentController {
    ArrayList<Payment> paymentsList = new ArrayList<>()

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
    @PostMapping("/api/user/payment")
    public void addPaymentMethod(){

    }


}
