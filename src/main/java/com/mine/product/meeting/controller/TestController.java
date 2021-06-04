package com.mine.product.meeting.controller;

import com.mine.product.meeting.entity.user.User;
import com.mine.product.meeting.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：Yeaho_Lee
 * @date ：Created in 2021/6/4 9:40
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("/test/")
public class TestController {
    
    @Autowired
    private IUserService userService;

    @GetMapping("user")
    public List<User> getUser() {
        System.out.println("1111111");
        return userService.getUser();
    }
}
