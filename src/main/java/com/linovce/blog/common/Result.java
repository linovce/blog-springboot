package com.linovce.blog.common;

/**
 * @ClassName: com.linovce.blog.common.Result
 * @Description: 返回消息实体类
 * @version: v1.0.0
 * @author: linovce
 * @date: 2021/3/29 13:41
 */
public class Result<T> {
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}