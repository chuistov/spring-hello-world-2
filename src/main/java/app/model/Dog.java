package app.model;

import org.springframework.stereotype.Component;

@Component("Rex")
public class Dog extends Animal {

    @Override
    public String toString() {
        return "I'm a Dog";
    }
}
