package com.services.MicroServices;

import java.util.stream.Stream;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.services.MicroServices.Dao.CompanyRepository;
import com.services.MicroServices.Entities.Company;
@SpringBootApplication
@EnableDiscoveryClient
public class MicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesApplication.class, args);
	}

	@Bean
	CommandLineRunner strat(CompanyRepository companyRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cn->{
				companyRepository.save(new Company(null, cn, Math.random()*900));

			});
			companyRepository.findAll().forEach(c->System.out.println(c.toString()) );
		};
		
	}
}
