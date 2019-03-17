package com.ssm.service;

import com.ssm.pojo.Account;

public interface ProjectService {

    Account login(int accno,String password);

    int transFor(int outId,double balance,int accInNo,String accInName);

    int changePassword(String newPassword,int accNo,String password);
}
