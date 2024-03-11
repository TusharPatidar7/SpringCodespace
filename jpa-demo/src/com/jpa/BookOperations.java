package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookOperations {
	
	@Autowired
	BookRepository repo;
	
	public void addBooks() {

		Books book1 = new Books();
		book1.setId(3);
		book1.setTitle("C reference");
		book1.setPrice(350);
		
		repo.save(book1);
	}
}
