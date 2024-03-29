package com.yahoo85.annotation;



import java.lang.annotation.Documented;
        import java.lang.annotation.ElementType;
        import java.lang.annotation.Retention;
        import java.lang.annotation.RetentionPolicy;
        import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface demoRequestMapping {
    /**
     * 表示访问该方法的url
     * @return
     */
    String value() default "";

}