package com.company.lab14.animal;

public class Dog extends Animal {

    public static final String TEST_CONST = "DOG CONST";

    private int tailLength;

    public Dog(String name, int speed, int tailLength) {
        super(name, speed);
        this.tailLength = tailLength;
    }

    @Override
    public void jump() {
        System.out.println("No static! Dog jump");
    }

    public void seat(){
        System.out.println("Dog seat.");
    }

    public static void run() {
        System.out.println("Static! Dog run ");
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Dog dog = (Dog) o;

        return tailLength == dog.tailLength;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + tailLength;
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
            "tailLength=" + tailLength +
            "} " + super.toString();
    }
}