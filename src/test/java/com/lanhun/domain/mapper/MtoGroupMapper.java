package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoGroup;
import com.lanhun.domain.example.MtoGroupExample;

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
public interface MtoGroupMapper {

    int countByExample(MtoGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoGroup record);

    int insertSelective(MtoGroup record);

    List<MtoGroup> selectByExample(MtoGroupExample example);

    MtoGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoGroup record);

    int updateByPrimaryKey(MtoGroup record);

}