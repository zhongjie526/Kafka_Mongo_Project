package com.datateam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Customer("Maruthi", "Gerard"));
		repository.save(new Customer("Marcel", "Gerard"));

		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		System.out.println("Customer found with findByFirstName('Maruthi'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Maruthi"));

		System.out.println("Customers found with findByLastName('Gerard'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Gerard")) {
			System.out.println(customer);
		}

	}

}
