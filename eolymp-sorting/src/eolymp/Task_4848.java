package eolymp;

import java.util.Scanner;

public class Task_4848 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int[] array = new int[str.length];
        Heap heap = new Heap();
        for (int i = 0; i < array.length; i++)
            heap.insert(Integer.parseInt(str[i]));

        for (int i = 0; i < array.length; i++) {
           array[i] = heap.extract();
        }

        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }



    }
    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.print('\n');

    }
}
class Heap{
    int elemCount=0;
    int arraySize=100000;
    int[]array=new int[arraySize];

    public  void insert(int x){
        if(elemCount==arraySize){
            increaseArray();
        }
        array[elemCount]=x;
        siftUp(elemCount);
        elemCount++;
    }

    public int extract(){

        int maxValue=array[0];
        array[0]=array[elemCount-1];
        elemCount--;
        siftDown(0);
        return maxValue;
    }
    private void increaseArray(){
        int[]newArray=new int[arraySize*5];
        for(int i=0;i<elemCount;i++)
            newArray[i]=array[i];
        array=newArray;
        arraySize=array.length;
    }


    private void siftUp(int nodeIndex){
        int parentIndex,tmp;
        if(nodeIndex!=0){
            parentIndex=getParentIndex(nodeIndex);
            if(array[parentIndex]<array[nodeIndex]){
                tmp=array[parentIndex];
                array[parentIndex]=array[nodeIndex];
                array[nodeIndex]=tmp;
                siftUp(parentIndex);
            }
        }
    }
    private void siftDown(int nodeIndex){
        int left,right,maxIndex,tmp;
        left=2*nodeIndex+1;;
        right=2*nodeIndex+2;;
        if(right>=elemCount){
            if(left>=elemCount)return;
            else maxIndex=left;
        }
        else {
            if(array[left]>=array[right])
                maxIndex=left;
            else
                maxIndex=right;
        }
        if(array[nodeIndex]<array[maxIndex]){
            tmp=array[maxIndex];
            array[maxIndex]=array[nodeIndex];
            array[nodeIndex]=tmp;
            siftDown(maxIndex);
        }



    }

    private int getParentIndex(int nodeIndex){
        if(nodeIndex%2==0)
            return (nodeIndex-2)/2;
        else return (nodeIndex-1)/2;
    }





}
