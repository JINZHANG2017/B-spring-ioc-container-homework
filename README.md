# B-spring-ioc-container-homework
Spring IoC Container Basics 课程课后作业。

主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

(1)如果想将第三方的类变成组件，你又没有没有源代码，也就没办法使用@Component进行自动配置，这种时候使用@Bean就比较合适了
(2)@Bean注解的方法返回值是对象，可以在方法中为对象设置属性。
(3)可以搭配@ConditionalOnMissingBean注解 @ConditionalOnMissingClass注解，如果本项目中没有定义该类型的bean则会生效。避免在某个项目中定义或者通过congfig注解来声明大量重复的bean。