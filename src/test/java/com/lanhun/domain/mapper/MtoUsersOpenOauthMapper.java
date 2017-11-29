package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoUsersOpenOauth;
import com.lanhun.domain.example.MtoUsersOpenOauthExample;

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
public interface MtoUsersOpenOauthMapper {

    int countByExample(MtoUsersOpenOauthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoUsersOpenOauth record);

    int insertSelective(MtoUsersOpenOauth record);

    List<MtoUsersOpenOauth> selectByExample(MtoUsersOpenOauthExample example);

    MtoUsersOpenOauth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoUsersOpenOauth record);

    int updateByPrimaryKey(MtoUsersOpenOauth record);

}