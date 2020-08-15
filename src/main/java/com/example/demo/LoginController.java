package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.ServiceUIFactory;

@Controller
public class LoginController {
@Autowired
LoginService service;
    //@RequestMapping("/login")

    //THIS METHOD WAS FOR GET REQUEST PARAMS
    //@ResponseBody // will return the content same as in return statement not be used with jsp pages
    /*public String test(@RequestParam String name, ModelMap model){
        model.put("name", name);//model is used to send any thing on view
        System.out.println("My name is "+name);
        return "login";
    }*/
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String test( ModelMap model){

        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String test( ModelMap model, @RequestParam String name, @RequestParam String password){
        model.put("name",name);
        model.put("password", password);
        boolean isValidate= service.validate(name,password);
        if(isValidate){
            return "welcome";
        }else{
            model.put("errormessage","Invalid username or password");
            return "login";
        }

    }
}
