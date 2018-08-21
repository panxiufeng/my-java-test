package com.pxf.project.servicefeign.client;

import com.pxf.project.servicefeign.client.fallback.ServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi", fallback =ServiceHiHystrix.class)
public interface ServiceHiClient {

    @RequestMapping(value = "/hi/index",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
