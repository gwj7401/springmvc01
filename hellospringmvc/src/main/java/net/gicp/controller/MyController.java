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
/*@RequestMapping("/user")*/
public class MyController {
    /**
     * 处理用户提交的请求，springmvc是使用方法来处理的
     * 方法是自定义的，可以有多种返回值，多种参数
     */
    /**
     * 准备使用doSome方法来处理some.do请求
     */
    @RequestMapping(value = "/receive.do")
    public ModelAndView doSome(String name, Integer age) {
        System.out.println("输入的名字"+name +"输入的年龄"+age);
        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("myname", name);
        mv.addObject("age", age);
        //指定视图
        //mv.setViewName("WEB-INF/view/show.jsp");
        //使用了视图解析器后，可以省得写路径了
        mv.setViewName("show");
        return mv;

    }

}

