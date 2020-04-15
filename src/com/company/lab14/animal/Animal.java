package com.company.lab14.animal;

public class Animal {

    public static final String TEST_CONST = "ANIMAL CONST";

    private String name;
    private int speed;

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void jump() {
        System.out.println("No static! Animal jump");
    }

    public static void run() {
        System.out.println("Static! Animal run ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Animal animal = (Animal) o;

        if (speed != animal.speed) {
            return false;
        }
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + speed;
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
            "name='" + name + '\'' +
            ", speed=" + speed +
            '}';
    }
}
