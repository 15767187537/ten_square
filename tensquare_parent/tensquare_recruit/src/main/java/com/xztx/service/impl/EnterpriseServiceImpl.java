package com.xztx.service.impl;

import com.xztx.entity.EnterpriseDTO;
import com.xztx.mapper.EnterpriseDao;
import com.xztx.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseDao enterpriseDao;

    @Override
    public List<EnterpriseDTO> findHotList() {
        EnterpriseDTO enterpriseDTO = new EnterpriseDTO();
        enterpriseDTO.setIsHot(1);
        List<EnterpriseDTO> enterpriseDTOS = enterpriseDao.findEnterpriseList(enterpriseDTO);
        return enterpriseDTOS;
    }
}
