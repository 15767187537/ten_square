package com.xztx.service.impl;

import com.xztx.entity.LabelDTO;
import com.xztx.mapper.LabelDao;
import com.xztx.service.LabelService;
import com.xztx.util.IdWorker;
import com.xztx.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

}
