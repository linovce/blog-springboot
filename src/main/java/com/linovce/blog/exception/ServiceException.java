package com.linovce.blog.exception;

import com.linovce.blog.common.ResultEnum;

/**
 * @ClassName: com.linovce.blog.exception.ServiceException
 * @Description: 服务异常
 * @version: v1.0.0
 * @author: linovce
 */
public class ServiceException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ServiceException(String message){
        super(message);
        this.code = ResultEnum.BusinessException.getCode();
    }

    public ServiceException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public ServiceException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
