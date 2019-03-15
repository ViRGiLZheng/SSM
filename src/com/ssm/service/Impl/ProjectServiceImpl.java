package com.ssm.service.Impl;

import com.ssm.mapper.ProjectMapper;
import com.ssm.pojo.Account;
import com.ssm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public Account login(int accno, String password) {
        if (accno!=0&&password!=null&&password!=""){
            return projectMapper.acc(accno,password);
        }else
        return null;
    }


    public int transFor(int outid,double balance,int accInNo,String accInName){
        int index=0;
        int id = projectMapper.selid(accInNo,accInName);
        if (balance<=projectMapper.selbalance(outid)){
            index+=projectMapper.upBalance(-balance,outid);
            index+=projectMapper.upBalance(balance,id);
            return index;
        }else{
            return -1;
        }
    }
}
