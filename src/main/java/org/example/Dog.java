package org.example;

public class Dog implements Animal {

    private String name;
    private String breed;
    private String color;
    private int age;


    @Override
    public void animalPlus() {
        System.out.println("Dog is man's best friend");
    }

    @Override
    public void animalMinus() {
        System.out.println("Dog bite");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
