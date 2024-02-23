package com.exmaple.userservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurity{


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests((authz)-> authz.anyRequest().permitAll())
                .csrf(AbstractHttpConfigurer::disable)
                //h2 관련 환경설정
                .headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable));
//        http.headers().frameOptions().disable();
        return http.build();
    }

}
