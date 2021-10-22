package ru.codeinside.lessons.javacore.implementation;

public class Main {
    public static void main(String[] args) {
    Company krona = new Company("ООО Крона", "7896652","40008763");
    Freelancer ilya = new Freelancer("Ilya", "9745631");
    System.out.println(krona.getName() + "\n" + krona.getShortName() + "\n" + krona.makeService());
    System.out.println(ilya.getName() + "\n" + ilya.makeService() + "\n" + ilya.getShortName());

    }
}
