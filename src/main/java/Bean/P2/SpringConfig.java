package Bean.P2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    Dog dog (){
        var dog = new Dog();
        dog.setName("Шарик");
        return dog;
    }

}
