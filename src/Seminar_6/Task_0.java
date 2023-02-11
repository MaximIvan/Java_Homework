package Seminar_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_0 {

// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
// ноутбуки, отвечающие фильтру.
// Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        List<Notebook> notebooks = initListNotebooks();
        System.out.println(notebooks);
        System.out.println("--------------");
        List<Notebook> filtered;
        Map<String, String> params = new HashMap<>();
        params.put("brand_name", "Asus");
        params.put("color", "Black");
        params.put("ram", "12");
        params.put("os", "Windows");
        filtered = filter(params, notebooks);
        for (Notebook temp : filtered) {
            System.out.println(temp.toString());
        }
    }

    public static List<Notebook> initListNotebooks(){
        List<Notebook> notebooks = new ArrayList<>(List.of());
        notebooks.add(new Notebook("Asus", "Black", "Windows", "55_000.00", "13", "8", "001"));
        notebooks.add(new Notebook("Asus", "Black", "Windows", "65_000.00", "17", "8", "002"));
        notebooks.add(new Notebook("Asus", "Black", "Windows", "65_999.99", "17", "12", "003"));
        notebooks.add(new Notebook("Asus", "White", "Windows", "65_999.99", "17", "12", "004"));
        notebooks.add(new Notebook("Asus", "White", "Linux", "73_700.00", "15", "12", "005"));
        notebooks.add(new Notebook("Asus", "White", "Linux", "75_999.99", "17", "12", "006"));
        notebooks.add(new Notebook("HP", "Black", "Windows", "63_000.00", "15", "8", "007"));
        notebooks.add(new Notebook("HP", "White", "Windows", "65_999.99", "17", "12", "008"));
        notebooks.add(new Notebook("HP", "Black", "Linux", "73_000.00", "15", "8", "009"));
        notebooks.add(new Notebook("HP", "White", "Linux", "78_000.00", "13", "12", "010"));
        return notebooks;
    }

    public static List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        return notebooks.stream().filter(p -> {
            for (String key: params.keySet()){
                if (!p.getParam(key).equals(params.get(key))) return false;
            }
            return true;
        }).collect(Collectors.toList());
    }
}
