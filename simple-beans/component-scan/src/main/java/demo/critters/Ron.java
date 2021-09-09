package demo.critters;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Ron {
    public Ron() {
        System.out.println("I'm Ron!");
    }
}
