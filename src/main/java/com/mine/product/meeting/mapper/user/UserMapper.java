package com.mine.product.meeting.mapper.user;

import com.mine.product.meeting.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：Yeaho_Lee
 * @date ：Created in 2021/6/4 10:03
 * @description：
 * @modified By：
 * @version: $
 */
@Mapper
public interface UserMapper {
    List<User> getUsers();
}
