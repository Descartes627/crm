package com._520it.crm.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 这只做最简单的字段。
 * 如果你们公司有需求要根据权限找角色，可以在Permission中维护List<Role>
 *     role和permission是多对多的关系
 *     一个角色对应多个权限，一个权限也对应多个角色
 */
@Getter@Setter
public class Permission {
    private Long id;

    private String name;

    private String resource;

}