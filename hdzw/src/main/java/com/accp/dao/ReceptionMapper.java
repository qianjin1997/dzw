package com.accp.dao;

import com.accp.domain.Reception;
import com.accp.domain.ReceptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceptionMapper {
    int countByExample(ReceptionExample example);

    int deleteByExample(ReceptionExample example);

    int deleteByPrimaryKey(Integer akid);

    int insert(Reception record);

    int insertSelective(Reception record);

    List<Reception> selectByExample(ReceptionExample example);

    Reception selectByPrimaryKey(Integer akid);

    int updateByExampleSelective(@Param("record") Reception record, @Param("example") ReceptionExample example);

    int updateByExample(@Param("record") Reception record, @Param("example") ReceptionExample example);

    int updateByPrimaryKeySelective(Reception record);

    int updateByPrimaryKey(Reception record);
}