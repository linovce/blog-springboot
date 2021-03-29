package com.linovce.blog.exception;

import com.linovce.blog.common.HttpResult;
import com.linovce.blog.common.Result;
import com.linovce.blog.common.ResultEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**s
 * @ClassName: com.linovce.blog.common.GlobalExceptionHandler
 * @Description: 全局异常处理
 * @version: v1.0.0
 * @author: linovce
 * @date: 2021/3/29 13:41
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result systemErrorHandler(Exception e){
        return HttpResult.error(ResultEnum.SystemException.getCode(),ResultEnum.SystemException.getMessage(),e);
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Result businessErrorHandler(BusinessException e){
        return HttpResult.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public Result serviceException(ServiceException e){
        return HttpResult.error(e.getCode(),e.getMessage());
    }
}