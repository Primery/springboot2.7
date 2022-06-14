package com.example.datademo.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 导入的数据快照
 * </p>
 *
 * @author ZY
 * @since 2022-06-14
 */
@Getter
@Setter
@TableName("import_data_snap")
public class ImportDataSnapDao implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 数据id
     */
    private Long instanceId;

    /**
     * 真实属性值
     */
    private String valueJson;

    /**
     * 转换后属性值
     */
    private String mapperJson;

    /**
     * 转换状态 0未转换 1 转换中 2 转换完成
     */
    private Integer mapperStatus;

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
