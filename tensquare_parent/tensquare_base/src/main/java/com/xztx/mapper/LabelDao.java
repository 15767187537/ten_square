package com.xztx.mapper;

import com.xztx.entity.LabelDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LabelDao  {

    void saveLabel(LabelDTO label);
}
