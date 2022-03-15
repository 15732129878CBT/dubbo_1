package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Cbt
 * @createDate 2022-03-14 17:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{
    private Integer id;
    private String username;
    private Integer age;
}
