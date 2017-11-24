package eolymp;

import java.util.Scanner;

public class Task_4848_quickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int[] array = new int[str.length];

        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(str[i]);

        quickSort(array,0,array.length-1);
        display(array);


    }


    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.print('\n');

    }
    public static void quickSort(int []a,int left,int right)
    {
        if(left>=right) return;
        int idx=partition(a,left,right);
        quickSort(a,left,idx);
        quickSort(a,idx+1,right);
    }


    private static int partition(int[] a, int left, int right) {
        int p =a[left+(right-left+1)/2];
        int i=left,j=right;
        while (i <= j){
            while (a[i]<p)i++;
            while (a[j]>p)j--;
            if(i<=j) swap(a,i++,j--);
        }
        return j;

    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i]=a[i1];
        a[i1]=temp;

    }
}
