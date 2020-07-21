package com.accp.dao;

import com.accp.domain.Brackets;
import com.accp.domain.BracketsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BracketsMapper {
    int countByExample(BracketsExample example);

    int deleteByExample(BracketsExample example);

    int deleteByPrimaryKey(Integer agid);

    int insert(Brackets record);

    int insertSelective(Brackets record);

    List<Brackets> selectByExample(BracketsExample example);

    Brackets selectByPrimaryKey(Integer agid);

    int updateByExampleSelective(@Param("record") Brackets record, @Param("example") BracketsExample example);

    int updateByExample(@Param("record") Brackets record, @Param("example") BracketsExample example);

    int updateByPrimaryKeySelective(Brackets record);

    int updateByPrimaryKey(Brackets record);
}