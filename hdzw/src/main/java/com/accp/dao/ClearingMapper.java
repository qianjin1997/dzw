package com.accp.dao;

import com.accp.domain.Clearing;
import com.accp.domain.ClearingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClearingMapper {
    int countByExample(ClearingExample example);

    int deleteByExample(ClearingExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Clearing record);

    int insertSelective(Clearing record);

    List<Clearing> selectByExample(ClearingExample example);

    Clearing selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Clearing record, @Param("example") ClearingExample example);

    int updateByExample(@Param("record") Clearing record, @Param("example") ClearingExample example);

    int updateByPrimaryKeySelective(Clearing record);

    int updateByPrimaryKey(Clearing record);
}