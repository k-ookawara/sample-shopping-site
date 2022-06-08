package com.example.demo.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 出品者登録。
 */
@Getter
@AllArgsConstructor
public class SellerRegister {

    @NotEmpty(message = "出品者名を入力してください。")
    private String sellerName;

    @NotEmpty(message = "メールアドレスを入力してください。")
    private String emailAddress;

    @NotEmpty(message = "電話番号を入力してください。")
    @Pattern(message = "電話番号は9～13桁の数値を入力してください。", regexp = "^[0-9]{9,13}$")
    private String telephoneNumber;

}
