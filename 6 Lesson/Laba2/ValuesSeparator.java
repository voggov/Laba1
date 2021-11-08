package ru.codeinside.generics;

import java.util.ArrayList;
import java.util.List;

public class ValuesSeparator<T> {
    private List<Object> arr = new ArrayList<>();

    public void addVariables(List<Object> inputValues) {
        int i = 0;
        for (var iter : inputValues) {
            arr.add(inputValues.get(i));
            i++;
        }
    }

    public List<?> getSeparatedBy(Class<?> type) {
        List<Object> temp = new ArrayList<>();
        int i = 0;
        for (var iter : arr) {
            if (arr.get(i).getClass().getCanonicalName().equals(type.getName())){
                temp.add(arr.get(i));
            }
            i++;
        }
        return temp;
    }
}
