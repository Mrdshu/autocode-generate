package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoUsers;
import com.lanhun.domain.example.MtoUsersExample;

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
public interface MtoUsersMapper {

    int countByExample(MtoUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoUsers record);

    int insertSelective(MtoUsers record);

    List<MtoUsers> selectByExample(MtoUsersExample example);

    MtoUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoUsers record);

    int updateByPrimaryKey(MtoUsers record);

}