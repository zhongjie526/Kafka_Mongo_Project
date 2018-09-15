package com.datateam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datateam.model.Customer;
import com.datateam.model.Item;
import com.datateam.model.Transaction;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		setUp();
	}
	
	private void setUp() {
		repository.deleteAll();
		
		Customer maruthi = new Customer("Maruthi", "Gerard");
		Transaction trans1 = new Transaction();
		try {
			
			Thread.sleep(2000);
			
		}catch(InterruptedException e) {}
		Transaction trans2 = new Transaction();
		Item item1 = new Item("Mac",4000D);
		Item item2 = new Item("Things he don't need",20000D);
		Item item3 = new Item("Drone",500D);
		trans1.addItem(item1);
		trans1.addItem(item2);
		trans2.addItem(item3);
		maruthi.addTransaction(trans1);
		maruthi.addTransaction(trans2);

		repository.save(maruthi);
		
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
