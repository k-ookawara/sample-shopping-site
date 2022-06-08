package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

/**
 * セキュリティ設定
 */
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final SellerUserDetailService userDetailService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().ignoringAntMatchers("/seller/register", "/seller/login")
            .and()
            .formLogin(login -> login
                        .loginPage("/seller/login")
                        .successForwardUrl("/seller/login"))
            .userDetailsService(userDetailService)
            .authorizeHttpRequests()
            .antMatchers("/seller/login", "/seller/register").permitAll()
            .antMatchers("/css/*").permitAll()
            .antMatchers("/img/*").permitAll()
            .anyRequest().authenticated();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
