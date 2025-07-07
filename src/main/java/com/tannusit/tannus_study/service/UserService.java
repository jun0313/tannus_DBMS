package com.tannusit.tannus_study.service;

import com.tannusit.tannus_study.dto.AddUserReqDto;
import com.tannusit.tannus_study.entity.User;
import com.tannusit.tannus_study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Map<String, String> addUser(AddUserReqDto addUserReqDto) {
        Map<String, String> response = new HashMap<>();
        int result = userRepository.addUser(addUserReqDto.toEntity(addUserReqDto));
        if(result == 1) {
            response.put("status", "success");
            response.put("message", "추가 성공");
            return  response;
        }
        response.put("status", "failed");
        response.put("massage", "추가실패");
        return response;
    }
    public List<User> getUserList() {
        return userRepository.getUserList();
    }
    public Map<String, Object> getUserByUserId(Integer userId) {
        Map<String, Object> response = new HashMap<>();
        Optional<User> user= userRepository.getUserByUserId(userId);
        if (user.isEmpty()) {
            response.put("mgessage", "회원정보가 없습니다.");
            return response;
        }
        response.put("user", user);
        return response;
    }
}
