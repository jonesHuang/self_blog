package com.chen.blog.entity;

import java.util.Date;

/**
 * @author ChenYi
 * @corporation HongYang_software
 * @create 2022-01-07
 */
public class Comment {
    /**
     * 评论id
     */
    private Integer id;
    /**
     * 评论用户名称
     */
    private String nickName;
    /**
     * 评论用户邮箱
     */
    private String email;
    /**
     * 评论内容
     */
    private String content;
    /**
     *头像地址
     */
    private String avatar;
    /**
     *评论创建时间
     */
    private Date createTime;

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
