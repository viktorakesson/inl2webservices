package com.example.inlamning2webservice;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.oauth2Login()
                .and()
                .authorizeRequests()
                .antMatchers("/authcontent", "/moreauthcontent")
                .authenticated()
                .antMatchers("/**")
                .permitAll()
                .and().build();
    }
}

