package com.accp.dao;

import com.accp.domain.Dimission;
import com.accp.domain.DimissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DimissionMapper {
    int countByExample(DimissionExample example);

    int deleteByExample(DimissionExample example);

    int deleteByPrimaryKey(Integer amid);

    int insert(Dimission record);

    int insertSelective(Dimission record);

    List<Dimission> selectByExample(DimissionExample example);

    Dimission selectByPrimaryKey(Integer amid);

    int updateByExampleSelective(@Param("record") Dimission record, @Param("example") DimissionExample example);

    int updateByExample(@Param("record") Dimission record, @Param("example") DimissionExample example);

    int updateByPrimaryKeySelective(Dimission record);

    int updateByPrimaryKey(Dimission record);
}