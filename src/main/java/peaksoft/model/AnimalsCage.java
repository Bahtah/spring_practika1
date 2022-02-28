package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class AnimalsCage {

    private Animal animal;
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    @Autowired
    @Qualifier("timer")
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Autowired
    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
