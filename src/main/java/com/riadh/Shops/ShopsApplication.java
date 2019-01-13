package com.riadh.Shops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.riadh.Shops.Repository.CategoryRepository;
import com.riadh.Shops.model.Category;

@SpringBootApplication
public class ShopsApplication implements CommandLineRunner {
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ShopsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		categoryRepository.save(new Category("indest"));
		categoryRepository.save(new Category("Eco"));
		categoryRepository.save(new Category("Mat"));
		categoryRepository.save(new Category("tom"));
		categoryRepository.findAll().forEach(c->{
			System.out.println(c.getName());
		});
	}

}

