package com.xztx.mapper;

import com.xztx.entity.LabelDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface LabelDao  {

    void saveLabel(LabelDTO label);

    List<LabelDTO> findAll();

    LabelDTO findOne(@Param("id") String id);

    void updateLabel(LabelDTO label);

    List<LabelDTO> findSearch(LabelDTO labelDTO);
}
