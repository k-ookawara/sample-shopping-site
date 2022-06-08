package com.example.demo.model;

import lombok.Getter;

/**
 * 出品者登録結果。
 */
public class SellerRegisterResult {

    private boolean isSuccessed;

    @Getter
    private Seller seller;

    @Getter
    private String message;

    private SellerRegisterResult(boolean isSuccessed, Seller seller, String message) {
        this.isSuccessed = isSuccessed;
        this.seller = seller;
        this.message = message;
    }

    public static SellerRegisterResult success(Seller seller) {
        return new SellerRegisterResult(true, seller, "登録が完了しました。");
    }

    public static SellerRegisterResult failure(String message) {
        return new SellerRegisterResult(false, null, message);
    }

    /**
     * @return 登録失敗した場合true
     */
    public boolean failured() {
        return !isSuccessed;
    }

}
