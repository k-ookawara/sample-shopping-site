package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 出品者。
 */
@Getter
@AllArgsConstructor
public class Seller {

    private int sellerId;

    private String emailAddress;

    private String sellerName;

    private String telephoneNumber;

    private String password;

    public Seller(SellerRegister sellerRegister, String password) {
        this.emailAddress = sellerRegister.getEmailAddress();
        this.sellerName = sellerRegister.getSellerName();
        this.telephoneNumber = sellerRegister.getTelephoneNumber();
        this.password = password;
    }
}
