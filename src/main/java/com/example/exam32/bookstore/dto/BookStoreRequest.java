package com.example.exam32.bookstore.dto;

public class BookStoreRequest{
	private int amount;
	private int price;
	private String bookName;

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setBookName(String bookName){
		this.bookName = bookName;
	}

	public String getBookName(){
		return bookName;
	}

	public BookStoreRequest() {
	}

	public BookStoreRequest(int amount, int price, String bookName) {
		this.amount = amount;
		this.price = price;
		this.bookName = bookName;
	}
}
