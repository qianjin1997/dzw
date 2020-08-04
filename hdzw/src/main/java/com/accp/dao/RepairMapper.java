package com.accp.dao;

import com.accp.domain.Repair;
import com.accp.domain.RepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairMapper {
	List<Repair> findAll();
	Repair findone(Integer wid);
	
	List<Repair> find(Integer wuid);
	
    int countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
    
    //----------------------------------
    List<Repair> findAlls(String wmname);
    
    List<Repair> findAlls1(Integer wmid);
}