package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoComments;
import com.lanhun.domain.example.MtoCommentsExample;

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
public interface MtoCommentsMapper {

    int countByExample(MtoCommentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoComments record);

    int insertSelective(MtoComments record);

    List<MtoComments> selectByExample(MtoCommentsExample example);

    MtoComments selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoComments record);

    int updateByPrimaryKey(MtoComments record);

}