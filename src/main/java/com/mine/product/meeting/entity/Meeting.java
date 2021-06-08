package com.mine.product.meeting.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author ：Yeaho_Lee
 * @date ：Created in 2021/6/7 15:56
 * @description：会议实体类
 * @modified By：
 * @version: $
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Meeting{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(
            name = "uuid",
            strategy = "uuid",
            parameters={
                    @Parameter(name="separator",value="_")
            })
    private String id;

    private String meetingName;

    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTIme;
    @CreatedBy
    private String createBy;
    @LastModifiedBy
    private String updateBy;
}
