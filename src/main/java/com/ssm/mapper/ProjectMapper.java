package com.ssm.mapper;

import com.ssm.pojo.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

public interface ProjectMapper {

    @Select("select * from acount where accno=#{accno} and password=#{password}")
    Account acc(@Param("accno")int accno, @Param("password") String password);

    @Update("update acount set balance=balance+#{balance} where id=#{id} ")
    int upBalance (@Param("balance")double balance,@Param("id")int id);

    @Select("select id from acount where accno=#{accno} and name=#{name}")
    int selid(@Param("accno")int accno,@Param("name")String name);

    @Select("select balance from acount where id=#{id}")
    double selbalance(@Param("id") int id);

    @Update("update acount set password=#{newpassword} where accno=#{accno} and password=#{password}")
    int upPassword (@Param("newpassword")String newPassword,@Param("accno") int accNo,@Param("password") String password);
}
