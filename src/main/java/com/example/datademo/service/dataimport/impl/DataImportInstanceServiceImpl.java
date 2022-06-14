package com.example.datademo.service.dataimport.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.datademo.dao.ImportInstanceDao;
import com.example.datademo.mapper.ImportInstanceMapper;
import com.example.datademo.model.ImportInstanceDTO;
import com.example.datademo.service.dataimport.DataImportInstanceService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 节点信息管理service
 */
@Service
public class DataImportInstanceServiceImpl extends ServiceImpl<ImportInstanceMapper, ImportInstanceDao>  implements DataImportInstanceService {


    @Override
    public boolean instanceSaves(List<ImportInstanceDTO> importInstanceDTOS) {
        if (CollectionUtils.isEmpty(importInstanceDTOS)) {
            return false;
        }
        List<ImportInstanceDao> res = importInstanceDTOS.stream().map(item->{
            ImportInstanceDao importInstanceDao = new ImportInstanceDao();
            BeanUtils.copyProperties(item,importInstanceDao);
            return importInstanceDao;
        }).collect(Collectors.toList());
        return this.saveBatch(res);
    }

    @Override
    public List<ImportInstanceDTO> instanceQuery(List<Long> ids) {
        List<ImportInstanceDao> res = this.listByIds(ids);
        return res.stream().map(item->{
            ImportInstanceDTO dto = new ImportInstanceDTO();
            BeanUtils.copyProperties(item,dto);
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public int instanceUpdate() {
        return 0;
    }
}
