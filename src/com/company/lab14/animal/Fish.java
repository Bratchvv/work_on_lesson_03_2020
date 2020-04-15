package com.company.lab14.animal;

public class Fish extends Animal {

    private String waterType = "P";

    public Fish(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void jump() {
        System.out.println("Fish don't jump");
    }

    public void swim() {
        System.out.println("Fish swim!!!");
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
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

        Fish fish = (Fish) o;

        return waterType != null ? waterType.equals(fish.waterType) : fish.waterType == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (waterType != null ? waterType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Fish{" +
            "waterType='" + waterType + '\'' +
            "} " + super.toString();
    }
}