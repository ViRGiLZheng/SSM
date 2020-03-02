# ssm
自我锻炼的ssm项目  
各位父老乡亲们，作为新菜中菜的萌新楼主开始了github之旅  
这个项目主要是做一个ssm的练习的项目  
先说一下环境  
Tomcat 9.0.31  
MySQL 8.0.19   
Window10 1909 x64  
Idea x64  
注意：MySQL8.0的连接方式和以往版本都不一样，要更改一下用户名和密码，然后驱动也不兼容旧的一定要8.0之后的  

================================================================================  
接下来的一段时间的更新说明,感谢截至2020年2月11日还给我Star的朋友们  
由于版本较旧会根据最新的情况适配项目，升级到Spring 5.2.3 后方功能推迟5日
1. 将项目的一些依赖包进行更新，增加留言板块  目标完成日期 3月1日。  
2. 加入前端页面的支持，并且增加点击计数，部署在远程服务器，胖友们可以在上面留言想要的功能 3月15日。    
3. 加入我的体重记录和提示督促我减肥成功。  


功能简介  
1. 登陆，用户名和密码校验
2. 转账，将账户余额转给别的账户
3. 更改密码，可以更改自己的密码  
4. Maven正式加入本项目，包结构清晰了，项目具有更多的拓展性
5. 加入日志 使用的log4j的日志 主要记录数据库  
6. 使用WEB-INF保护重要的地址  

Maven总结  
1. 导入包主要使用dependency标签  
2. <packaging>war</packaging>使用此配置可以解决package出来的是jar包的情况  
3.  <build><resources><resource><directory>src/main/resources</directory><filtering>true</filtering></resource>  
 </resources></build>此配置解决resource中xml的配置问题  
    
SpringFramework
1. IOC和DI其实是同一件事 
================20200225 更新===============
以下为官方的解释
>IoC is also known as dependency injection (DI). 
>It is a process whereby objects define their dependencies
> (that is, the other objects they work with) only through 
>constructor arguments, arguments to a factory method, or 
>properties that are set on the object instance after 
>it is constructed or returned from a factory method. 
>The container then injects those dependencies when 
>it creates the bean. This process is fundamentally 
>the inverse (hence the name, Inversion of Control) of the bean 
>itself controlling the instantiation or location of its dependencies by 
>using direct construction of classes or a mechanism such as the Service Locator pattern.

IOC也被认为是依赖注入（DI）在此过程中，对象仅通过构造函数参数，工厂方法的参数或在构造或从工厂方法返回后
在对象实例上设置的属性来定义其依赖项（即，与它们一起使用的其他对象）。当创建这个对象的时候注入他的依赖项。

IOC和DI两者可以举个例子来解释，是以前需要自己new的service现在可以通过Spring的BeanFactory获取。
创建一个新的实例，一般通过构造器，现在有工厂装配，现在创建的时候还会注入依赖项。  
使用两个注解@Resource或者@Autowired进行装配，自动匹配可以通过类型或名字进行装配，类似于赋值的过程  
@Resource是JAVAX的注解 @Autowired是Spring的注解。这个的作用是简便了Web中重复调用的对象和生成的浪费  
日常也能通过这个框架来进行使用。
依赖注入有4种方式
+ 基于构造器注入
+ 基于Setter方式注入
+ 注解方式注入  
共性：基于构造器和Setter方法注入都是使用XML配置
差异性：构造器注入在XML配置文件中使用constructor-arg 可以指定索引index来指定，也可以使用构造器的参数名，索引从0开始
        基于Setter方式注入，在XML中配置使用property 对应的值使用指定的方式,Bean需要有空构造器不然会报错
        一个是使用构造器，一个使用Setter方式赋值
2. AOP：面向切面编程。名词很高大上，但是举个例子来表达就是，创建一个父类，子类继承父类，然后重写子类的  
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
