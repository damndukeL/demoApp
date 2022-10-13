package com.ldd.demoApp.enumeration;

public enum ResultCode {

    OK(200, "success");


    private int code;
    private String message;

    ResultCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int code(){
        return code;
    }

    public String msg(){
        return message;
    }
}
