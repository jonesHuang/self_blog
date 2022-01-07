package com.chen.blog.entity;

/**
 * @author ChenYi
 * @corporation HongYang_software
 * @create 2022-01-07
 */
public class Type {
    /**
     * 类型ID
     */
    private Integer id;
    /**
     * 类型名称
     */
    private String typeName;

    public Type() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
