package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoNotify;
import com.lanhun.domain.example.MtoNotifyExample;

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
public interface MtoNotifyMapper {

    int countByExample(MtoNotifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoNotify record);

    int insertSelective(MtoNotify record);

    List<MtoNotify> selectByExample(MtoNotifyExample example);

    MtoNotify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoNotify record);

    int updateByPrimaryKey(MtoNotify record);

}