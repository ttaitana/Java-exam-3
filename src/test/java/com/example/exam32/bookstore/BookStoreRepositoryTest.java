package com.example.exam32.bookstore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BookStoreRepositoryTest {
    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Test
    public void foundWithId(){
        BookStoreEntity data = new BookStoreEntity(10, 400, 1, "test");
        bookStoreRepository.save(data);

        BookStoreEntity bookStore = bookStoreRepository.getById(1);
        assertEquals(1, bookStore.getId());
        assertEquals(10, bookStore.getAmount());
        assertEquals(400, bookStore.getPrice());
        assertEquals("test", bookStore.getBookName());
    }
}