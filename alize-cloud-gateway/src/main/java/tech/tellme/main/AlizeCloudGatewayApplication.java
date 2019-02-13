package tech.tellme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ediii
 * @date 2019年2月13日22点29分
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AlizeCloudGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(AlizeCloudGatewayApplication.class, args);
    }

}
