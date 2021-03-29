package com.linovce.blog.common;

/**
 * @ClassName: com.linovce.blog.common.ResultEnum
 * @Description: 返回状态码枚举类
 * @version: v1.0.0
 * @author: linovce
 * @date: 2021/3/29 13:41
 */
public enum ResultEnum {
    /**
     * 成功.: 200
     */
    SUCCESS(200, "响应成功"),

    /**
     * 系统异常：400
     */
    SystemException(400, "系统异常"),

    /**
     * 服务异常：500
     */
    ServiceException(500, "服务异常"),

    /**
     * 业务错误：502
     */
    BusinessException(502, "业务错误");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }
}