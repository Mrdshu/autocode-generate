package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoLogs;
import com.lanhun.domain.example.MtoLogsExample;

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
public interface MtoLogsMapper {

    int countByExample(MtoLogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoLogs record);

    int insertSelective(MtoLogs record);

    List<MtoLogs> selectByExample(MtoLogsExample example);

    MtoLogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoLogs record);

    int updateByPrimaryKey(MtoLogs record);

}