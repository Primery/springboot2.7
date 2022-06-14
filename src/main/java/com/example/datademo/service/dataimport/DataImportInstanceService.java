package com.example.datademo.service.dataimport;

import com.example.datademo.model.ImportInstanceDTO;

import java.util.List;

/**
 * 节点信息管理service
 */
public interface DataImportInstanceService {

    /**
     * 节点数据保存
     * @return
     */
    boolean instanceSaves(List<ImportInstanceDTO> importInstanceDTOS);

    /**
     * 查询数据
     * @return
     */
    List<ImportInstanceDTO> instanceQuery(List<Long> ids);

    /**
     * 数据修改
     * @return
     */
    int instanceUpdate();

}
