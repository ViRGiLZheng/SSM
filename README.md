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

功能简介  
1、登陆，用户名和密码校验
2、转账，将账户余额转给别的账户
3、更改密码，可以更改自己的密码  
4、Maven正式加入本项目，包结构清晰了，项目具有更多的拓展性

Maven总结  
1、导入包主要使用dependency标签  
2、<packaging>war</packaging>使用此配置可以解决package出来的是jar包的情况  
3、 <build><resources><resource><directory>src/main/resources</directory><filtering>true</filtering></resource>  
</resources></build>此配置解决resource中xml的配置问题  
    
Spring总结  
1、IOC和DI说的是同一件事情，但是角度是不一样的角度  
IOC是指控制反转，举个例子来表达是以前需要自己new的service现在可以通过Spring的BeanFactory获取  
使用两个注解@Resource或者@Autowired进行装配，自动匹配可以通过类型或名字进行装配，类似于赋值的过程  
@Resource是JAVAX的注解 @Autowired是Spring的注解。这个的作用是简便了Web中重复调用的对象和生成的浪费  
日常也能通过这个框架来进行使用。  
2、AOP：面向切面编程。名词很高大上，但是举个例子来表达就是，创建一个父类，子类继承父类，然后重写子类的  
方法，在方法上方就是前置通知，在方法后方就是后置，然后异常和环绕就是try catch和前后类一起用。子类中进行  
切面的通知撰写，在中间执行父类的对应方法，当然父类的方法可以动态改变，这也是切面编程的切点设置。  
   
SpringMVC总结  
SpringMVC基于web包，原名SpringWebMVC，但是叫的比较多的还是SpringMVC，通过官方文档的说明来看，SpringMVC有  
两种配置方式，创建一个类继承和XML的配置方式（SpringBoot可以简化配置，但是萌新楼主还在学习中），本项目用的还是  
传统的XML来配置。  
说明一下SpringMVC.xml的配置  
这个是设置扫描包  
<context:component-scan base-package="com.ssm.controller"/>  
相当于配了Handler和Adapter  
<mvc:annotation-driven />  
静态资源  
--<mvc:resources mapping="/url目录" location="真实目录"--  
<mvc:resources mapping="/ig/**" location="/ig/" />  
