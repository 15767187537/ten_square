package com.xztx.mapper;

import com.xztx.entity.LabelDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LabelDao  {

    void saveLabel(LabelDTO label);

    List<LabelDTO> findAll();

    LabelDTO findOne(@Param("id") String id);

    void updateLabel(LabelDTO label);
}
