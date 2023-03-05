package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class Demo3ApplicationTests {


	static {
		System.setProperty("com.amazonaws.sdk.disableEc2Metadata", "true");
	}

	@Test
	void contextLoads() {
	}

}
