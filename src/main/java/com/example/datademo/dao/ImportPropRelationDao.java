package com.example.datademo.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 属性映射关系表
 * </p>
 *
 * @author ZY
 * @since 2022-06-14
 */
@Getter
@Setter
@TableName("import_prop_relation")
public class ImportPropRelationDao implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long instanceId;

    /**
     * 属性值
     */
    private String property;

    /**
     * 真实属性值
     */
    private String propertyReal;

    /**
     * 外键引用数据类型
     */
    private String refType;

    /**
     * 引用属性
     */
    private String refProperty;

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

    private LocalDateTime updateTime;


}
