package com.accp.dao;

import com.accp.domain.Maintainxm;
import com.accp.domain.MaintainxmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainxmMapper {
    int countByExample(MaintainxmExample example);

    int deleteByExample(MaintainxmExample example);

    int deleteByPrimaryKey(Integer xid);

    int insert(Maintainxm record);

    int insertSelective(Maintainxm record);

    List<Maintainxm> selectByExample(MaintainxmExample example);

    Maintainxm selectByPrimaryKey(Integer xid);

    int updateByExampleSelective(@Param("record") Maintainxm record, @Param("example") MaintainxmExample example);

    int updateByExample(@Param("record") Maintainxm record, @Param("example") MaintainxmExample example);

    int updateByPrimaryKeySelective(Maintainxm record);

    int updateByPrimaryKey(Maintainxm record);
    
    //-------------------------------------------------
    List<Maintainxm> findAll(Integer id);
}