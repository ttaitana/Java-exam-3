package com.example.exam32.bookstore.dto;

import java.util.Objects;

public class BookStoreResponse{
	private int amount;
	private int price;
	private int id;
	private String bookName;

	public BookStoreResponse(int amount, int price, int id, String bookName) {
		this.amount = amount;
		this.price = price;
		this.id = id;
		this.bookName = bookName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BookStoreResponse)) return false;
		BookStoreResponse that = (BookStoreResponse) o;
		return getAmount() == that.getAmount() &&
				getPrice() == that.getPrice() &&
				getId() == that.getId() &&
				Objects.equals(getBookName(), that.getBookName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getAmount(), getPrice(), getId(), getBookName());
	}

	public BookStoreResponse() {
	}

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

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setBookName(String bookName){
		this.bookName = bookName;
	}

	public String getBookName(){
		return bookName;
	}
}
