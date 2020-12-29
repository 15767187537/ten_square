package com.xztx.controller;

import com.xztx.entity.LabelDTO;
import com.xztx.entity.Result;
import com.xztx.entity.StatusCode;
import com.xztx.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @PostMapping("/addLabel")
    public Result add(@RequestBody LabelDTO label) {
        labelService.add(label);
        return new Result(true, StatusCode.OK, "增加成功");
    }

}
