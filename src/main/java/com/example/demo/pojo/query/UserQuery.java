package com.example.demo.pojo.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQuery {
    private Integer pageNum = 1; // 起始页
    private Integer pageSize = 100; // 每页显示数量
    private String name;

}
