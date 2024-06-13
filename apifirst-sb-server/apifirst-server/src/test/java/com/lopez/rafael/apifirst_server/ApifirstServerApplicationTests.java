package com.lopez.rafael.apifirst_server;

import com.lopez.rafael.apifirst_server.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApifirstServerApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testDataLoads() {
		assertThat(customerRepository.count()).isGreaterThan(0L);
	}

}
