package com.example.demo.repository.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Seller;

/**
 * 出品者マッパー。
 */
@Mapper
public interface SellerMapper {

    @Insert("""
            insert into seller
            (
                email_address,
                seller_name,
                telephone_number,
                password
            ) VALUES (
                #{emailAddress},
                #{sellerName},
                #{telephoneNumber},
                #{password}
            )
            """)
    int insert(Seller seller);

    @Select("""
            select * from seller where email_address = #{emailAddress}
            """)
    Seller findByEmailAddress(String emailAddress);
}
