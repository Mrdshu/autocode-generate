package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoFeeds;
import com.lanhun.domain.example.MtoFeedsExample;

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
public interface MtoFeedsMapper {

    int countByExample(MtoFeedsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoFeeds record);

    int insertSelective(MtoFeeds record);

    List<MtoFeeds> selectByExample(MtoFeedsExample example);

    MtoFeeds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoFeeds record);

    int updateByPrimaryKey(MtoFeeds record);

}