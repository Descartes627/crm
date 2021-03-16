package com._520it.crm.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private Long id;

    private String sn;//部门编号

    private String name;

    private Employee manager;

    private Department parent;

    private Boolean state;
}