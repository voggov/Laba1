package ru.codeinside.lessons.javacore.implementation;

public interface IService {
    String makeService();
    String getName();
    default String getShortName(){
        return "Нет Информации!";
    }

}
