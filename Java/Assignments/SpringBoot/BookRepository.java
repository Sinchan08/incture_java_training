package com.example.second_springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.second_springboot.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
