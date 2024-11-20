package model;

public class Cat extends Animal {

    private  Cat cat;

    public Cat( Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
