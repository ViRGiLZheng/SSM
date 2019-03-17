package com.ssm.controller;

import com.ssm.pojo.Account;
import com.ssm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectServiceImpl;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam int accno,@RequestParam String password, HttpServletRequest request){
        Account ac= projectServiceImpl.login(accno,password);
        HttpSession session= request.getSession();
        if (ac!=null){
           session.setAttribute("account",ac);
       }else {
           return "redirect:/login.jsp";
       }
        return "page/main";
    }

    @RequestMapping(value = "/transfer")
    public String transFer(int accIn,double balance,String name,HttpSession session){
        Account ac = (Account) session.getAttribute("account");
        int index = projectServiceImpl.transFor(ac.getId(),balance,accIn,name);
        if (index==2){
            return "page/success";
        }else
            return "page/error";
    }

    @RequestMapping("changePassword")
    public String changePassword(String newPassword,int accNo,String password){
        int index=projectServiceImpl.changePassword(newPassword, accNo, password);
        System.out.println(newPassword+" "+accNo+" "+password);
        return index==1?"page/success":"page/error";
    }

    @RequestMapping("/page/{path}")
    public String page(@PathVariable("path") String path){
        return "page/"+path;
    }
}
