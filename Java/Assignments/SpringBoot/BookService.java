package com.example.second_springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.second_springboot.dao.BookRepository;
import com.example.second_springboot.entities.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	public List<Book> getAllBooks()
	{
		List<Book> students=(List<Book>)bookRepository.findAll();
		return students;
	}
	public Book getBook(long id) {
		Optional<Book> optional=bookRepository.findById(id);
		Book b=optional.get();
		return b;
	}
	public Book addBook(Book b) {
		Book book=bookRepository.save(b);
		return book;
	}
	public Book updateBook(long id,Book b) {
		b.setId(id);
		Book book=bookRepository.save(b);
		return book;
	}
	public void deleteBook(long id) {
		bookRepository.deleteById(id);
	}
	
		
	}


