package com.klu.controller;


import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.klu.model.Book;

@RestController
public class LibraryController {

    List<Book> bookList = new ArrayList<>();

    // 1️⃣ Welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library";
    }

    // 2️⃣ Count
    @GetMapping("/count")
    public int countBooks() {
        return 100;
    }

    // 3️⃣ Price
    @GetMapping("/price")
    public double getPrice() {
        return 499.99;
    }

    // 4️⃣ List of book titles
    @GetMapping("/books")
    public List<String> getBooks() {
        return Arrays.asList("Spring", "Java", "Python");
    }

    // 5️⃣ PathVariable – Book by ID
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Book details for ID: " + id;
    }

    // 6️⃣ RequestParam – Search
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book: " + title;
    }

    // 7️⃣ PathVariable – Author
    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by: " + name;
    }

    // 8️⃣ POST – Add Book
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully";
    }

    // 9️⃣ View all added books
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}