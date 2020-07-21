package com.accp.dao;

import com.accp.domain.Legwork;
import com.accp.domain.LegworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LegworkMapper {
    int countByExample(LegworkExample example);

    int deleteByExample(LegworkExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Legwork record);

    int insertSelective(Legwork record);

    List<Legwork> selectByExample(LegworkExample example);

    Legwork selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Legwork record, @Param("example") LegworkExample example);

    int updateByExample(@Param("record") Legwork record, @Param("example") LegworkExample example);

    int updateByPrimaryKeySelective(Legwork record);

    int updateByPrimaryKey(Legwork record);
}