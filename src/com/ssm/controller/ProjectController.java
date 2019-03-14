package com.ssm.controller;

import com.ssm.pojo.Account;
import com.ssm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectServiceImpl;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam int accno,@RequestParam String password, Model model){
        System.out.println("accno"+accno);
        System.out.println("password"+password);
        Account ac= projectServiceImpl.login(accno,password);
        if (ac!=null){
           model.addAttribute("account",ac);
       }else {
           return "redirect:/login.jsp";
       }
        return "/main.jsp";
    }


}
