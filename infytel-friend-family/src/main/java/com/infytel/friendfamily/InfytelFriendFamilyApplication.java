package com.infytel.friendfamily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InfytelFriendFamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfytelFriendFamilyApplication.class, args);
	}

}
