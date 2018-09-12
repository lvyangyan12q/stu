package cn.jt.helloService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient("sidecar")
public interface SidecarServiceFeign {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String node();
}
