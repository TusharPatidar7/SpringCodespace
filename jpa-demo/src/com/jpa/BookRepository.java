package com.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface BookRepository extends JpaRepository<Books, Long>{

}
