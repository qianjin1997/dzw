package com.accp.dao;

import com.accp.domain.Goodsbrand;
import com.accp.domain.GoodsbrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsbrandMapper {
    int countByExample(GoodsbrandExample example);

    int deleteByExample(GoodsbrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goodsbrand record);

    int insertSelective(Goodsbrand record);

    List<Goodsbrand> selectByExample(GoodsbrandExample example);

    Goodsbrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goodsbrand record, @Param("example") GoodsbrandExample example);

    int updateByExample(@Param("record") Goodsbrand record, @Param("example") GoodsbrandExample example);

    int updateByPrimaryKeySelective(Goodsbrand record);

    int updateByPrimaryKey(Goodsbrand record);
}