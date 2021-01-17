package com.xztx.service;

import com.xztx.entity.RecruitDTO;

import java.util.List;

public interface RecruitService {

    /**
     *
     * @return
     */
    List<RecruitDTO> findAllOrderByCreateTimeDesc();
}
