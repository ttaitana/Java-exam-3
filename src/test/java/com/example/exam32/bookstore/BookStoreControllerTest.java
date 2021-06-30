package com.example.exam32.bookstore;

import com.example.exam32.bookstore.dto.BookStoreCheckoutRequest;
import com.example.exam32.bookstore.dto.BookStoreCheckoutResponse;
import com.example.exam32.bookstore.dto.BookStoreRequest;
import com.example.exam32.bookstore.dto.BookStoreResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookStoreControllerTest {
    @Autowired
    TestRestTemplate restTemplate;

    @Autowired
    BookStoreRepository bookStoreRepository;

    @Test
    public void callAPIWithPathVariableAndDatabase(){

//       ? Create Data
        bookStoreRepository.save(new BookStoreEntity(10, 400, 1, "test"));

//       ? Call API
        BookStoreResponse response = restTemplate.getForObject("/books/1", BookStoreResponse.class);

//       ? Testing Zone
        BookStoreResponse expect = new BookStoreResponse(10, 400,1, "test");
        assertEquals(expect, response);
    }

    @Test
    public void callCreateEmployeeApi(){
        BookStoreResponse expect = new BookStoreResponse(10, 400, 5, "test");
        BookStoreRequest req = new BookStoreRequest(10, 400, "test");
        BookStoreResponse response = restTemplate.postForObject("/books", req,  BookStoreResponse.class);
        assertEquals(10, response.getAmount());
        assertEquals(400, response.getPrice());
        assertEquals("test", response.getBookName());
    }

    @Test
    public void checkoutTest(){
        double expect = (100 * 4 * 0.8) + (100 * 2 * 0.95);
        List<Integer> reqBody = Arrays.asList(1, 1, 2, 2, 3, 4);
        BookStoreCheckoutRequest req = new BookStoreCheckoutRequest(reqBody);
        BookStoreCheckoutResponse response = restTemplate.postForObject("/books/checkout", req,  BookStoreCheckoutResponse.class);
        assertEquals(expect, response.getTotalPrice());
    }
}