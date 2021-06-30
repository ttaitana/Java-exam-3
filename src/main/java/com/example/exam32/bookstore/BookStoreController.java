package com.example.exam32.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {
    @Autowired
    private BookStoreService bookStoreService;

    @GetMapping("/books")
    public BookStoreResponse getBookById(@PathVariable String id){
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Invalid type of id");
        }
        return this.bookStoreService.getBook();
    }
}
