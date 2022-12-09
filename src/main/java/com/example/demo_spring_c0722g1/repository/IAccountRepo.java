package com.example.demo_spring_c0722g1.repository;

import com.example.demo_spring_c0722g1.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface IAccountRepo extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
}
