package com.sanghun.fullstack.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResultVO {
    private Integer code;
    private String message;
}