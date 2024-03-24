package com.totalityapi.totalityapi950.shop;

import com.totalityapi.totalityapi950.shared.ShopInterface;

public class ShopService implements ShopInterface {

    @Override
    public void purchaseFunctionality() {
      // when called, calculate totalCurrency - itemPrice
        // if totalCurrency < itemPrice throw exception
        // if totalCurrency > itemPrice, return remainder
        Card card = new Card();
        int cardPrice = card.itemPrice;
        boolean cardPurchaseStatus = card.purchaseStatus;


    }
}
