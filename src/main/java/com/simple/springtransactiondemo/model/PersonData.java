package com.simple.springtransactiondemo.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * author: mimu
 * date: 2018/12/3
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonData {
    private int pid;
    private String nickName;
}
