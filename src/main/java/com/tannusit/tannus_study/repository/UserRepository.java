package com.tannusit.tannus_study.repository;

import com.tannusit.tannus_study.entity.User;
import com.tannusit.tannus_study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    @Autowired
    private UserMapper userMapper;
    public int addUser(User user) {
        return userMapper.insert(user);
    }
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
    public Optional<User> getUserByUserId(Integer userid) {
        return userMapper.getUserByUserId(userid);
    }
}
