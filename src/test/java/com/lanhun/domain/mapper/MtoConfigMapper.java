package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoConfig;
import com.lanhun.domain.example.MtoConfigExample;

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
public interface MtoConfigMapper {

    int countByExample(MtoConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoConfig record);

    int insertSelective(MtoConfig record);

    List<MtoConfig> selectByExample(MtoConfigExample example);

    MtoConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoConfig record);

    int updateByPrimaryKey(MtoConfig record);

}