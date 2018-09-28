package com.atguigu.mbg.mapper;

import com.atguigu.mbg.entities.Facilitator;
import com.atguigu.mbg.entities.FacilitatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FacilitatorMapper {
    int countByExample(FacilitatorExample example);

    int deleteByExample(FacilitatorExample example);

    int deleteByPrimaryKey(String facId);

    int insert(Facilitator record);

    int insertSelective(Facilitator record);

    List<Facilitator> selectByExample(FacilitatorExample example);

    Facilitator selectByPrimaryKey(String facId);

    int updateByExampleSelective(@Param("record") Facilitator record, @Param("example") FacilitatorExample example);

    int updateByExample(@Param("record") Facilitator record, @Param("example") FacilitatorExample example);

    int updateByPrimaryKeySelective(Facilitator record);

    int updateByPrimaryKey(Facilitator record);
}