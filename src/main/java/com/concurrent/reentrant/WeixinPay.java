package com.concurrent.reentrant;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/9/7
 * Time: 22:48
 */
public class WeixinPay extends Pay {

    @Override
    public synchronized void pay() {
        System.out.println("微信支付......");
        super.pay();
    }
}
