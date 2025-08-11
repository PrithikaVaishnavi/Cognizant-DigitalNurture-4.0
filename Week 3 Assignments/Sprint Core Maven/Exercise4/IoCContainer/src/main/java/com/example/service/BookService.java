package com.example.service;

import com.example.repository.BookRepository;
public class BookService 
{
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository) 
    {
        this.bookRepository = bookRepository;
        System.out.println("BookService initialized with BookRepository");
    }
    public void showAllBooks() 
    {
        System.out.println("BookService: Fetching books...");
        bookRepository.displayBooks();
    }
}
