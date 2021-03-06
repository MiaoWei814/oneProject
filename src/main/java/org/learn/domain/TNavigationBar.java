package org.learn.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class TNavigationBar {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 路径
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

    /**
     * 创建时间
     */
    private Date createDate = new Date();

    /**
     * 类型id
     */
    private Long typeId;
}