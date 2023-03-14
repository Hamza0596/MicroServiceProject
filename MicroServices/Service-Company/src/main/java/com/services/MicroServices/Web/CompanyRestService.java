package com.services.MicroServices.Web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class CompanyRestService {
	@Value("${xParam}")
	private int xParam;
	@Value("${me}")
	private String me;

	@GetMapping("/myConfig")
	public java.util.Map<String, Object> myConfig(){
		java.util.Map<String, Object> params = new HashMap<>();
		params.put("xParam", xParam);
		params.put("me", me);
		return params;
		 
	}
}
