package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;

// Пусть дан произвольный список целых чисел
// Нужно удалить из него четные числа
// Найти минимальное значение
// Найти максимальное значение
// Найти среднее значение

public class Task_0 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add((int) (Math.random() * 10));
        }

        System.out.println("Начальный список: ");
        System.out.println(numbers);
        System.out.println("Список без четных чисел: ");
        System.out.println(removeEvenValue(numbers));
        System.out.println("Минимальное значение");
        System.out.println(getMin(numbers));
        System.out.println("Максимальное значение");
        System.out.println(getMax(numbers));
        System.out.println("Среднее значение");
        System.out.println(getAverage(numbers));
    }

    public static ArrayList<Integer> removeEvenValue(ArrayList<Integer> list) {
        list.removeIf(item -> item % 2 == 0);
        return list;
    }

    public static Integer getMin(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    public static Integer getMax(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static Double getAverage(ArrayList<Integer> list) {
        double avg = 0;
        for (int i : list) {
            avg += i;
        }
        return avg / list.size();
    }
}
