package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.jt.helloService.EurekaServiceFeign;
import cn.jt.helloService.SidecarServiceFeign;

@RestController
public class HelloController {
	
	@Autowired
	EurekaServiceFeign eurekaServiceFeign;
	@Autowired
	SidecarServiceFeign sidecarServiceFeign;
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="helloFallback")//指定一个失败时的方法名
	public String hello(@PathVariable String name){
		return eurekaServiceFeign.hello(name);
	}
	
	//对应上面的方法，参数列表和返回值必须与上面一致
	public String helloFallback(String name){
		return "hell陈威";
	}
	//
	@RequestMapping("/node")
	public String node(){
		return sidecarServiceFeign.node();
	}
}
