package com.xztx.controller;

import com.xztx.entity.EnterpriseDTO;
import com.xztx.entity.Result;
import com.xztx.entity.StatusCode;
import com.xztx.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    /**
     * 查询热门企业列表
     * @return
     */
    @GetMapping("/findHotList")
    public Result findHotList() {
        List<EnterpriseDTO> enterpriseDTOList = enterpriseService.findHotList();
        return new Result(true, StatusCode.OK, "查询成功", enterpriseDTOList);
    }

}
