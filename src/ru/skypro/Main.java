package ru.skypro;

public class Main {

    public static void main(String[] args) {

     int[] expenses = generateRandomArray();
//     for (int i = 0;i < expenses.length;i++ ){
//        System.out.println(expenses[i]);}

            //Задание №1
            int  sum = 0;
            for (int i = 0;i < expenses.length;i++) {
                sum = sum + expenses[i];
            }
            System.out.println("Сумма трат за месяц составила " + sum +" рублей");
        System.out.println();

            //Задание №2
        int min = expenses[0];
        for (int i = 0;i < expenses.length;i++) {
            if (expenses[i] < min){
                min = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println();
        int max = expenses[0];;
        for (int j = 0;j < expenses.length;j++) {
            if (expenses[j] > max){
                max = expenses[j];
            }
        }
        System.out.println("Максималыная сумма трат за день составила " + max + " рублей");
        System.out.println();

                //Задание №3
//        int  sum = 0;
//        for (int i = 0;i < expenses.length;i++) {
//            sum = sum + expenses[i];
//        }
        double day = 30.0;
        double average = sum / day;
        System.out.println("Средняя сумма трат за месяц составила " + average + " pублей");
        System.out.println();

                //Задание №4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10;i > 0; i --){
            System.out.print(reverseFullName[i]);
        }

    }

        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }


}
