package Seminar_6;

public class Notebook {
// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
// ноутбуки, отвечающие фильтру.
// Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

        private String brand_name;
        private String color;
        private String os;
        private String price;
        private String size_monitor;
        private String ram;
        private String serial_num;


        public Notebook(String brand_name, String color, String os, String price, String size_monitor, String ram, String serial_num){
            this.brand_name = brand_name;
            this.color = color;
            this.os = os;
            this.price = price;
            this.size_monitor = size_monitor;
            this.ram = ram;
            this.serial_num = serial_num;
        }

        public String toString() {
            return this.brand_name + " " +
                    this.color + " " +
                    this.os + " " +
                    this.price + " " +
                    this.size_monitor + " " +
                    this.ram + " " +
                    this.serial_num;
        }

        public String getParam(String param) {
            return switch (param) {
                case "brand_name" -> this.brand_name;
                case "color" -> this.color;
                case "os" -> this.os;
                case "price" -> this.price;
                case "size_monitor" -> this.size_monitor;
                case "ram" -> this.ram;
                case "serial_num" -> this.serial_num;
                default -> "";
            };
        }

        public String getBrandName() {
            return this.brand_name;
        }

        public String getColor() {
            return this.color;
        }

        public String getOs() {
            return this.os;
        }

        public String getPrice() {
            return this.price;
        }

        public String getSizeMonitor() {
            return this.size_monitor;
        }

        public String getRam() {
            return this.ram;
        }

        public String getSerialNum() {
            return this.serial_num;
        }

        public void setBrandName(String brand_name) {
            this.brand_name = brand_name;
            return;
        }

        public void setColor(String color) {
            this.color = color;
            return;
        }

        public void setOs(String os) {
            this.os = os;
            return;
        }

        public void setPrice(String price) {
            this.price = price;
            return;
        }

        public void setSizeMonitor(String size_monitor) {
            this.size_monitor = size_monitor;
            return;
        }

        public void setRam(String ram) {
            this.ram = ram;
            return;
        }

        public void setSerialNum(String serial_num) {
            this.serial_num = serial_num;
            return;
        }
}

