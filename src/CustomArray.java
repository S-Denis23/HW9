import java.util.Scanner;

public class CustomArray {
    static void maxValueArray(int[] array) {
        int max = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        //вывод максимального числа массива
        System.out.print("Максимальное значение массива: " + max);
        System.out.print("\n");
    }

    static void minValueArray(int[] array) {
        int min = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        //вывод максимального числа массива
        System.out.print("Минимальное значение массива: " + min);
        System.out.print("\n");
    }

    static void sumArray(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum = sum + value;
        }
        //вывод суммы значений массива
        System.out.print("Сума значений массива: " + sum);
        System.out.print("\n");
    }

    static void averageArray(int[] array, int num) {
        int sum = 0;

        for (int value : array) {
            sum = sum + value;
        }
        double average = (double) sum / num;
        //вывод среднего арифметического значений массива
        System.out.print("Среднее арифметическое значений массива: " + average);
        System.out.print("\n");
    }

    static void oddNumArray(int[] array, int num) {
        int sum = 0;
        System.out.print("Нечетные значения массива: ");
        for (int value : array) {
            if ((value % 2) != 0) {
                //вывод нечетных значений массива
                System.out.print(" " + value);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] array = new int[num];
        // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 15;
        }
        //вывод массива
        for (int value : array) {
            System.out.print(" " + value);
        }
        System.out.print("\n");

        maxValueArray(array);
        minValueArray(array);
        sumArray(array);
        averageArray(array, num);
        oddNumArray(array, num);
    }
}
