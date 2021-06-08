package com.mine.product.meeting.service.impl;

import com.mine.base.user.dto.UserInfoDto;
import com.mine.base.user.service.IUserService;
import com.mine.product.meeting.dao.IMeeting;
import com.mine.product.meeting.entity.Meeting;
import com.mine.product.meeting.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：Yeaho_Lee
 * @date ：Created in 2021/6/4 9:42
 * @description：
 * @modified By：
 * @version: $
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestService implements ITestService {
    @Autowired
    private IUserService userService;
    @Autowired
    private IMeeting meetingDao;

    @Override
    public Meeting get() {
        Meeting meeting = new Meeting();
        meeting.setMeetingName("测试");
        return  meetingDao.save(meeting);
    }

    @Override
    public UserInfoDto get1() {
        return userService.getUserInfo("60b8898321e10c2079b72e0d");
    }
}
