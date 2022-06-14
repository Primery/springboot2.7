package com.example.datademo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 数据导入节点
 * </p>
 *
 * @author LMGD
 * @since 2022-06-13
 */
@Data
@ApiModel(value = "ImportInstanceDao对象", description = "数据导入节点")
public class ImportInstanceDTO {

    private Long id;

    @ApiModelProperty("数据类型")
    private String dataType;

    @ApiModelProperty("租户id")
    private String tenantId;

    @ApiModelProperty("状态 0 进行中 1 数据已确认 2 已完成")
    private Integer planStatus;

    @ApiModelProperty("数据结构")
    private String formation;

    private LocalDateTime updateTime;

    private Long createUser;

    private Long updateUser;

    private Integer isDelete;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;


}
