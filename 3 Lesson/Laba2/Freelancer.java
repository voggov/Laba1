package ru.codeinside.lessons.javacore.implementation;

public class Freelancer implements IService {
    String name;
    String payNumber;

    public Freelancer(String name, String payNumber)
    {
        this.name = name;
        this.payNumber = payNumber;
    }

    @Override
    public String makeService(){
        return ("Freelancer:" + name);
    }
    @Override
    public String getName(){
        return (name);
    }
}
