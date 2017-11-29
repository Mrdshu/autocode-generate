package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoTags;
import com.lanhun.domain.example.MtoTagsExample;

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
public interface MtoTagsMapper {

    int countByExample(MtoTagsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoTags record);

    int insertSelective(MtoTags record);

    List<MtoTags> selectByExample(MtoTagsExample example);

    MtoTags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoTags record);

    int updateByPrimaryKey(MtoTags record);

}