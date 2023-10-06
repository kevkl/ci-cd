package com.example.integration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationApplicationTests {

	@Test
	void contextLoads() {
			IntegrationApplication a =new IntegrationApplication();
			assert a.calc(1,2) == 3;
	}


}
