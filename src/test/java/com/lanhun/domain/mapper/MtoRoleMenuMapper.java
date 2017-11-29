package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoRoleMenu;
import com.lanhun.domain.example.MtoRoleMenuExample;

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
public interface MtoRoleMenuMapper {

    int countByExample(MtoRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoRoleMenu record);

    int insertSelective(MtoRoleMenu record);

    List<MtoRoleMenu> selectByExample(MtoRoleMenuExample example);

    MtoRoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoRoleMenu record);

    int updateByPrimaryKey(MtoRoleMenu record);

}