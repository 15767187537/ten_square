package com.xztx.mapper;

import com.xztx.entity.EnterpriseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnterpriseDao {
    /**
     * 查询企业列表
     * @param enterpriseDTO
     * @return
     */
    List<EnterpriseDTO> findEnterpriseList(EnterpriseDTO enterpriseDTO);
}
