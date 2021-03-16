package com._520it.crm.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * role和employee是多对多的关系，一个雇员可以是多个角色 eg.CEO,CTO
 *                            一个角色也对应着多个雇员
 *
 */
@Getter
@Setter
public class Role {
    private Long id;

    private String name;//角色名

    private String sn;//角色编号

    //通过角色找到所有的权限
    private List<Permission> permissions = new ArrayList<>();

}