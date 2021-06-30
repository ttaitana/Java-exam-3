package com.example.exam32.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookStoreController {
    @Autowired
    private BookStoreService bookStoreService;

    @GetMapping("/books")
    public List<BookStoreResponse> getAllBook(){
        List<BookStoreResponse> result = this.bookStoreService.getAllBooks();
        return result;
    }

    @GetMapping("/books/{id}")
    public BookStoreResponse getBookById(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Invalid type of id");
        }
        BookStoreResponse result = this.bookStoreService.getBook(_id);
        return result;
    }

    @PostMapping("/books")
    public BookStoreResponse createBookStore(@RequestBody BookStoreRequest req){
        BookStoreResponse result = this.bookStoreService.createBook(req);
        return result;
    }
}
