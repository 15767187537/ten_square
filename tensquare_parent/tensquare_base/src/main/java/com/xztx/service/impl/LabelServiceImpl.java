package com.xztx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xztx.entity.LabelDTO;
import com.xztx.mapper.LabelDao;
import com.xztx.service.LabelService;
import com.xztx.util.IdWorker;
import com.xztx.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    @Transactional
    public void add(LabelDTO label) {
        label.setId(idWorker.nextId() + "");//设置ID
        label.setState("1");
        label.setCreateBy("xztx");
        label.setUpdateBy("xztx");
        label.setCreateTime(DateUtil.dateToStamp(new Date()));
        label.setUpdateTime(DateUtil.dateToStamp(new Date()));
        labelDao.saveLabel(label);
    }

    /**
     * 查询所有的标签
     * @return
     */
    @Override
    public List<LabelDTO> finAll() {
        return labelDao.findAll();
    }

    /**
     * 根据id查询单个标签
     * @param id
     * @return
     */
    @Override
    public LabelDTO findOne(String id) {
        return labelDao.findOne(id);
    }

    /**
     * 根据id修改标签内容
     * @param label
     */
    @Transactional
    @Override
    public void updateLabel(LabelDTO label) {
        label.setUpdateTime(DateUtil.dateToStamp(new Date()));
        labelDao.updateLabel(label);
    }

    /**
     * 根据id 删除标签
     * @param id
     */
    @Transactional
    @Override
    public void deleteLabel(String id) {
        LabelDTO labelDTO = new LabelDTO();
        labelDTO.setId(id);
        labelDTO.setState("0");
        labelDTO.setUpdateTime(DateUtil.dateToStamp(new Date()));
        labelDao.updateLabel(labelDTO);
    }

    /**
     * 条件查询
     * @param labelDTO
     * @return
     */
    @Override
    public PageInfo<LabelDTO> findSearch(LabelDTO labelDTO) {
        int pageNum = labelDTO.getPageNum();
        int pageSize = labelDTO.getPageSize();

        PageHelper.startPage(pageNum, pageSize);
        List<LabelDTO> list = labelDao.findSearch(labelDTO);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

}
