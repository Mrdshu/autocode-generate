package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoAuthMenu;
import com.lanhun.domain.example.MtoAuthMenuExample;

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
public interface MtoAuthMenuMapper {

    int countByExample(MtoAuthMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoAuthMenu record);

    int insertSelective(MtoAuthMenu record);

    List<MtoAuthMenu> selectByExample(MtoAuthMenuExample example);

    MtoAuthMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoAuthMenu record);

    int updateByPrimaryKey(MtoAuthMenu record);

}