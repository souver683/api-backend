package com.light.apiinterface;

import com.light.apiclientsdk.client.ApiClient;
import com.light.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ApiInterfaceApplicationTests {
    @Resource
    private ApiClient apiClient;
    @Test
    void contextLoads() {
        String light = apiClient.getNameByname("light");
        System.out.println(light);
        User user=new User();
        user.setUsername("light");
        String usernameByPost = apiClient.getUsernameByPost(user);
        System.out.println(usernameByPost);

    }
    @Test
    void tests(){
        System.out.println("没问题");
    }

}
