package com.tannusit.tannus_study.controller;

import com.tannusit.tannus_study.dto.AddUserReqDto;
import com.tannusit.tannus_study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody AddUserReqDto addUserReqDto) {
        return ResponseEntity.ok(userService.addUser(addUserReqDto));
    }
    @GetMapping("/get/list")
    public ResponseEntity<?> getUserList() {
        return ResponseEntity.ok(userService.getUserList());
    }
    @GetMapping("/get")
    public ResponseEntity<?> getUserByUserId(@RequestParam Integer userId) {
        return ResponseEntity.ok(userService.getUserByUserId(userId));
    }
}
