package Bean.P2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Dog dog = context.getBean(Dog.class);
        System.out.println(dog.getName());
    }
}
