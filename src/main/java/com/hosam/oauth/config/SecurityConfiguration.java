package com.hosam.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain defaultSecurtiyFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                requests -> requests.anyRequest().authenticated()
        ).oauth2Login(Customizer.withDefaults());

        return http.build();

    }

//    @Bean
//    public ClientRegistrationRepository clientRepository() {
//        ClientRegistration clientReg = clientRegistration();
//        return new InMemoryClientRegistrationRepository(clientReg);
//    }
//
//
//    @Bean
//    ClientRegistration clientRegistration() {
//        return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("c305c1b736845d577b8a")
//                .clientSecret("1bf62eecfb8c0e107cfa7e4e70f4deb740f49742").build();
//    }


}
