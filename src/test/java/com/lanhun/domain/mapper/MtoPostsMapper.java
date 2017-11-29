package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoPosts;
import com.lanhun.domain.example.MtoPostsExample;

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
public interface MtoPostsMapper {

    int countByExample(MtoPostsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoPosts record);

    int insertSelective(MtoPosts record);

    List<MtoPosts> selectByExample(MtoPostsExample example);

    MtoPosts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoPosts record);

    int updateByPrimaryKey(MtoPosts record);

}