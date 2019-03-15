# ssm
自我锻炼的ssm项目  
各位父老乡亲们，作为新菜中菜的萌新楼主开始了github之旅  
这个项目主要是做一个ssm的练习的项目  
先说一下环境  
Tomcat 9.0.1  
MySQL 8.0   
Win x64  
Idea x64  
注意：MySQL8.0的连接方式和以往版本都不一样，要更改一下用户名和密码，然后驱动也不兼容旧的一定要8.0之后的  
说明一下SpringMVC.xml的配置  
这个是设置扫描包  
<context:component-scan base-package="com.ssm.controller"/>  
相当于配了Handler和Adapter  
<mvc:annotation-driven />  
静态资源  
--<mvc:resources mapping="/url目录" location="真实目录"--  
<mvc:resources mapping="/ig/**" location="/ig/" />  
