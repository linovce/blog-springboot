package com.linovce.blog.common;

/**s
 * @ClassName: com.linovce.blog.common.HttpResult
 * @Description: 消息返回统一封装
 * @version: v1.0.0
 * @author: linovce
 * @date: 2021/3/29 13:41
 */
public class HttpResult {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String message, Object o){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(o);
        return result;
    }

    public static Result error(Integer code, String message){
        return error(code, message, null);
    }
}
