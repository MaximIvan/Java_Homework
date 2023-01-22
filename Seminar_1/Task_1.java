// Задача №1
//        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random(),
//        который возвращает значение в промежутке [0, 300].
 class Task_1 {
    public static void main(String[] args) {
       int[] arr = new int [10];
       System.out.print("Массив: ");
       for (int i = 0; i < arr.length; i++) {
           arr[i] = ((int) (Math.random() * 300));
           System.out.print(arr[i] + ",");
       }
       int max_num = 0;
       int min_num = arr[0];
       int avg_num = 0;
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > max_num) max_num = arr[i];
           if (arr[i] < min_num) min_num = arr[i];
           sum += arr[i];
       }
       avg_num = sum/arr.length;
       System.out.println();
       System.out.println("Максимальное число: " + max_num);
       System.out.println("Минимальное число: " + min_num);
       System.out.println("Среднее число: " + avg_num);
    }
}