package com.xztx.controller;

import com.xztx.entity.RecruitDTO;
import com.xztx.entity.Result;
import com.xztx.entity.StatusCode;
import com.xztx.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recruit")
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    /**
     * 查询
     * @return
     */
    @GetMapping(value = "/search/recommend")
    public Result recommend() {
        List<RecruitDTO> list = recruitService.findAllOrderByCreateTimeDesc();
        return new Result(true, StatusCode.OK, "查询成功", list);
    }

}
