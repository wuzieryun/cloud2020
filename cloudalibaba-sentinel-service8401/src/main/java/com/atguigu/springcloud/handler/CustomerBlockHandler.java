package com.atguigu.springcloud.handler;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

import javax.swing.text.BadLocationException;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BadLocationException exception)
    {
        return new CommonResult(444,"按kehuxing ------1");
    }
    public static CommonResult handlerException2(BadLocationException exception)
    {
        return new CommonResult(444,"按kehuxing ------2");
    }

}
