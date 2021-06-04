package com.mine.product.meeting.service.impl;

import com.mine.product.meeting.entity.user.User;
import com.mine.product.meeting.mapper.user.UserMapper;
import com.mine.product.meeting.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：Yeaho_Lee
 * @date ：Created in 2021/6/4 9:42
 * @description：
 * @modified By：
 * @version: $
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getUsers();
    }
}
