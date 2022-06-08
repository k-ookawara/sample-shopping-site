package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Order;
import com.example.demo.service.OrderdListService;

import lombok.RequiredArgsConstructor;

/**
 * 注文一覧コントローラー。
 */
@Controller
@RequestMapping("/seller/order-list")
@RequiredArgsConstructor
public class OrderListController {

    private final OrderdListService orderListService;

    /**
     * 注文一覧。
     * 
     * @param model モデル
     * @return ビュー名
     */
    @GetMapping
    public String list(Model model) {
        List<Order> orders = orderListService.findOrders();
        model.addAttribute("orders", orders);
        return "seller/order-list";
    }
}
