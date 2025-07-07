package com.tannusit.tannus_study.mapper;

import com.tannusit.tannus_study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    int insert(User user);
    List<User> getUserList();
   Optional<User> getUserByUserId(Integer userId);
}

