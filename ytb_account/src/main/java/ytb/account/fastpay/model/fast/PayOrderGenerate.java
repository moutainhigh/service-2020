package ytb.account.fastpay.model.fast;

import java.math.BigDecimal;

/**
 * Copyright@ Cchua
 * Author:Cchua
 * Date:2019/3/14
 */
public class PayOrderGenerate {public final String WeCaht = "WeChat";

    public final String AliPay = "AliPay";

    private String body;//支付标题

    private String subject; //支付信息

    private Long outTradeNo;//内部支付单号

    private String paymentMethod;//支付方式

    private String ip;//支付方式

    private BigDecimal totalAmount;//支付金額

    private boolean state;

    public String getWeCaht() {
        return WeCaht;
    }

    public String getAliPay() {
        return AliPay;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Long getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(Long outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}