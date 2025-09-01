package com.example.second_springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.second_springboot.service.BookService;
import com.example.second_springboot.entities.Book;



@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks()
	{
		List<Book> books=this.bookService.getAllBooks();
		return books;
	}
	
	@RequestMapping(path="/book/{b_id}",method=RequestMethod.GET)
	public Book getbook(@PathVariable("b_id")long id) {
	   return this.bookService.getBook(id);
	}
	
	@RequestMapping(path="/books",method=RequestMethod.POST)
	public Book addBookt(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	@RequestMapping(path="/book/{b_id}",method =RequestMethod.PUT)
	public Book updateBook(@PathVariable("b_id")long id, @RequestBody Book book) {
		return this.bookService.updateBook(id, book);
	}
	
	@RequestMapping(path="/book/{b_id}",method=RequestMethod.DELETE)
	public String deleteBook(@PathVariable("b_id") long id) {
		this.bookService.deleteBook(id);
		return "Book deleted sucessfully with ID:"+id;
	}
	

}
