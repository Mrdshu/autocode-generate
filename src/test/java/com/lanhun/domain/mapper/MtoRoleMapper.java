package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoRole;
import com.lanhun.domain.example.MtoRoleExample;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016-01-12 16:11:45
 * @version
 */
public interface MtoRoleMapper {

    int countByExample(MtoRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoRole record);

    int insertSelective(MtoRole record);

    List<MtoRole> selectByExample(MtoRoleExample example);

    MtoRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoRole record);

    int updateByPrimaryKey(MtoRole record);

}