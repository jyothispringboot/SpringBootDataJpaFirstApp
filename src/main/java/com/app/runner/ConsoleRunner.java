package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		Product p=repo.save(new Product("A",23.3));
		System.out.println("Product id==" +p.getProductId());
		repo.save(new Product("b",43.5));
		repo.save(new Product("c",54.3));

	}

}
