package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoMenu;
import com.lanhun.domain.example.MtoMenuExample;

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
public interface MtoMenuMapper {

    int countByExample(MtoMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoMenu record);

    int insertSelective(MtoMenu record);

    List<MtoMenu> selectByExample(MtoMenuExample example);

    MtoMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoMenu record);

    int updateByPrimaryKey(MtoMenu record);

}