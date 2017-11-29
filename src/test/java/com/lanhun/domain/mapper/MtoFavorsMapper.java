package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoFavors;
import com.lanhun.domain.example.MtoFavorsExample;

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
public interface MtoFavorsMapper {

    int countByExample(MtoFavorsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoFavors record);

    int insertSelective(MtoFavors record);

    List<MtoFavors> selectByExample(MtoFavorsExample example);

    MtoFavors selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoFavors record);

    int updateByPrimaryKey(MtoFavors record);

}