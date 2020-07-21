package com.accp.dao;

import com.accp.domain.Documentstatus;
import com.accp.domain.DocumentstatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentstatusMapper {
    int countByExample(DocumentstatusExample example);

    int deleteByExample(DocumentstatusExample example);

    int deleteByPrimaryKey(Integer zid);

    int insert(Documentstatus record);

    int insertSelective(Documentstatus record);

    List<Documentstatus> selectByExample(DocumentstatusExample example);

    Documentstatus selectByPrimaryKey(Integer zid);

    int updateByExampleSelective(@Param("record") Documentstatus record, @Param("example") DocumentstatusExample example);

    int updateByExample(@Param("record") Documentstatus record, @Param("example") DocumentstatusExample example);

    int updateByPrimaryKeySelective(Documentstatus record);

    int updateByPrimaryKey(Documentstatus record);
}