package classwork.lesson5.lesson5_1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnno {
    String str() default "";
    boolean val() ;
}
