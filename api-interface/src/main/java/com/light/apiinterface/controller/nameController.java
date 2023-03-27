package com.light.apiinterface.controller;


import com.light.apiclientsdk.model.User;
import com.light.apiclientsdk.utils.signUtil;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;



/**
 * @author light
 * @version 1.0
 * @project api-interface
 * @description
 * @data 2023/3/12 09 : 52 : 43
 */
@RestController
@RequestMapping("/name")
public class nameController {
    @GetMapping("/get")
    public String getNameByGet(String name){
        return "他的名称是："+name;
    }
    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "他的名称是："+name;
    }
    @PostMapping("/username")
    public String getUserNameByPost(@RequestBody User user){
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String body = request.getHeader("body");
//        String sign = request.getHeader("sign");
//        String timeStamp = request.getHeader("timeStamp");
//        //todo 在数据库中比对是否与 数据库中的accessKey一致
//        if(!accessKey.equals("light")){
//            throw new RuntimeException("无权限！");
//        }
//        if (Long.parseLong(nonce)>10000){
//            throw new RuntimeException("无权限！");
//        }
//        //todo time 不能从发送到接受超过5 分钟
////        if (timeStamp>0){
////
////        }
//        //todo 实际是去数据库中取出数据
//        String serverSign = signUtil.getSign(body,"abcdefg");
//        if (!sign.equals(serverSign)){
//            throw new RuntimeException("无权限！");
//        }
          return "他的名称是："+user.getUsername();
    }

}
