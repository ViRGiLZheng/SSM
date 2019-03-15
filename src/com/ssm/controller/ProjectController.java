package com.ssm.controller;

import com.ssm.pojo.Account;
import com.ssm.service.Impl.ProjectServiceImpl;
import com.ssm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectServiceImpl;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam int accno,@RequestParam String password, Model model,HttpSession session){
        System.out.println("accno"+accno);
        System.out.println("password"+password);
        Account ac= projectServiceImpl.login(accno,password);
        if (ac!=null){
           model.addAttribute("account",ac);
           session.setAttribute("account",ac);
       }else {
           return "redirect:/login.jsp";
       }
        return "/main.jsp";
    }

    @RequestMapping(value = "/transfer")
    public String transFer(int accIn,double balance,String name,HttpSession session){
        Account ac = (Account) session.getAttribute("account");
        int index = projectServiceImpl.transFor(ac.getId(),balance,accIn,name);
        if (index==2){
            return "/success.jsp";
        }else
            return "/error.jsp";
    }


}
