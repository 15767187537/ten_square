package com.xztx.service;

import com.xztx.entity.LabelDTO;

import java.util.List;

public interface LabelService {
    /**
     * 新增标签
     * @param label
     */
    void add(LabelDTO label);

    /***
     * 查询所有的标签
     * @return
     */
    List<LabelDTO> finAll();

    /**
     * 根据id查询单个标签
     * @param id
     * @return
     */
    LabelDTO findOne(String id);

    /***
     * 根据id修改标签内容
     * @param label
     */
    void updateLabel(LabelDTO label);

    /**
     * 根据id删除标签
     * @param id
     */
    void deleteLabel(String id);
}
