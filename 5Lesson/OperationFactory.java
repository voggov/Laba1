package ru.codeinside.lessons.javacore.exceptionlab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OperationFactory {

    private final Logger log = LogManager.getLogger(OperationFactory.class);

    public static void main(String[] args) {
        var operationFactory = new OperationFactory();
        operationFactory.parseAndDivide();
        System.out.println("\n\n");
        operationFactory.checkLength();
    }

    private void parseAndDivide() {
        log.info("метод parseAndDivide() успешно стартовал.");
        List<String> source = List.of("2", "5", "0", "10", "10000000000", "-100", "qwerty");
        for (String element : source) {
            int value;
            double result;
            try {
                value = Integer.parseInt(element);
                result = 1000 / value;
                System.out.println(result);

            } catch (ArithmeticException ex) {
                log.info("Деление на 0");
                System.out.println("Деление на 0!!!");
                Scanner in = new Scanner(System.in);
                System.out.print("Введите другое число = ");
                value = Integer.parseInt(in.next());
                result = 1000 / value;
                System.out.println(result);
            } catch (IllegalArgumentException ex) {
                log.info("Неккоректный тип данных или размер делителя");
                System.out.println("Неверный формат или размер делителя!!!");
                Scanner in = new Scanner(System.in);
                System.out.print("Введите другое число = ");
                value = Integer.parseInt(in.next());
                result = 1000 / value;
                System.out.println(result);

            }

        }
    }

    private void checkLength() {
        List<String> source = Arrays.asList("car", "table", "", "01", "alphabet", null, "zero");
        for (String element : source) {
            try {
                int length = element.length();
                System.out.println(length);
            } catch (NullPointerException ex) {
                log.info("Неверный тип данных");
                System.out.println("Неверный тип данных(" + element + ")");
                continue;
            } catch (Exception ex){
                log.info("Вызвано исключение");
                continue;
            }

        }
    }
}
