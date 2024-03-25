package com.totalityapi.totalityapi950.shop;

import com.totalityapi.totalityapi950.shared.ShopInterface;

public class ShopService implements ShopInterface {
    Currency currency = new Currency();
    Card card = new Card();

    @Override
    public int calculateCurrency() {
        int cardPrice = card.itemPrice;
        int totalCurrency = currency.totalCurrency;

        int calculatedCurrency = 0;
        if (cardPrice > totalCurrency) {
            return -1; //throw exception
        } else if (totalCurrency > cardPrice) {
            calculatedCurrency = totalCurrency - cardPrice;
        }

        return calculatedCurrency;
    }

    @Override
    public boolean purchaseItem() {
        boolean newPurchaseStatus = false;
        int newCurrency = calculateCurrency();
        if (newCurrency > 0) {
           newPurchaseStatus = card.setPurchaseStatus(true);
        }
        return newPurchaseStatus;
    }
}

