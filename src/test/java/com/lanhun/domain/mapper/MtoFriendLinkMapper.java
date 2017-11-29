package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoFriendLink;
import com.lanhun.domain.example.MtoFriendLinkExample;

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
public interface MtoFriendLinkMapper {

    int countByExample(MtoFriendLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoFriendLink record);

    int insertSelective(MtoFriendLink record);

    List<MtoFriendLink> selectByExample(MtoFriendLinkExample example);

    MtoFriendLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoFriendLink record);

    int updateByPrimaryKey(MtoFriendLink record);

}