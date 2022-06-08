package com.example.demo.security;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.model.Seller;
import com.example.demo.repository.SellerRepository;

import lombok.RequiredArgsConstructor;

/**
 * 出品者ユーザ認証サービス
 */
@Component
@RequiredArgsConstructor
public class SellerUserDetailService implements UserDetailsService {

    private final SellerRepository sellerRepository;

    /**
     * ユーザ名をもとに認証ユーザを返します。
     * 
     * @param ユーザ名
     * @return 認証ユーザ
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Seller seller = sellerRepository.findByEmailAddress(username);

        if (seller == null) {
            throw new UsernameNotFoundException("Invalid login");
        }

        return new User(username, seller.getPassword(), Collections.emptyList());
    }

}
