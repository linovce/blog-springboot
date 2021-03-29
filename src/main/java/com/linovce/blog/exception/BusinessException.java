package com.linovce.blog.exception;

import com.linovce.blog.common.ResultEnum;

/**
 * @ClassName: com.linovce.blog.exception.BusinessException
 * @Description: 业务异常
 * @version: v1.0.0
 * @author: linovce
 * @date: 2021/3/29 14:08
 */
public class BusinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public BusinessException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
