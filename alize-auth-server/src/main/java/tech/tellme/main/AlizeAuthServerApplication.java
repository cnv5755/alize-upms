package tech.tellme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 授权服务
 *
 * @author ediii
 * @date 2019年2月14日20点53分
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAuthorizationServer
public class AlizeAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlizeAuthServerApplication.class, args);
    }
}
