package com.accp.dao;

import com.accp.domain.Goodsdj;
import com.accp.domain.GoodsdjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsdjMapper {
    int countByExample(GoodsdjExample example);

    int deleteByExample(GoodsdjExample example);

    int deleteByPrimaryKey(Integer aiid);

    int insert(Goodsdj record);

    int insertSelective(Goodsdj record);

    List<Goodsdj> selectByExample(GoodsdjExample example);

    Goodsdj selectByPrimaryKey(Integer aiid);

    int updateByExampleSelective(@Param("record") Goodsdj record, @Param("example") GoodsdjExample example);

    int updateByExample(@Param("record") Goodsdj record, @Param("example") GoodsdjExample example);

    int updateByPrimaryKeySelective(Goodsdj record);

    int updateByPrimaryKey(Goodsdj record);
}