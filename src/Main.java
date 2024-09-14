import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers2 = {1.57, 7.654, 9.986};
        double[] numbers3 = {1.00, 2.054, 10.986, 15.2};

        //Задача 2
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers3));

        // Задача 3
        System.out.println("Задача 3");
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index]);
            if (index != 0) {
                System.out.print(", ");
            } else {
                System.out.print("");
                System.out.println();
            }
        }

        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.print("");
                System.out.println();
            }
        }

        for (int y = numbers3.length - 1; y >= 0; y--) {
            System.out.print(numbers3[y]);
            if (y != 0) {
                System.out.print(", ");
            } else {
                System.out.print("");
            }
        }

        // Задача 4
//Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        System.out.println();
        System.out.println("Задача 4");
        for (int g = 0; g < numbers.length; g++) {
            if (numbers[g] % 2 !=0 ) {
                numbers[g]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

}