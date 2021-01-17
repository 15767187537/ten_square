package com.xztx.mapper;

import com.xztx.entity.RecruitDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecruitDao {

    /**
     * 查询最新的招聘信息
     * @param recruitDTO
     * @return
     */
    List<RecruitDTO> findRecruit(RecruitDTO recruitDTO);
}
