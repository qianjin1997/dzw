package com.accp.dao;

import com.accp.domain.Module;
import com.accp.domain.ModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleMapper {
    int countByExample(ModuleExample example);

    int deleteByExample(ModuleExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Module record);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);

    Module selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByExample(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
    
    List<Module> selectModuleByRid(Integer rid);
    
    List<Module> selectModuleByRidAndParentId(@Param("rid") Integer rid,@Param("pid") Integer parentId);
    
    List<Module> selectModuleByRidAndParentIdAndCatalog(@Param("rid") Integer rid,@Param("pid") Integer parentId,@Param("catalog") Integer catalog);
}