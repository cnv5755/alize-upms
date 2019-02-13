package tech.tellme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Cloud Eureka 注册中心
 *
 * @author ediii
 * @date 2019年2月12日 17:23:17
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class AlizeCloudRegistrationCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlizeCloudRegistrationCenterApplication.class, args);
    }

}

