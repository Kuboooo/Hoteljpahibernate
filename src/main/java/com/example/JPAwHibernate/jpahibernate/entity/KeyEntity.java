package com.example.JPAwHibernate.jpahibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass()
public class KeyEntity {

    @Id
    @Column(name = "pk", unique = true)
    @Getter
    @Setter
    private String pk;

}
