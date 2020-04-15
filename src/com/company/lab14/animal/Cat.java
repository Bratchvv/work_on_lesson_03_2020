package com.company.lab14.animal;

public class Cat extends Animal {

    public static final String TEST_CONST = "CAT CONST";

    private boolean isWild;

    public Cat(String name, int speed, boolean isWild) {
        super(name, speed);
        this.isWild = isWild;
    }

    public static void run() {
        System.out.println("Static! Cat run ");
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
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

        Cat cat = (Cat) o;

        return isWild == cat.isWild;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isWild ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
            "isWild=" + isWild +
            "} " + super.toString();
    }
}