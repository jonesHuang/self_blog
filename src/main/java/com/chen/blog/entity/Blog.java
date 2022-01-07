package com.chen.blog.entity;

import java.util.Date;

/**
 * @author ChenYi
 * @corporation HongYang_software
 * @create 2022-01-07
 */

public class Blog {
    /**
     * 博客id
     */
    private Integer id;
    /**
     * 博客标题
     */
    private String title;
    /**
     * 博客内容
     */
    private String content;
    /**
     * 博客首图
     */
    private String firstPic;
    /**
     * 博客角标，原创转载..
     */
    private String flag;
    /**
     * 浏览次数
     */
    private Integer views;
    /**
     * 是否可点赞
     */
    private boolean apprecation;
    /**
     * 是否分享
     */
    private boolean shareStat;
    /**
     * 是否可评论
     */
    private boolean commentable;
    /**
     * 是否发布
     */
    private boolean published;
    /**
     * 是否推荐
     */
    private boolean recomend;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    public Blog() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public void setFirstPic(String firstPic) {
        this.firstPic = firstPic;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public boolean isApprecation() {
        return apprecation;
    }

    public void setApprecation(boolean apprecation) {
        this.apprecation = apprecation;
    }

    public boolean isShareStat() {
        return shareStat;
    }

    public void setShareStat(boolean shareStat) {
        this.shareStat = shareStat;
    }

    public boolean isCommentable() {
        return commentable;
    }

    public void setCommentable(boolean commentable) {
        this.commentable = commentable;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isRecomend() {
        return recomend;
    }

    public void setRecomend(boolean recomend) {
        this.recomend = recomend;
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

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPic='" + firstPic + '\'' +
                ", flag='" + flag + '\'' +
                ", views=" + views +
                ", apprecation=" + apprecation +
                ", shareStat=" + shareStat +
                ", commentable=" + commentable +
                ", published=" + published +
                ", recomend=" + recomend +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
