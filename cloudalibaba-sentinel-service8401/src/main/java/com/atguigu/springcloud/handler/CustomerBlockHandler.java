package com.atguigu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

import javax.swing.text.BadLocationException;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(444,"按kehuxing ------1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按kehuxing ------2");
    }

}
