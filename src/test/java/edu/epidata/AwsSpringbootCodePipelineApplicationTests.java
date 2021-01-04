package edu.epidata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import edu.epidata.controller.EpidataController;

@SpringBootTest
class AwsSpringbootCodePipelineApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Test
	void withName() {
		EpidataController ec = new EpidataController();
		assertEquals("Hello Juan", ec.helloService("Juan"));
	}
	
	@Test
	void withOutName() {
		EpidataController ec = new EpidataController();
		assertEquals("Hello world!", ec.helloService(null));
	}
}
