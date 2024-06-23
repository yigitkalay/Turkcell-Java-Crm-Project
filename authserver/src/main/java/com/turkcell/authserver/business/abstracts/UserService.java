package com.turkcell.authserver.business.abstracts;


import com.turkcell.authserver.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User addUser(User user);
    Integer getUserIdByEmail(String email);
}
