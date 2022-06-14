package com.example.datademo.service.dataimport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 数据导入处理抽象类
 */
@Service
public abstract class DataImportDealService {

    /**
     * 数据处理策略
     * @return
     */
    public abstract boolean dealData();

    /**
     * 导入数据入库
     *
     * @param instance
     * @return
     */
    public boolean dataSave(String instance) {
        return true;
    }

    /**
     * 数据映射处理
     *
     * @param instance
     * @return
     */
    public boolean dataMapper(String instance) {
        return true;
    }

}
