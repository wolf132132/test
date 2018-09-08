import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args){
        String filename = "books5.csv";
        String readLine;
        String[] readLineArray;
        try{
            FileReader file = new FileReader(filename);
            BufferedReader input = new BufferedReader(file);
            while((readLine=input.readLine())!=null){
                readLineArray = readLine.split(",");
                String a = readLineArray[10];
                String b = readLineArray[7];
                String c = readLineArray[8];
                String d = readLineArray[12];

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println();

                //System.out.println(Arrays.toString(readLineArray));
            }
            //System.out.println(array);
        }catch (java.io.FileNotFoundException e){
            e.printStackTrace();
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
