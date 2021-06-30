package com.example.exam32.bookstore;

import com.example.exam32.bookstore.dto.BookStoreCheckoutRequest;
import com.example.exam32.bookstore.dto.BookStoreCheckoutResponse;
import com.example.exam32.bookstore.dto.BookStoreRequest;
import com.example.exam32.bookstore.dto.BookStoreResponse;
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

//    @PostMapping("/books/checkout")
//    public BookStoreCheckoutResponse checkout(@RequestBody BookStoreCheckoutRequest req){
//        BookStoreCheckoutResponse result = this.bookStoreService.checkoutBooks(req);
//        return result;
//    }
}
