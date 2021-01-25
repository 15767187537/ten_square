package com.xztx.entity;

public class ReplyDTO extends BaseDTO {

    /**
     * 字符串id
     */
    String id;

    /**
     * 问题id
     */
    String problemId;

    /**
     * 回答内容
     */
    String content;

    /**
     * 回答人id
     */
    String userId;

    /**
     * 回答人昵称
     */
    String nickName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
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
}
