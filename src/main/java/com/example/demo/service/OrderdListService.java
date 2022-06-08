package com.example.demo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Order;

/**
 * 注文一覧サービス
 */
@Service
public class OrderdListService {

    /**
     * 注文一覧を返します。
     * 
     * @return 注文一覧
     */
    public List<Order> findOrders() {
        return Collections.emptyList();
    }

}
