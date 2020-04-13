package com.company.lab13;

public class Animal extends Object {

    protected String name;
    private  String type;

    protected boolean isPredator;

    static {
        System.out.println("static Animal init block 1");
    }

    {
        System.out.println("Animal init block 1");
    }
    public Animal(String name, boolean isPredator) {
        this.name = name;
        this.isPredator = isPredator;
        this.type = name + "_Type";
    }

    public Animal() {
        System.out.println("Animal()");
    }

    protected void voice() {
        System.out.print("Some voice");
    }

    protected void eat() {
       this.bring();
       System.out.println("Animal " + getName() + " eating.");
    }

    protected void run() {
        bring();
        System.out.println("Animal " + getName() + " run.");
    }

    private void bring() {
        System.out.println("Animal " + getName() + " bring.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public String getType() {
        return type;
    }

    {
        System.out.println("Animal init block 2");
    }

    static {
        System.out.println("static Animal init block 2");
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

        if (this.isPredator != animal.isPredator) {
            return false;
        }
        if (name != null ? !name.equals(animal.name) : animal.name != null) {
            return false;
        }
        return type != null ? type.equals(animal.type) : animal.type == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (isPredator ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Блаблабла{" +
            "name='" + name + '\'' +
            ", isPredator=" + isPredator +
            '}';
    }
}
