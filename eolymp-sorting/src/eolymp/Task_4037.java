package eolymp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task_4037 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        RobotNumber[] robotNumbers = new RobotNumber[n];
        String[] str;

        for(int i = 0;i<n;i++){
            str = reader.readLine().split(" ");
            robotNumbers[i] = new RobotNumber(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
        }
        RobotNumber[] t = new RobotNumber[robotNumbers.length];
        mergeSort(robotNumbers, t , 0 , robotNumbers.length - 1);
        display(robotNumbers);


    }

    private static void display(RobotNumber[] array) {
        for(int i = 0;i<array.length;i++)
        {
            System.out.println(array[i].a+" "+array[i].b);
        }

    }
    public  static void mergeSort(RobotNumber[] a, RobotNumber[] t, int left, int right){

        if(right <= left) return;
        int mid = (left + right)/2;
        mergeSort(a, t, left, mid);
        mergeSort(a, t, mid + 1 ,right);
        merge(a, t, left, mid, right);



    }
    private static void merge(RobotNumber[] a, RobotNumber[] t, int left,int mid,  int right){

        for(int i = left; i <= right; i++) {
            t[i] = a[i];

        }
        int i = left, j = mid + 1;

        for(int k = left; k <= right; k++){
            if(i > mid)a[k] = t[j++];
            else if(j > right) a[k] = t[i++];
            else if (t[j].compareTo(t[i]) < 0) a[k] = t[j++];
            else a[k] = t[i++];
        }

    }
}
class RobotNumber implements Comparable<RobotNumber> {
    int a;
    int b;

    public RobotNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(RobotNumber o) {
        if(this.a>o.a) return 1;
        else if(this.a<o.a) return -1;
        return 0;
    }
}