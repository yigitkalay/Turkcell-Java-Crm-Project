package com.turkcell.customerservice.dataAccess;

import com.turkcell.customerservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Integer> {
    Optional<Account> findByIdAndStatusTrue(int id);
    Optional<Account> findByAccountNumberAndStatusTrue(int accountNumber);
    List<Account> findByCustomerIdAndStatusTrue(int id);
    List<Account> findByStatusTrue();
}
