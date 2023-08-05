import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        int maxMeaning = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxMeaning) {
                maxMeaning = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxMeaning + ".");
        int minMeaning = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minMeaning) {
                minMeaning = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMeaning + ".");
        System.out.println();
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        int sum = 0;
        int averageValue = 0;
        for (double element : arr) {
            sum += element;
            averageValue = sum / 30;
        }

        System.out.println("Средняя сумма трат за месяц составила " + averageValue);
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}