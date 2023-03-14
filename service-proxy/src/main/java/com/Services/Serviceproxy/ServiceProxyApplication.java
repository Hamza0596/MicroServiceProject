package com.Services.Serviceproxy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;



@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProxyApplication.class, args);
	}

	@Bean
	public DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp){    
		return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);}

}
