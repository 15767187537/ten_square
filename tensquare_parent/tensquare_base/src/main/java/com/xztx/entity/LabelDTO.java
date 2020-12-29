package com.xztx.entity;


public class LabelDTO extends BaseDTO {

    /**
     * 字符串id
     */
    private String id;

    /**
     * 标签名称
     */
    private String labelName;

    /**
     * 状态 0-无效 1-有效
     */
    private String state;

    /**
     * 使用数量
     */
    private Integer count;

    /**
     * 关注数
     */
    private Integer fans;

    /***
     * 是否推荐 0-不推荐 1-推荐
     */
    private String recommend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
