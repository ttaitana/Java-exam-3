package com.example.exam32.bookstore;

public class BookStore {
    private int bookPrice = 100;
    private String[] cart;


    public void increaseBookInCart(int index, int value) {
        this.bookInCart[index] = this.bookInCart[index] + value;
    }

    private int bookInCart[] = {0, 0, 0, 0, 0};

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String[] getCart() {
        return cart;
    }

    public void setCart(String[] cart) {
        this.cart = cart;
    }

    public BookStore() {
    }

    public BookStore(String[] cart) {
        this.cart = cart;
    }

    private void countBookInCart() {
        for (String book : this.cart) {
            if (Integer.parseInt(book) > 5 || Integer.parseInt(book) < 1) {
                continue;
            }
            this.increaseBookInCart(Integer.parseInt(book) - 1, 1);
        }
    }


    public double priceCalculate() {
        if(this.cart.length == 0){
            return 0;
        }
        DiscountPrice dp = new DiscountPrice();
        this.countBookInCart();
        dp.setCart(this.bookInCart);

        double totalPrice = dp.discountPriceCal();
        return totalPrice;
    }
}
