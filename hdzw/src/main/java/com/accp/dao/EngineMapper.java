package com.accp.dao;

import com.accp.domain.Engine;
import com.accp.domain.EngineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineMapper {
    int countByExample(EngineExample example);

    int deleteByExample(EngineExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Engine record);

    int insertSelective(Engine record);

    List<Engine> selectByExample(EngineExample example);

    Engine selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Engine record, @Param("example") EngineExample example);

    int updateByExample(@Param("record") Engine record, @Param("example") EngineExample example);

    int updateByPrimaryKeySelective(Engine record);

    int updateByPrimaryKey(Engine record);
}