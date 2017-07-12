//package com.andrew.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
///**
// * Created by dengpengfei on 2017/7/12.
// */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
////
////    @Autowired
////    MyUserDetailsService detailsService;
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/", true)
////                .and().logout().logoutUrl("/logout")
////                .and().sessionManagement().maximumSessions(1).expiredUrl("/expired")
////                .and()
////                .and().exceptionHandling().accessDeniedPage("/accessDenied");
////    }
////
////    @Override
////    public void configure(WebSecurity web) throws Exception {
////        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**", "/**/favicon.ico");
////    }
////
////    @Override
////    public void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(detailsService).passwordEncoder(new BCryptPasswordEncoder());
////    }
//
//}