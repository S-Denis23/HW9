public class Arrays {
    public static void main (String[] args){

        int num = 10;
        int[] array = new int[num];

        // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 15;
        }
        //вывод массива
//        for (int i = 0; i < array.length; i++) {
//            int a = array[i];
//            System.out.print(" " + a);

        //  }
        for (int value:array) {
            System.out.print(" " + value);
        }
        System.out.print("\n");

        //вывод массива наоборот
        for (int i = num-1; i>=0; i--) {
            int a = array[i];
            System.out.print(" " + a);
        }
    }
}
