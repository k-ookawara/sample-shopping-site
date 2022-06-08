package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Login;

/**
 * 出品者ログインコントローラー。
 */
@Controller
@RequestMapping("/seller/login")
public class SellerLoginController {

    /**
     * 画面表示。
     * 
     * @param login ログイン情報
     * @return ビュー名
     */
    @GetMapping
    public String index(@ModelAttribute Login login) {
        return "seller/login";
    }

    /**
     * ログイン。
     * 
     * @return ビュー名
     */
    @PostMapping
    public String login() {
        return "redirect:/seller/order-list";
    }
}
