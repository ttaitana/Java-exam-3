package com.example.exam32.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookStoreService {
    @Autowired
    private BookStoreRepository bookStoreRepository;

    public void setBookStoreRepository(BookStoreRepository bookStoreRepository) {
        this.bookStoreRepository = bookStoreRepository;
    }

    public BookStoreResponse getBook(int id) {
        Optional<BookStoreEntity> result = this.bookStoreRepository.findById(id);
        return this.responseMapping(result);
    }

    public BookStoreResponse createBook(BookStoreRequest req){
        BookStoreEntity book = new BookStoreEntity(req.getAmount(), req.getPrice(), req.getBookName());
        BookStoreEntity result = this.bookStoreRepository.save(book);
        return this.responseMapping(Optional.of(result));
    }

    private BookStoreResponse responseMapping(Optional<BookStoreEntity> ent){
        if(ent.isPresent()){
            BookStoreEntity emp = ent.get();
            return new BookStoreResponse(emp.getAmount(), emp.getPrice(), emp.getId(), emp.getBookName());
        }
//       ? Not found!!
//        throw new EmployeeNotFoundException(String.format("Employee id %d not found", id));
        return new BookStoreResponse();
    }
}
