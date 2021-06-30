package com.example.exam32.bookstore.dto;

import java.util.List;

public class BookStoreCheckoutRequest{
	private List<Integer> booksList;

	public BookStoreCheckoutRequest(List<Integer> booksList) {
		this.booksList = booksList;
	}

	public BookStoreCheckoutRequest() {
	}

	public List<Integer> getBooksList(){
		return booksList;
	}
}