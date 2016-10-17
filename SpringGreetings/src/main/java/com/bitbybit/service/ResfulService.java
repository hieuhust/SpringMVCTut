package com.bitbybit.service;

import com.bitbybit.domain.User;

import java.util.List;

/**
 * Created by Huy Hieu on 10/10/2016.
 */
public interface ResfulService {

    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);
}
