package com.accp.dao;

import com.accp.domain.Cslinkman;
import com.accp.domain.CslinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CslinkmanMapper {
    int countByExample(CslinkmanExample example);

    int deleteByExample(CslinkmanExample example);

    int deleteByPrimaryKey(Integer aoid);

    int insert(Cslinkman record);

    int insertSelective(Cslinkman record);

    List<Cslinkman> selectByExample(CslinkmanExample example);

    Cslinkman selectByPrimaryKey(Integer aoid);

    int updateByExampleSelective(@Param("record") Cslinkman record, @Param("example") CslinkmanExample example);

    int updateByExample(@Param("record") Cslinkman record, @Param("example") CslinkmanExample example);

    int updateByPrimaryKeySelective(Cslinkman record);

    int updateByPrimaryKey(Cslinkman record);
}