package com.github.fredyspt.ecommerce.controllers;

import com.github.fredyspt.ecommerce.exceptions.GenericBadRequest;
import com.github.fredyspt.ecommerce.model.Payment;
import com.github.fredyspt.ecommerce.model.User;
import com.github.fredyspt.ecommerce.util.Constant;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

public class UserController {
    ArrayList<User> usersList = new ArrayList<>();

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})

    @PostMapping("/user/add")
    public void addUserMethod(@RequestBody Map<String, Object> requestMap){
        if(!requestMap.containsKey(Constant.KEY_NAME)){
            throw new GenericBadRequest("No user name provided");
        }

        if(!requestMap.containsKey(Constant.KEY_LAST_NAME)){
            throw new GenericBadRequest("No user last name provided");
        }

        if(!requestMap.containsKey(Constant.KEY_EMAIL)){
            throw new GenericBadRequest("NNo user email provided");
        }
        if(!requestMap.containsKey(Constant.KEY_PHONE_NUMBER)){
            throw new GenericBadRequest("No user phone number provided");
        }
        if(!requestMap.containsKey(Constant.KEY_ADDRESS)){
            throw new GenericBadRequest("No user address provided");
        }
        if(!requestMap.containsKey(Constant.KEY_PAYMENT_CARD)){
            throw new GenericBadRequest("No card provided");
        }


        User newUser = new User(requestMap);
        usersList.add(newUser);
    }

    @GetMapping("/user")
    public ArrayList<User> getUsersList(){
        if(usersList.size() == 0){
            throw new GenericBadRequest("No Users methods available");
        }

        return usersList;
    }


}
