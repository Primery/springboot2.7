package com.example.datademo.service.dataimport.impl;

import com.example.datademo.service.dataimport.DataImportDealService;
import org.springframework.stereotype.Service;

/**
 * 数据导入处理抽象类
 */
@Service
public class DataImportSqlDealService extends DataImportDealService {

    /**
     * 数据处理策略
     *
     * @return
     */
    public boolean dealData() {
        return false;
    }

}
