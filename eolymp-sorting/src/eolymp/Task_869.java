package eolymp;

import java.util.Scanner;

public class Task_869 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            display(generateArray(n));
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.print('\n');

    }

    public static int[] generateArray(int size){
        int[] a = new int[size];
        if(size == 1){ a[0] = 1; return a;}
        a[0] = 1;
        a[1] = 2;

        int count = 3;
        while (count <= size){
            if(count%2==0) {
                a[count - 1] = a[count / 2 - 1];
                a[count / 2 - 1] = count;
            }else{
                a[count - 1] = a[count / 2];
                a[count / 2] = count;
            }
            count++;
        }
        return a;
    }

}
