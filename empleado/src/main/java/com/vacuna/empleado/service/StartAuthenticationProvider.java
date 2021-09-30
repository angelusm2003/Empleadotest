package com.vacuna.empleado.service;

import com.vacuna.empleado.entity.User;
import com.vacuna.empleado.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import java.util.Collections;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class StartAuthenticationProvider implements AuthenticationProvider {
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Optional<User> user = userRepository.findById(authentication.getName());
        if(user.isPresent()) {
            User us = user.get();
            String username = authentication.getName();
            String password = (String)authentication.getCredentials();
            if(username.equalsIgnoreCase(us.getUsername()) &&
                    password.equalsIgnoreCase(us.getPassword())) {
                return new UsernamePasswordAuthenticationToken(
                        us.getUsername(),
                        us.getPassword(),
                        Collections.singleton(new SimpleGrantedAuthority(us.getRoles()))
                );
            }
        }

        throw new UsernameNotFoundException("Usuario no encontrado");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}

