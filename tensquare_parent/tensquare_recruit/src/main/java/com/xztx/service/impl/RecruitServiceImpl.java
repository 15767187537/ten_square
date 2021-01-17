package com.xztx.service.impl;

import com.xztx.entity.RecruitDTO;
import com.xztx.mapper.RecruitDao;
import com.xztx.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitService {

    @Autowired
    private RecruitDao recruitDao;

    @Override
    public List<RecruitDTO> findAllOrderByCreateTimeDesc() {
        RecruitDTO recruitDTO = new RecruitDTO();
        recruitDTO.setJobName("n");
        List<RecruitDTO> recruitDTOS = recruitDao.findRecruit(recruitDTO);
        return recruitDTOS;
    }
}
