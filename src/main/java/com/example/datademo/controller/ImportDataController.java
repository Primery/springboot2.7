package com.example.datademo.controller;

import com.example.datademo.common.model.R;
import com.example.datademo.model.ImportInstanceDTO;
import com.example.datademo.service.dataimport.DataImportInstanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("importData")
@Api(tags = "数据导入控制层")
public class ImportDataController {

    @Autowired
    private DataImportInstanceService instanceService;

    @PostMapping("/save")
    @ApiOperation("数据保存")
    public R<Boolean> instanceSaves(@RequestBody ImportInstanceDTO importInstanceDTO) {
        return R.data(instanceService.instanceSaves(Arrays.asList(importInstanceDTO)));
    }

}
