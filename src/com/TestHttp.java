package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/**
 * @author: yuanbing
 * @created time: 2020/1/25 22:46
 * @description:
 */

public class TestHttp {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            // if (i % 3 == 0) {
            String key = "<xml><ToUserName><![CDATA[gh_0c745d932b25]]></ToUserName><FromUserName><![CDATA[o4bxdw5iysEPibi-xv1Wg8XbASMg]]></FromUserName><CreateTime>134883186" + i + "</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[4月20号7点50分提醒我去抢杭州消费券：" + i + "]]></Content><MsgId>1234567890123456" + i + "</MsgId></xml>";
            String sr = TestHttp.sendPost("http://weixinnotification.cn:8080/weixin/checkWxToken", key);
            //String sr = TestHttp.sendPost("http://192.168.1.5:8080/checkWxToken", key);
            System.out.println(sr);
            String key1 = "<xml><ToUserName><![CDATA[gh_0c745d932b25]]></ToUserName><FromUserName><![CDATA[o4bxdw5iysEPibi-xv1Wg8XbASMg]]></FromUserName><CreateTime>1348831860" + i + "</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[1]]></Content><MsgId>1234567890123456" + i + "</MsgId></xml>";
            String sr1 = TestHttp.sendPost("http://weixinnotification.cn:8080/weixin/checkWxToken", key1);
            //String sr1 = TestHttp.sendPost("http://192.168.1.5:8080/checkWxToken", key1);
            System.out.println(sr1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            } else if(i%3==1) {
//                String key = "<xml><ToUserName><![CDATA[gh_0c745d932b25]]></ToUserName><FromUserName><![CDATA[o4bxdw5iysEPibi-xv1Wg8XbASMg]]></FromUserName><CreateTime>134883186" + i + "</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[今天下午10点30分提醒我去开会" + i + "]]></Content><MsgId>1234567890123456" + i + "</MsgId></xml>";
//                String sr = TestHttp.sendPost("http://weixinnotification.cn:8080/weixin/checkWxToken", key);
//                //String sr = TestHttp.sendPost("http://192.168.1.5:8080/checkWxToken", key);
//                System.out.println(sr);
//                String key1 = "<xml><ToUserName><![CDATA[gh_0c745d932b25]]></ToUserName><FromUserName><![CDATA[o4bxdw5iysEPibi-xv1Wg8XbASMg]]></FromUserName><CreateTime>1348831860" + i + "</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[1]]></Content><MsgId>1234567890123456" + i + "</MsgId></xml>";
//                String sr1 = TestHttp.sendPost("http://weixinnotification.cn:8080/weixin/checkWxToken", key1);
//                //String sr1 = TestHttp.sendPost("http://192.168.1.5:8080/checkWxToken", key1);
//                System.out.println(sr1);
//            }else if(i%3==2){
//                String key = "<xml><ToUserName><![CDATA[gh_0c745d932b25]]></ToUserName><FromUserName><![CDATA[o4bxdw445bnaUe3Ci9mbHiH9DGSM]]></FromUserName><CreateTime>134883186" + i + "</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[今天下午9点30分提醒我去开会" + i + "]]></Content><MsgId>1234567890123456" + i + "</MsgId></xml>";
//                String sr = TestHttp.sendPost("http://weixinnotification.cn:8080/weixin/checkWxToken", key);
//                //String sr = TestHttp.sendPost("http://192.168.1.5:8080/checkWxToken", key);
//                System.out.println(sr);
//                String key1 = "<xml><ToUserName><![CDATA[gh_0c745d932b25]]></ToUserName><FromUserName><![CDATA[o4bxdw445bnaUe3Ci9mbHiH9DGSM]]></FromUserName><CreateTime>1348831860" + i + "</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[1]]></Content><MsgId>1234567890123456" + i + "</MsgId></xml>";
//                String sr1 = TestHttp.sendPost("http://weixinnotification.cn:8080/weixin/checkWxToken", key1);
//                //String sr1 = TestHttp.sendPost("http://192.168.1.5:8080/checkWxToken", key1);
//                System.out.println(sr1);
//            }

        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        for (int i = 0; i < 200; i++) {
//            if(i%2==0){
//                String key = "<xml><ToUserName><![CDATA[gh_0c745d932b25]]></ToUserName><FromUserName><![CDATA[o4bxdw04mkiupM9awqiZYRyfPvKQ]]></FromUserName><CreateTime>1348831860"+i+"</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[1]]></Content><MsgId>1234567890123456"+i+"</MsgId></xml>";
//                String sr = TestHttp.sendPost("http://286315b1z0.qicp.vip/checkWxToken", key);
//                System.out.println(sr);
//            }else{
//                String key = "<xml><ToUserName><![CDATA[gh_0c745d932b25]]></ToUserName><FromUserName><![CDATA[o4bxdw5iysEPibi-xv1Wg8XbASMg]]></FromUserName><CreateTime>1348831860"+i+"</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[1]]></Content><MsgId>1234567890123456"+i+"</MsgId></xml>";
//                String sr = TestHttp.sendPost("http://286315b1z0.qicp.vip/checkWxToken", key);
//                System.out.println(sr);
//            }
//
//        }

    }

    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", "application/xml");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}
