package com.accp.dao;

import com.accp.domain.Ghaddress;
import com.accp.domain.GhaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhaddressMapper {
	
	 List<Ghaddress> findAll(Integer anparentid);
	
    int countByExample(GhaddressExample example);

    int deleteByExample(GhaddressExample example);

    int deleteByPrimaryKey(Integer anid);

    int insert(Ghaddress record);

    int insertSelective(Ghaddress record);

    List<Ghaddress> selectByExample(GhaddressExample example);

    Ghaddress selectByPrimaryKey(Integer anid);

    int updateByExampleSelective(@Param("record") Ghaddress record, @Param("example") GhaddressExample example);

    int updateByExample(@Param("record") Ghaddress record, @Param("example") GhaddressExample example);

    int updateByPrimaryKeySelective(Ghaddress record);

    int updateByPrimaryKey(Ghaddress record);
}