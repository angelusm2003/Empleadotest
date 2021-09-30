package com.vacuna.empleado.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class StartUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String defaultUserName = "angelr@correo.com";
        String password = encoder.encode("password");
        if(!defaultUserName.equalsIgnoreCase(userName)) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }

        UserDetails userDetails = User.builder()
                .username(userName)
                .password(password)
                .authorities(Collections.emptyList())
                .build();

        return userDetails;
    }
}

