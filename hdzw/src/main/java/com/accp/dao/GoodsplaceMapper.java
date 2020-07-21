package com.accp.dao;

import com.accp.domain.Goodsplace;
import com.accp.domain.GoodsplaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsplaceMapper {
    int countByExample(GoodsplaceExample example);

    int deleteByExample(GoodsplaceExample example);

    int deleteByPrimaryKey(Integer ajid);

    int insert(Goodsplace record);

    int insertSelective(Goodsplace record);

    List<Goodsplace> selectByExample(GoodsplaceExample example);

    Goodsplace selectByPrimaryKey(Integer ajid);

    int updateByExampleSelective(@Param("record") Goodsplace record, @Param("example") GoodsplaceExample example);

    int updateByExample(@Param("record") Goodsplace record, @Param("example") GoodsplaceExample example);

    int updateByPrimaryKeySelective(Goodsplace record);

    int updateByPrimaryKey(Goodsplace record);
}