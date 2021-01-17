package com.xztx.service;

import com.xztx.entity.EnterpriseDTO;

import java.util.List;

public interface EnterpriseService {
    /**
     * 查询热门企业列表
     * @return
     */
    List<EnterpriseDTO> findHotList();
}
