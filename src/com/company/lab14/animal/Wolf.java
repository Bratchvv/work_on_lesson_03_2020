package com.company.lab14.animal;

public class Wolf extends Dog {

    private boolean isAlfa;

    public Wolf(String name, int speed, int tailLength) {
        super(name, speed, tailLength);
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("А теперь прыгает волк. Ну погоди!");
    }

    public void attack(){
        System.out.println("Wolf attack.");
    }

    public boolean isAlfa() {
        return isAlfa;
    }

    public void setAlfa(boolean alfa) {
        isAlfa = alfa;
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

        Wolf wolf = (Wolf) o;

        return isAlfa == wolf.isAlfa;
    }

    @Override
    public String toString() {
        return "Wolf{" +
            "isAlfa=" + isAlfa +
            "} " + super.toString();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isAlfa ? 1 : 0);
        return result;
    }
}