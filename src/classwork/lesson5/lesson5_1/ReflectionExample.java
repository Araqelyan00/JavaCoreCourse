package classwork.lesson5.lesson5_1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Method[] declaredMethods = AnnotationExample.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof MyAnno) {
                    MyAnno myAnno = (MyAnno) declaredAnnotation;
                    System.out.println(myAnno.str());
                }
            }
        }
    }
}