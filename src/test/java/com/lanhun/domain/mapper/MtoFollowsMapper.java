package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoFollows;
import com.lanhun.domain.example.MtoFollowsExample;

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
public interface MtoFollowsMapper {

    int countByExample(MtoFollowsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoFollows record);

    int insertSelective(MtoFollows record);

    List<MtoFollows> selectByExample(MtoFollowsExample example);

    MtoFollows selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoFollows record);

    int updateByPrimaryKey(MtoFollows record);

}