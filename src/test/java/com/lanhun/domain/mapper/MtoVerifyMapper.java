package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoVerify;
import com.lanhun.domain.example.MtoVerifyExample;

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
public interface MtoVerifyMapper {

    int countByExample(MtoVerifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoVerify record);

    int insertSelective(MtoVerify record);

    List<MtoVerify> selectByExample(MtoVerifyExample example);

    MtoVerify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoVerify record);

    int updateByPrimaryKey(MtoVerify record);

}