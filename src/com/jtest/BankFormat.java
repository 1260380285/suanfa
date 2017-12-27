package com.jtest;

import com.oracle.tools.packager.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @author: yuanbing
 * @created time: 2017/11/29 下午8:43
 * @description:
 */

class BankFormat {
    public static void main(String[] args) {
        System.out.println("123456789012345".replaceAll("\\d{4}(?!$)", "$0 "));
        System.out.println("1234567890123456".replaceAll("\\d{4}(?!$)", "$0 "));
        System.out.println("12345678901234567".replaceAll("\\d{4}(?!$)", "$0 "));
        System.out.println("123456789012345678".replaceAll("\\d{4}(?!$)", "$0 "));
        System.out.println(RechargePayType.getMessage("ALIPAY"));
        show();
    }

    private static void show() {
        String email = "你好吗";
        Pattern p = compile("^(\\w{1})(\\w+)(\\w{1})$");
        Matcher m = p.matcher(email);
        System.out.println(m.replaceAll("$1*$3"));


       /* email = "you";
        String aa = "";
        for (int i = 0; i < email.length() - 6; i++) {
            aa += "*";
        }
        String pa = "$1" + aa + "$3";
        System.out.println(email.replaceAll(regex, pa));
        return null;*/
    }

    enum RechargePayType {
        CASH("现金"),
        SCAN("扫码"),
        ALIPAY("支付宝"),
        WXPAY("微信"),
        UMS_SCAN("银联扫码"),
        YIPAY_BARCODE("翼支付扫码"),
        WECHAT("微信"),
        POS("银行卡"),
        UMS("银联刷卡"),
        VOUCHERS("代金券"),
        PHYSICAL_COUPON("实体券"),
        ANONYMOUS_CARD("充值卡"),
        PREPAID_CARD("预付卡"),
        OTHER_PAY("其它支付");

        private String message;

        RechargePayType(String msg) {
            this.message = msg;
        }

        public static String getMessage(String msg) {
            for (RechargePayType rechargePayType : RechargePayType.values()) {
                if (rechargePayType.name().equals(msg)) {
                    return rechargePayType.message;
                }
            }
            return null;
        }
    }

}
