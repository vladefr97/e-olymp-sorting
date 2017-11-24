package eolymp;

import java.util.Scanner;

public class Task_4741 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=in.nextInt();
        }
        System.out.println(bubbleSort(array));

    }
    public static int bubbleSort(int[]array){
        int count=0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    count++;
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        return count;
    }

}
