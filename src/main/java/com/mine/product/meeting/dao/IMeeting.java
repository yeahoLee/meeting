package com.mine.product.meeting.dao;

import com.mine.product.meeting.entity.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：Yeaho_Lee
 * @date ：Created in 2021/6/7 21:21
 * @description：
 * @modified By：
 * @version: $
 */
public interface IMeeting extends JpaRepository<Meeting, String> {
}
