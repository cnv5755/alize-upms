package tech.tellme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ediii
 * @date 2019年2月13日23点07分
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AlizeBizServerApplication {


    @GetMapping("/alize")
    public String alize() {
        return "Hi Alize !@#$%";
    }

    public static void main(String[] args) {
        SpringApplication.run(AlizeBizServerApplication.class, args);
    }
}
