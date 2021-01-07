package com.xztx.controller;

import com.github.pagehelper.PageInfo;
import com.xztx.entity.LabelDTO;
import com.xztx.entity.Result;
import com.xztx.entity.StatusCode;
import com.xztx.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 新增标签
     * @param label
     * @return
     */
    @PostMapping("/addLabel")
    public Result add(@RequestBody LabelDTO label) {
        labelService.add(label);
        return new Result(true, StatusCode.OK, "增加成功");
    }

    /**
     * 查询所有的标签
     * @return
     */
    @GetMapping("/findAll")
    public Result findAll() {
        List<LabelDTO> labelList =  labelService.finAll();
        return new Result(true, StatusCode.OK, "查询成功", labelList);
    }
//
    @GetMapping("/findOne/{id}")
    public Result findOne(@PathVariable("id") String id) {
        LabelDTO labelDTO = labelService.findOne(id);
        return new Result(true, StatusCode.OK, "查询成功", labelDTO);
    }

    @PostMapping("/updateLabel")
    public Result updateLabel(@RequestBody LabelDTO label) {
        labelService.updateLabel(label);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    @PostMapping("/deleteLabel/{id}")
    public Result deleteLabel(@PathVariable("id") String id) {
        labelService.deleteLabel(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }

    @PostMapping(value="/search")
    public Result search(@RequestBody LabelDTO labelDTO){
        PageInfo<LabelDTO> labelDTOS = labelService.findSearch(labelDTO);
        return new Result(true,StatusCode.OK,"查询成功", labelDTOS);
    }

}
