package com.light.apiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;


/**
 * @author light
 * @version 1.0
 * @project api-interface
 * @description 生前签名工具类
 * @data 2023/3/12 15 : 01 : 34
 */
public class signUtil {
    /**
     * 生成签名工具类
     * @param
     * @param secretKey
     * @return
     */
    public static String getSign(String body, String secretKey){
        Digester md5=new Digester(DigestAlgorithm.SHA256);
        String content=body+"."+secretKey;
        return md5.digestHex(content);
    }
}
