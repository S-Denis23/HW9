import java.util.Scanner;

public class userArrays {
    static void resizeArray(int[] array, int value) {

        int[] array2 = new int[array.length + 1];
        array2[0] = value;

        for (int i = 1; i <= array.length; i++) {
            array2[i] = array[i-1];
        }

        //вывод нового массива
        System.out.println("Новый массив: ");
        for (int val : array2) {
            System.out.print(" " + val);
        }
    }

    public static void main (String[] args) {

        System.out.println("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 15;
        }

        System.out.println("Введите число: ");
        sc = new Scanner(System.in);
        int num2 = sc.nextInt();

        System.out.println("Исходный массив: ");
        for (int value : array) {
            System.out.print(" " + value);
        }
        System.out.print("\n");

        resizeArray(array, num2);
    }
}
