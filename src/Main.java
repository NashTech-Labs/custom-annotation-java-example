import com.knoldus.annotation.Demo;
import com.knoldus.annotation.MyAnnotation;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

        Demo demo = new Demo();
        Class c = demo.getClass();
        System.out.println(c.getName());

      MyAnnotation annotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.myValue());
        System.out.println(annotation.name());
        System.out.println(annotation.city());


    }
}