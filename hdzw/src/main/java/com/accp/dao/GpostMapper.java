package com.accp.dao;

import com.accp.domain.Gpost;
import com.accp.domain.GpostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GpostMapper {
    int countByExample(GpostExample example);

    int deleteByExample(GpostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gpost record);

    int insertSelective(Gpost record);

    List<Gpost> selectByExample(GpostExample example);

    Gpost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gpost record, @Param("example") GpostExample example);

    int updateByExample(@Param("record") Gpost record, @Param("example") GpostExample example);

    int updateByPrimaryKeySelective(Gpost record);

    int updateByPrimaryKey(Gpost record);
}