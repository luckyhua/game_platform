package com.liegou.platform.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 *
 * @author luckyhua
 * @version 1.0
 * @date 2017/3/29
 */
@ApiModel(description = "用户信息")
@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "game_id", nullable = false)
    private Integer gameId;

    /**
     * 用户手机号
     */
    @ApiModelProperty(value = "用户手机号")
    @Column(name = "cellphone", length = 11)
    private String cellphone;

    /**
     * 真实姓名
     */
    @ApiModelProperty(value = "真实姓名")
    @Column(name = "realname", length = 64)
    private String realname;

    /**
     * 用户昵称
     */
    @ApiModelProperty(value = "用户昵称")
    @Column(name = "nickname", length = 64)
    private String nickname;

    /**
     * 用户地址
     */
    @ApiModelProperty(value = "用户地址")
    @Column(name = "address")
    private String address;

    /**
     * 用户性别
     */
    @ApiModelProperty(value = "用户性别")
    @Column(name = "sex")
    private Integer sex;

    /**
     * 用户头像
     */
    @ApiModelProperty(value = "用户头像")
    @Column(name = "head", length = 32)
    private String head;

    @Column(name = "test")
    private String test;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @Column(name = "update_time")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", gameId=" + gameId +
                ", cellphone='" + cellphone + '\'' +
                ", realname='" + realname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", head='" + head + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

