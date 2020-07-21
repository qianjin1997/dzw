package com.accp.dao;

import com.accp.domain.Customertype;
import com.accp.domain.CustomertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomertypeMapper {
    int countByExample(CustomertypeExample example);

    int deleteByExample(CustomertypeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Customertype record);

    int insertSelective(Customertype record);

    List<Customertype> selectByExample(CustomertypeExample example);

    Customertype selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Customertype record, @Param("example") CustomertypeExample example);

    int updateByExample(@Param("record") Customertype record, @Param("example") CustomertypeExample example);

    int updateByPrimaryKeySelective(Customertype record);

    int updateByPrimaryKey(Customertype record);
}