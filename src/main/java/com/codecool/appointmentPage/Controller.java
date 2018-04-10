package com.codecool.appointmentPage;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String renderIndex(Model model, HttpSession session){
        return "index";
    }



}
