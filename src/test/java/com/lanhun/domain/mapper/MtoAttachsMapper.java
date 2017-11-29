package com.lanhun.domain.mapper;

import java.util.List;

import com.lanhun.domain.model.MtoAttachs;
import com.lanhun.domain.example.MtoAttachsExample;

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
public interface MtoAttachsMapper {

    int countByExample(MtoAttachsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtoAttachs record);

    int insertSelective(MtoAttachs record);

    List<MtoAttachs> selectByExample(MtoAttachsExample example);

    MtoAttachs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MtoAttachs record);

    int updateByPrimaryKey(MtoAttachs record);

}