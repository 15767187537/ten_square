package com.xztx.entity;

public class ProblemDTO extends BaseDTO {

    /**
     * 字符串id
     */
    String id;

    /**
     * 问题标题
     */
    String title;

    /**
     * 问题内容
     */
    String content;

    /**
     * 发布人id
     */
    String userId;

    /**
     * 发布人昵称
     */
    String nickName;

    /**
     * 浏览量
     */
    Integer visits;

    /**
     * 点赞数
     */
    Integer thumbup;

    /**
     * 回复数
     */
    Integer reply;

    /**
     * 是否解决
     */
    Integer solve;

    /**
     * 最新回复人
     */
    String replyName;

    /**
     * 最新回复时间
     */
    Integer replyTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    public Integer getThumbup() {
        return thumbup;
    }

    public void setThumbup(Integer thumbup) {
        this.thumbup = thumbup;
    }

    public Integer getReply() {
        return reply;
    }

    public void setReply(Integer reply) {
        this.reply = reply;
    }

    public Integer getSolve() {
        return solve;
    }

    public void setSolve(Integer solve) {
        this.solve = solve;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public Integer getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Integer replyTime) {
        this.replyTime = replyTime;
    }
}
