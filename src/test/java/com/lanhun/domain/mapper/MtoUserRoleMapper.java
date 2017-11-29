package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoUserRole;
import com.lanhun.domain.example.MtoUserRoleExample;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016-01-12 16:11:46
 * @version
 */
public interface MtoUserRoleMapper {

    int countByExample(MtoUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoUserRole record);

    int insertSelective(MtoUserRole record);

    List<MtoUserRole> selectByExample(MtoUserRoleExample example);

    MtoUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoUserRole record);

    int updateByPrimaryKey(MtoUserRole record);

}