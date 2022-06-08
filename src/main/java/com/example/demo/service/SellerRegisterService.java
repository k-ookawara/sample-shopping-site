package com.example.demo.service;

import static com.example.demo.model.SellerRegisterResult.failure;
import static com.example.demo.model.SellerRegisterResult.success;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Seller;
import com.example.demo.model.SellerRegister;
import com.example.demo.model.SellerRegisterResult;
import com.example.demo.repository.SellerRepository;

import lombok.RequiredArgsConstructor;

/**
 * 出品者登録サービス
 */
@Service
@RequiredArgsConstructor
public class SellerRegisterService {

    private final SellerRepository sellerRepository;

    private final PasswordEncoder passwordEncoder;

    /**
     * 出品者を登録して結果を返します。
     * 
     * @param sellerRegister 出品者登録
     * @return 登録結果
     */
    public SellerRegisterResult doService(SellerRegister sellerRegister) {

        Seller seller = new Seller(sellerRegister, passwordEncoder.encode("password"));
        try {
            int count = sellerRepository.create(seller);
            if (count == 1) {
                return success(seller);
            }
        } catch (DuplicateKeyException e) {
            return failure("既に使用されているメールアドレスです。");
        }
        return failure("登録に失敗しましました。時間を空けて再度お試しください。");
    }

}
