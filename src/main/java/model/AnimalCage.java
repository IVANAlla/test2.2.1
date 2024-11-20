package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalCage {
    @Autowired
    @Qualifier("dog")
    private  Animal animal;
    private final Timer timer;


    public AnimalCage(Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public Long getTimer() {
        return timer.getTime();

    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
