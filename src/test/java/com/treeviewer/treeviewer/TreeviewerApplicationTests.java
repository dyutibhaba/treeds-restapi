package com.treeviewer.treeviewer;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.treeviewer.response.DuTTreeWrapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TreeviewerApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testName() throws Exception {
		
		ResponseEntity<DuTTreeWrapper> respnse = restTemplate.getForEntity("/getdutstructure", DuTTreeWrapper.class);
		Assertions.assertThat(respnse.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
