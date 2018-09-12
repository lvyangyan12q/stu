package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringCloudApplication
@EnableFeignClients
//@EnableCircuitBreaker//背后springcloud使用的是hystrix
public class RunAppHystrix {
//	@Bean 
//	@LoadBalanced//ribbon负载均衡
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}
	public static void main(String[] args) {
		SpringApplication.run(RunAppHystrix.class, args);
	}
}
