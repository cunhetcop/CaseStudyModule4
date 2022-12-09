package com.example.demo_spring_c0722g1.service;

import com.example.demo_spring_c0722g1.repository.IAccountRepo;
import com.example.demo_spring_c0722g1.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountService implements UserDetailsService {
    @Autowired
    IAccountRepo iAccountRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.findByUsername(username);
        if (account != null) {
            return new User(account.getUsername(), account.getPassword(), (Collection<? extends GrantedAuthority>) account.getRoles());
        }
        return null;
    }
}
