package com.example.datademo.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 数据导入节点
 * </p>
 *
 * @author ZY
 * @since 2022-06-14
 */
@Getter
@Setter
@TableName("import_instance")
public class ImportInstanceDao implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 状态 0 进行中 1 数据已确认 2 已完成
     */
    private Integer planStatus;

    /**
     * 数据结构
     */
    private String formation;

    private LocalDateTime updateTime;

    private Long createUser;

    /**
     * 更新时间
     */
    private Long updateUser;

    private Integer isDelete;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
