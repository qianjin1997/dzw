package com.accp.dao;

import com.accp.domain.Wares;
import com.accp.domain.WaresExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaresMapper {
    int countByExample(WaresExample example);

    int deleteByExample(WaresExample example);

    int deleteByPrimaryKey(Integer afid);

    int insert(Wares record);

    int insertSelective(Wares record);

    List<Wares> selectByExample(WaresExample example);

    Wares selectByPrimaryKey(Integer afid);

    int updateByExampleSelective(@Param("record") Wares record, @Param("example") WaresExample example);

    int updateByExample(@Param("record") Wares record, @Param("example") WaresExample example);

    int updateByPrimaryKeySelective(Wares record);

    int updateByPrimaryKey(Wares record);
}