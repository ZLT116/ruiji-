package com.itheima.reggie.common;

/**
 * @author zlt
 * 基于ThreadLocal封装工具类,用于保存和获取当前登录用户id
 * @date 2022/10/6 - 11:21
 */
public class BaseContext {
    private  static  ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /*
    * 用来设置值的
    * */
    public static void  setCurrentId(Long id){
        threadLocal.set(id);
    }
    /*
    * 用来获取值的
    * */
    public  static  Long getCurrentId() {
        return threadLocal.get();
    }
}
