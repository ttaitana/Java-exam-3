package com.example.exam32.bookstore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookStoreEntity {
	@Column
	private int amount;

	@Column
	private int price;

	@Id
	@GeneratedValue
	private int id;

	@Column
	private String bookName;

	public BookStoreEntity(int amount, int price, int id, String bookName) {
		this.amount = amount;
		this.price = price;
		this.id = id;
		this.bookName = bookName;
	}

	public BookStoreEntity(int amount, int price, String bookName) {
		this.amount = amount;
		this.price = price;
		this.bookName = bookName;
	}

	public BookStoreEntity() {
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
