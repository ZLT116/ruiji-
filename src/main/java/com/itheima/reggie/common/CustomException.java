package com.itheima.reggie.common;

/**
 * @author zlt
 * 自定义业务异常类
 * @date 2022/10/6 - 21:11
 */
public class CustomException extends  RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
