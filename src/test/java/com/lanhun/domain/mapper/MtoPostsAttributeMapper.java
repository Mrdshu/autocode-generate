package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoPostsAttribute;
import com.lanhun.domain.example.MtoPostsAttributeExample;

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
public interface MtoPostsAttributeMapper {

    int countByExample(MtoPostsAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoPostsAttribute record);

    int insertSelective(MtoPostsAttribute record);

    List<MtoPostsAttribute> selectByExample(MtoPostsAttributeExample example);

    MtoPostsAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoPostsAttribute record);

    int updateByPrimaryKey(MtoPostsAttribute record);

}