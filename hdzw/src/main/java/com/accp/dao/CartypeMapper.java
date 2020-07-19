package com.accp.dao;

import com.accp.domain.Cartype;
import com.accp.domain.CartypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartypeMapper {
    int countByExample(CartypeExample example);

    int deleteByExample(CartypeExample example);

    int deleteByPrimaryKey(Integer jid);

    int insert(Cartype record);

    int insertSelective(Cartype record);

    List<Cartype> selectByExample(CartypeExample example);

    Cartype selectByPrimaryKey(Integer jid);

    int updateByExampleSelective(@Param("record") Cartype record, @Param("example") CartypeExample example);

    int updateByExample(@Param("record") Cartype record, @Param("example") CartypeExample example);

    int updateByPrimaryKeySelective(Cartype record);

    int updateByPrimaryKey(Cartype record);
}