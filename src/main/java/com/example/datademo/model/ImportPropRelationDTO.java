package com.example.datademo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 属性映射关系表
 * </p>
 *
 * @author ZY
 * @since 2022-06-13
 */
@Data
@ApiModel(value = "ImportPropRelationDao对象", description = "属性映射关系表")
public class ImportPropRelationDTO{

    private Long id;

    private Long instanceId;

    @ApiModelProperty("属性值")
    private String property;

    @ApiModelProperty("真实属性值")
    private String propertyReal;

    @ApiModelProperty("外键引用数据类型")
    private String refType;

    @ApiModelProperty("引用属性")
    private String refProperty;

    private Long createUser;

    private Long updateUser;

    private Integer isDelete;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
