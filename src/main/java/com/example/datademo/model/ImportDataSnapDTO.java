package com.example.datademo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@ApiModel(value = "ImportDataSnapDao对象", description = "导入的数据快照")
@Data
public class ImportDataSnapDTO {

    private Long id;

    @ApiModelProperty("数据id")
    private Long instanceId;

    @ApiModelProperty("真实属性值")
    private String valueJson;

    @ApiModelProperty("转换后属性值")
    private String mapperJson;

    @ApiModelProperty("转换状态 0未转换 1 转换中 2 转换完成")
    private Integer mapperStatus;

    private String createUser;

    private Long updateUser;

    private Long updateTime;

    private Integer isDelete;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

}
