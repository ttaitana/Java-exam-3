package com.example.exam32.bookstore.dto;

import com.example.exam32.bookstore.BookStoreEntity;

import java.util.List;

public class BookStoreCheckoutResponse{
	private double totalPrice;

	public BookStoreCheckoutResponse(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BookStoreCheckoutResponse() {
	}


	public double getTotalPrice(){
		return totalPrice;
	}

}
