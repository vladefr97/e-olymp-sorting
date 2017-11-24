package eolymp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Task_2327 {



    public static void main(String[] args) {

        try  {

           BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
           BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            int n = Integer.parseInt(reader.readLine());
            char[] line = reader.readLine().toCharArray();
            reader.close();
            String str;
            int[]counters = new int[100001];
            int[] a = new int[n];
            int j = 0;
            for(int i = 0; i < n; i++){
                str = "";
                for(; j < line.length;)
                {   if(line[j] == ' '){ j++; break;}
                    str += line[j++];
                }

                if(i < n) {
                    a[i] = Integer.parseInt(str);
                    counters[a[i]]++;
                }
            }
            countSort(a, counters, writer);

        }catch (IOException ex){

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }
    public static void countSort(int[] a, int[] counters, BufferedWriter writer) throws IOException {
        int pos = 0;
        for (int k = 0; k <= counters.length - 1; k++) {
            for (int i = 0; i < counters[k]; i++) {
                a[pos++] = k;
                writer.write(Integer.toString(a[pos - 1])+" ");
            }
            writer.flush();
        }

        writer.close();



    }




}