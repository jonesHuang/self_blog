package com.chen.blog.handler;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ChenYi
 * @corporation HongYang_software
 * @create 2022-01-07
 */

//会拦截所有controller标注处的请求
@ControllerAdvice
public class ControllerExceptionHandler {

    //只有标注此注解才可以处理异常,Exception.class表示处理所有异常类型
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest req,Exception e) throws Exception {
        //如果错误状态码不为空则直接抛出异常交由springboot处理
        System.out.println(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class));
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
            throw e;
        }
        ModelAndView mav=new ModelAndView();
        mav.addObject("url",req.getRequestURL());
        mav.addObject("exception",e);
        mav.setViewName("error/error");
        return mav;
    }
}
