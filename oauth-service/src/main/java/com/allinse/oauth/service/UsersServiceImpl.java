package com.allinse.oauth.service;
/*
import com.allinse.oauth.entity.Users;
import com.allinse.oauth.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
*/
/**
 * Created by allinse on 05.09.16.
 *//*
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    @Transactional
    public Users getUserById(int id) {
        return null;
    }

    @Override
    @Transactional
    public Users getUserByLogin(String login) {
        return usersRepository.findByLogin(login);
    }

    public Users getAuthenticationUser(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Users users = getUserByLogin(user.getUsername());
        return users;
    }

    @Override
    public Users create(Users users) {
        return null;
    }
}
*/