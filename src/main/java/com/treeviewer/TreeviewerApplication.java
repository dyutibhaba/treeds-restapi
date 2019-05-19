package com.treeviewer;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreeviewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreeviewerApplication.class, args);
	}
	
	@PostConstruct
	public void checkRun(){
		System.out.println("Working!");
	}

}
