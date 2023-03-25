package com.light.apiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.light.apiclientsdk.model.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;


import java.util.HashMap;
import java.util.Map;

import static com.light.apiclientsdk.utils.signUtil.getSign;


/**
 * @author light
 * @version 1.0
 * @project api-interface
 * @description
 * @data 2023/3/12 10 : 07 : 05
 */
public class ApiClient {
    private String accessKey;
    private String secretKey;

    private static final String REQUEST_PREFIX="http://localhost:8090/api";
    public ApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByname(String name){
        HashMap<String,Object> map=new HashMap<>();
        map.put("name",name);
        String s = HttpUtil.get(REQUEST_PREFIX+"/name/get", map);
        System.out.println(s);
        return s;
    }
    public String getNameByPost(String name){
        HashMap<String,Object> map=new HashMap<>();
        map.put("name",name);
        String s = HttpUtil.post(REQUEST_PREFIX+"/name/post", map);
        System.out.println(s);
        return s;
    }
    public String getUsernameByPost(User user){
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(REQUEST_PREFIX+"/name/username")
                .addHeaders(getHeader(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        System.out.println(httpResponse.body());
        return httpResponse.body();
    }


    public Map<String,String> getHeader(String body){
        Map<String,String> hashMap=new HashMap<>();
        hashMap.put("accessKey",accessKey);
//       不能发送给前端
//        hashMap.put("secretKey",secretKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body",body);
        hashMap.put("timeStamp",String.valueOf(System.currentTimeMillis()/1000));
        hashMap.put("sign",getSign(body,secretKey));
        return hashMap;
    }

}
