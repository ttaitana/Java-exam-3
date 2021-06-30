package com.example.exam32.bookstore;

public class DiscountPrice {
    private int cart[];
    private double discountRange[] = {1, 0.95, 0.9, 0.8, 0.75};

    public int[] getCart() {
        return cart;
    }

    public void setCart(int[] cart) {
        this.cart = cart;
    }

    public void decreaseCart(int index){
        this.cart[index] = this.cart[index] - 1;
    }

    public double discountPriceCal() {
        double totalPrice = 0;
        int discountIndex = -1;
        int bookWrap = 0;
        while (this.cartCheck()) {
            for (int i = 0; i < this.cart.length; i++) {
                if(this.cart[i] != 0){
                    this.decreaseCart(i);
                    bookWrap++;
                    discountIndex++;
                }
            }
            totalPrice += bookWrap * 100 * this.discountRange[discountIndex];

//          ?Reset
            bookWrap = 0;
            discountIndex = -1;
        }
        return totalPrice;
    }

    private boolean cartCheck() {
        boolean isNotEmpty = false;
        for (int i : this.cart) {
            if(i > 0){
                isNotEmpty = true;
                break;
            }
        }
        return isNotEmpty;
    }
}
