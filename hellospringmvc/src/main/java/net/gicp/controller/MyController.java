package net.gicp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yanghaokun guoweijiang
 * @create 2020-09-15 - 15:23
 * @Controller 创建控制器对象，对象放在SpringMvc容器里
 */
@Controller
public class MyController {
    /**
     * 处理用户提交的请求，springmvc是使用方法来处理的
     * 方法是自定义的，可以有多种返回值，多种参数
    */
    /**
     * 准备使用doSome方法来处理some.do请求
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){

         ModelAndView mv = new ModelAndView();
         //添加数据
    mv.addObject("msg","欢迎使用SpringMvc做web开发");
    mv.addObject("fun","执行的是doSome方法");
    //指定视图
    //mv.setViewName("WEB-INF/view/show.jsp");
    //使用了视图解析器后，可以省得写路径了
    mv.setViewName("show");//git
    return mv;

    }

}

