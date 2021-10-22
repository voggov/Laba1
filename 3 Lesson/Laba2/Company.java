package ru.codeinside.lessons.javacore.implementation;

public class Company implements IService {
    String name;
    String individualNumber;
    String bankAccount;

    public Company(String name, String individualNumber, String bankAccount)
    {
        this.name = name;
        this.individualNumber = individualNumber;
        this.bankAccount = bankAccount;
    }

    @Override
    public String makeService(){
        return ("Company:" + name + ", " + bankAccount);
    }
    @Override
    public String getName(){
        return (name + "," + individualNumber);
    }
    @Override
    public String getShortName(){
        return name;
    }


}
