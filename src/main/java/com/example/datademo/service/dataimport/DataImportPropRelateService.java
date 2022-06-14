package com.example.datademo.service.dataimport;

import com.example.datademo.model.ImportPropRelationDTO;

import java.util.List;

/**
 * 节点属性映射配置
 */
public interface DataImportPropRelateService {

    /**
     * 节点属性映射配置保存
     * @return
     */
    int propRelateSaves(ImportPropRelationDTO importPropRelationDTO);

    /**
     * 查询数据
     * @return
     */
    List<ImportPropRelationDTO> propRelateQuery();

}
