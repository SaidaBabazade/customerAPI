package com.kommunal.customerAPI.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyException extends RuntimeException{

    private  Integer code;
    private  String message;
    public MyException(Integer code, String message){
        super(message);
        this.code = code;

    }
    public   Integer getCode(){
        return  code;
    }

}
