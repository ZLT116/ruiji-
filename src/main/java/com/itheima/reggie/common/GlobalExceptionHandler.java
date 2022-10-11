package com.itheima.reggie.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author zlt
 * @date 2022/10/5 - 14:23
 */
/*
* 全局异常处理
* */
@ControllerAdvice(annotations = { RestController.class, Controller.class})
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {
    /*
    * 异常处理方法
    * */
    @ExceptionHandler(CustomException.class)
    public  R<String> exceptionHandler(CustomException ex){
       log.error(ex.getMessage());

       return R.error(ex.getMessage());
    }
}
