package com.accp.dao;

import com.accp.domain.Icbc;
import com.accp.domain.IcbcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcbcMapper {
    int countByExample(IcbcExample example);

    int deleteByExample(IcbcExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Icbc record);

    int insertSelective(Icbc record);

    List<Icbc> selectByExample(IcbcExample example);

    Icbc selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Icbc record, @Param("example") IcbcExample example);

    int updateByExample(@Param("record") Icbc record, @Param("example") IcbcExample example);

    int updateByPrimaryKeySelective(Icbc record);

    int updateByPrimaryKey(Icbc record);
}