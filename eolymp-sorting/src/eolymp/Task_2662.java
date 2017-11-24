package eolymp;

import java.util.Scanner;

public class Task_2662 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0;i<n; i++)
        {
            array[i] = in.nextInt();
        }
        System.out.println(selectionSort(array));
    }

    public  static int selectionSort(int[] array){
        int min, temp=0;
        int count=0;
        int first=0;
        int index;

        for ( index = 0; index < array.length-1; index++){
            min = index;
            for (int scan = index+1; scan < array.length; scan++){
                if (array[scan] < array[min]) {
                    min = scan;
                }
            }
            if(index!=min) {

                if (min == first) {
                    first = index;
                    count++;
                } else if (index == first) {
                    first = min;
                    count++;
                }
            }
            temp = array[min];
            array[min] = array[index];
            array[index] = temp;
        }
        return count;
    }
}
