package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Seller;
import com.example.demo.repository.mapper.SellerMapper;

import lombok.RequiredArgsConstructor;

/**
 * 出品者リポジトリ。
 */
@Repository
@RequiredArgsConstructor
public class SellerRepository {

    private final SellerMapper sellerMapper;

    /**
     * 登録。
     * 
     * @param seller 出品者
     * @return 登録件数
     */
    public int create(Seller seller) {
        return sellerMapper.insert(seller);
    }

    /**
     * メールアドレスを元に検索します。
     * 
     * @param emailAddress メールアドレス
     * @return 出品者
     */
    public Seller findByEmailAddress(String emailAddress) {
        return sellerMapper.findByEmailAddress(emailAddress);
    }
}
