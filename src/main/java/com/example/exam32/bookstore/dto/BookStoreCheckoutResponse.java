package com.example.exam32.bookstore.dto;

import com.example.exam32.bookstore.BookStoreEntity;

import java.util.List;

public class BookStoreCheckoutResponse{
	private double totalPrice;
	private List<BookStoreResponse> items;

	public BookStoreCheckoutResponse() {
	}

	public BookStoreCheckoutResponse(double totalPrice, List<BookStoreResponse> items) {
		this.totalPrice = totalPrice;
		this.items = items;
	}

	public double getTotalPrice(){
		return totalPrice;
	}

	public List<BookStoreResponse> getItems(){
		return items;
	}
}
