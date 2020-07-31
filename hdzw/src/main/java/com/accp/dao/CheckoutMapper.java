package com.accp.dao;

import com.accp.domain.Checkout;
import com.accp.domain.CheckoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckoutMapper {
    int countByExample(CheckoutExample example);

    int deleteByExample(CheckoutExample example);

    int deleteByPrimaryKey(Integer alid);

    int insert(Checkout record);

    int insertSelective(Checkout record);

    List<Checkout> selectByExample(CheckoutExample example);

    Checkout selectByPrimaryKey(Integer alid);

    int updateByExampleSelective(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByExample(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByPrimaryKeySelective(Checkout record);

    int updateByPrimaryKey(Checkout record);
    
    //-------------------------------------
    List<Checkout> findAlls (String aliscomplete,String hlicenseno,Integer alid, String alcompletedate,String alcompletedate1);
    
    Checkout findAlls1(Integer alid);
}