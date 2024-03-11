package com.kommunal.customerAPI.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class Response <T> {
    private T t ;
    private RespStatus status;
}
