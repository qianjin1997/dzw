package com.accp.dao;

import com.accp.domain.Maintain;
import com.accp.domain.MaintainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainMapper {
    int countByExample(MaintainExample example);

    int deleteByExample(MaintainExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Maintain record);

    int insertSelective(Maintain record);

    List<Maintain> selectByExample(MaintainExample example);

    Maintain selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Maintain record, @Param("example") MaintainExample example);

    int updateByExample(@Param("record") Maintain record, @Param("example") MaintainExample example);

    int updateByPrimaryKeySelective(Maintain record);

    int updateByPrimaryKey(Maintain record);
}