package eolymp;

import java.util.Scanner;

public class Task_2664 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = in.nextInt();
            insertionSort(array);
        }



    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.print('\n');

    }
    public static void insertionSort(int[]array){
        int in, out;
        boolean check = false;
        int temp;
        for(out = 1;out < array.length;out++){
            in=out;
            temp = array[out];
            check = false;
            while (in > 0 && (array[in-1]>temp)){
                array[in]=array[in-1];
                in--;
                check = true;
            }
            array[in]=temp;
            display(array);

        }
    }

}
