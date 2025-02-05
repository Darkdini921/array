import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        System.out.println("");
        System.out.println("Задача 1");

        int[] arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;


        double[] arr2 = {1.57, 7.654, 9.986};


        int[] arr3 = {1, 2, 3, 4, 5};


        //  Задача 2

        System.out.println("");
        System.out.println("Задача 2");

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // Задача 3

        System.out.println("");
        System.out.println("Задача 3");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
            for (int i = arr3.length - 1; i >= 0; i--) {
                System.out.print(arr3[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }

            // Задача 4
        System.out.println(" ");
        System.out.println("Задача 4");

        for (int i = 0; i < arr3.length; i++){   // Использовал свой произвольный массив {1, 2, 3, 4, 5}

            if (arr3[i] % 2 != 0){
                arr3[i] = arr3[i]+ 1;
            }

            System.out.print(arr3[i]);
            System.out.print(", ");
        }



    }
}