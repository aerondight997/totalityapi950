package com.totalityapi.totalityapi950.shop;

public class Card {

    public boolean isPurchaseStatus() {
        return purchaseStatus;
    }

    public boolean setPurchaseStatus(boolean purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
        return purchaseStatus;
    }

    public boolean purchaseStatus= false;

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    int itemPrice;


}
