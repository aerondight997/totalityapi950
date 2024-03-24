package com.totalityapi.totalityapi950.shop;

import com.totalityapi.totalityapi950.shared.ShopInterface;

public class ShopService implements ShopInterface {
    Card card = new Card();
    Currency currency = new Currency();

    @Override
    public int calculateCurrency() {
        int cardPrice = card.itemPrice;
        int totalCurrency = currency.totalCurrency;

        int newCurrency = 0;
        if (cardPrice > totalCurrency) {
            return -1; //throw exception
        } else if (totalCurrency > cardPrice) {
            newCurrency = totalCurrency - cardPrice;
        }

        return newCurrency;
    }

    @Override
    public void purchaseItem() {
        int newCurrency = calculateCurrency();
        if (newCurrency > 0) {
            boolean cardPurchaseStatus = card.setPurchaseStatus();
        }
    }
}

