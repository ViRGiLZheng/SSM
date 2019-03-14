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
}
