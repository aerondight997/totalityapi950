package com.totalityapi.totalityapi950.shop;

public class Card {
    boolean purchaseStatus= false;

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    int itemPrice;

    public boolean isPurchaseStatus() {
        return purchaseStatus;
    }

    public boolean setPurchaseStatus() {
        this.purchaseStatus = purchaseStatus;
        return true;
    }
}
