package com.example.exam32.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreRepository extends JpaRepository<BookStoreEntity, Integer> {
}
