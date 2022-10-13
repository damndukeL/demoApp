package com.ldd.demoApp.response;

import com.ldd.demoApp.enumeration.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {

    private T data;

    private int code;

    private String message;

    public Result (int code, String message){
        this.code = code;
        this.message = message;
    }

    public Result (ResultCode resultCode, T data){
        this.code = resultCode.code();
        this.message = resultCode.msg();
        this.data = data;
    }

    public static <T> Result<T> success(Object body){
        return new Result(ResultCode.OK, body);
    }

    public static <T> Result<T> success(){
        return new Result(ResultCode.OK.code(), ResultCode.OK.msg());
    }

}
