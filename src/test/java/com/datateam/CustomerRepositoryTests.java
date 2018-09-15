package com.datateam;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTests {

	@Autowired
	CustomerRepository repository;

	Customer maruthi, marcel, santosh;

	@Before
	public void setUp() {

		repository.deleteAll();

		maruthi = repository.save(new Customer("Maruthi", "Gerard"));
		marcel = repository.save(new Customer("Marcel", "Gerard"));
		santosh = repository.save(new Customer("Santosh", "Panda"));
	}

	@Test
	public void setsIdOnSave() {

		assertThat(maruthi.id).isNotNull();
	}

	@Test
	public void findsByLastName() {

		List<Customer> result = repository.findByLastName("Panda");

		assertThat(result).hasSize(1).extracting("firstName").contains("Santosh");
	}

	@Test
	public void findsByExample() {

		Customer probe = new Customer(null, "Gerard");

		List<Customer> result = repository.findAll(Example.of(probe));

		assertThat(result).hasSize(2).extracting("firstName").contains("Maruthi", "Marcel");
	}
}