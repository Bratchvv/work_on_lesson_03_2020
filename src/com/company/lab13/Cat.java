package com.company.lab13;

public class Cat extends Animal{

    protected String name;

    static {
        System.out.println("static Cat init block 1");
    }

    {
        System.out.println("Cat init block 1");
    }

    public Cat(String name, boolean isPredator) {
        super(name, isPredator);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    protected void eat() {
        super.eat();
        System.out.println("Котик кушает");
    }

    public void test() {
        this.eat();
        super.eat();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
