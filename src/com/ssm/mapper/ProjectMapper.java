package com.ssm.mapper;

import com.ssm.pojo.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

public interface ProjectMapper {

    @Select("select * from acount where accno=#{accno} and password=#{password}")
    Account acc(@Param("accno")int accno, @Param("password") String password);
}
