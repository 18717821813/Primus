package com.primus.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private String password;
    private String wechat_code;
    private String alipay_code;
    private String token;
    private String sex;
    private String birth;
    private String qr_code;
    private String photo;
    private String state;
}
