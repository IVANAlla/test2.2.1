package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Autowired
    private  Dog dog;

    public Dog() {
    }

    public Dog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return  "Im a Dog";
    }
}
