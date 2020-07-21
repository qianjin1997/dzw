package com.accp.dao;

import com.accp.domain.Affiliation;
import com.accp.domain.AffiliationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AffiliationMapper {
    int countByExample(AffiliationExample example);

    int deleteByExample(AffiliationExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Affiliation record);

    int insertSelective(Affiliation record);

    List<Affiliation> selectByExample(AffiliationExample example);

    Affiliation selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Affiliation record, @Param("example") AffiliationExample example);

    int updateByExample(@Param("record") Affiliation record, @Param("example") AffiliationExample example);

    int updateByPrimaryKeySelective(Affiliation record);

    int updateByPrimaryKey(Affiliation record);
}