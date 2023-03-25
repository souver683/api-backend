package com.light.apiclientsdk;

import com.light.apiclientsdk.client.ApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author light
 * @version 1.0
 * @project api-clien-api
 * @description
 * @data 2023/3/12 15 : 49 : 47
 */
@Configuration
@ConfigurationProperties("light.client")
@Data
@ComponentScan
public class ApiClientConfig {
    private String accessKey;
    private String secretKey;
    @Bean
    public ApiClient apiClient(){
        return new ApiClient(accessKey,secretKey);
    }
}
