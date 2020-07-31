package com.accp.dao;

import com.accp.domain.Section;
import com.accp.domain.SectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionMapper {
	  Section findById(@Param("qid") Integer bzid);
	
	 int countByExample(SectionExample example);

	    int deleteByExample(SectionExample example);

	    int deleteByPrimaryKey(Integer qid);

	    int insert(Section record);

	    int insertSelective(Section record);

	    List<Section> selectByExample(SectionExample example);

	    Section selectByPrimaryKey(Integer qid);

	    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example);

	    int updateByExample(@Param("record") Section record, @Param("example") SectionExample example);

	    int updateByPrimaryKeySelective(Section record);

	    int updateByPrimaryKey(Section record);
}