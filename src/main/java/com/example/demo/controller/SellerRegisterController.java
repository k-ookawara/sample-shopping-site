package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.SellerRegister;
import com.example.demo.model.SellerRegisterResult;
import com.example.demo.service.SellerRegisterService;

import lombok.RequiredArgsConstructor;

/**
 * 出品者登録コントローラー。
 */
@Controller
@RequestMapping("/seller/register")
@RequiredArgsConstructor
public class SellerRegisterController {

    private final SellerRegisterService sellerRegisterService;

    /**
     * 画面表示。
     * 
     * @param sellerRegister 出品者登録
     * @return ビュー名
     */
    @GetMapping
    public String form(@ModelAttribute SellerRegister sellerRegister) {
        return "seller/register";
    }

    /**
     * 出品者を登録する。
     * 
     * @param sellerRegister 出品者登録
     * @param result バインド結果
     * @param model モデル
     * @return ビュー名
     */
    @PostMapping
    public String register(@Validated @ModelAttribute SellerRegister sellerRegister, BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return "seller/register";
        }

        SellerRegisterResult registerResult = sellerRegisterService.doService(sellerRegister);

        if (registerResult.failured()) {
            result.addError(new ObjectError("sellerRegister", registerResult.getMessage()));
            return "seller/register";
        }

        model.addAttribute(registerResult);

        return "seller/register-completed";
    }

}
