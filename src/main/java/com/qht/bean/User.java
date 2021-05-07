package com.qht.bean;

import java.util.Date;

public class User {
    private Long userId;
    private String userName;
    private String userPassword;
    private String userProfilePhoto;
    private Date userRegistrationTime;
    private String userNickname;//昵称

    public User() {
    }

    public User(Long userId, String userName, String userPassword, String userProfilePhoto, Date userRegistrationTime, String userNickname) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userProfilePhoto = userProfilePhoto;
        this.userRegistrationTime = userRegistrationTime;
        this.userNickname = userNickname;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserProfilePhoto() {
        return userProfilePhoto;
    }

    public void setUserProfilePhoto(String userProfilePhoto) {
        this.userProfilePhoto = userProfilePhoto;
    }

    public Date getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(Date userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userProfilePhoto='" + userProfilePhoto + '\'' +
                ", userRegistrationTime=" + userRegistrationTime +
                ", userNickname='" + userNickname + '\'' +
                '}';
    }
}
