package com.mine.product.meeting.controller;

import com.mine.base.user.dto.UserInfoDto;
import com.mine.product.meeting.entity.Meeting;
import com.mine.product.meeting.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private ITestService testService;

    @GetMapping("aa")
    public Meeting get() {
        return testService.get();
    }
    @GetMapping("aa1")
    public UserInfoDto get1() {
        return testService.get1();
    }
}
