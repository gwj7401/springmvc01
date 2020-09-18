第一个springmvc
实现步骤：
1、新建一个maven的project工程
    加入依赖 spring-webmvc，会把spring的依赖都加入到项目
    jsp sevlet依赖
02项目主要讲@RequestMapping注解该怎么用
03项目接收参数 Integer类型 可以接收整形数值报告null值
输入的名字é??????±?输入的年龄null POST方式接收参数要解决乱码的问题，GET传输中文没有乱码
在过滤器中设置编码方式，使用框架中定义好的过滤器characterEncodingFilter没执行