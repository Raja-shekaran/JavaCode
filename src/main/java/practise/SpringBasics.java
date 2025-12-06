package practise;

public class SpringBasics {
    //IoC - Inversion of Control -> Bean initialization is managed by spring boot with annotation where in we are giving spring the control oper managing beans which is why we call that as Inversion control
    // DI - We achieve inversion of control by dependency injection where the necessary dependency for a class is injected by spring it is done via setter injection and constructor injection - construction is preferred as its immutable amd avoid boilerplate
    //https://medium.com/@harshc0707/dependency-injection-and-inversion-of-control-ioc-in-java-58a78f492b11

    //@Component [Spring Managed Bean] - This annotated class the Spring itself takes cares of the object creation and lifecycle for the class
    //@Service - It's also a type of @Component more focused on Service layer / Business logic concerns which interacts with external adapter or entities
    //@Repository - Interacts with Data Base (Data Access Layer) is also a special type of @Component

    //@Configuration - This is a specialized form of @Component that indicates a class contains @Bean definitions
    //@Bean -  This annotation is used at the method level within a @Configuration class to explicitly declare and create a bean
    //@ComponentScan - Scans the app or packages to search the classes with @Component to manage its object creation or lifecycle

    //1. Spring container starts.
    //2. Bean instance is created.
    //3. Dependencies are injected (populate properties).
    //4. Aware interfaces are invoked (BeanNameAware, BeanFactoryAware…).
    //5. BeanPostProcessor (before initialization) runs.
    //6. @PostConstruct or init() or afterPropertiesSet() runs.
    //7. BeanPostProcessor (after initialization) runs.
    //8. Bean is ready for use.
    //9. On shutdown, @PreDestroy or destroy() is called.

    //Filters - Acts as an layer before reaching controller where it restricts unauthen ticated user if we have nany filter added in @WebSecuriyCoinfig where we add filters for incoming httprequest and evben whitelisting the yurls happens here
    //Interceptors - If i need to make any changes to incoming reuqest before reaching ill be useing @WebMvC cleint and inside register or add interceptor for example if i need to map  the incoming paymnet m,ethod type as card or bank i try to map it as an enum so in my @RequestBody i can directl;y save it as type enum instead of string
    //AOP - Aspect oriented Programming where seperate concerns are used for eg logging like that usue join point and point cut expression to run @BeforeALl @AfterALL

}
