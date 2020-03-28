package com.sourav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sourav.model.Books;
import com.sourav.service.BooksService;

@RestController
public class BooksController {
	@Autowired
	private BooksService booksService;

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		return booksService.getAllBooks();
	}

	@GetMapping("/book/{bookid}")
	public Books getBookDetsils(@PathVariable("bookid") int bookid) {
		return booksService.getBooksById(bookid);

	}

	@PostMapping("/books")
	public int saveBook(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books.getBookid();

	}

	@DeleteMapping("/book/{bookid}")
	public void deleteBook(@PathVariable("bookid") int bookid) {
		booksService.delete(bookid);
	}

	@PutMapping("/books")
	public Books updateBooks(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books;

	}

}
