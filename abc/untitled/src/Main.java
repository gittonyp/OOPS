import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.math.*;
public class Main {
    public static void main(String[] args) {
       StringConcats cc=new StringConcats();
        MaxFinder m=new MaxFinder();
        m.printa();
        cc.printa();

    }
}
class StringConcats{
    public void printa(){
        int n=0;
        Scanner sc=new Scanner(System.in);
        while(n<3){
            System.out.println("Enter How many String you want Concat(Please Select More Than 3)");
            n=sc.nextInt();
        }

        System.out.println();
        String arr[]=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLine();
        }
        System.out.println("Concat of First Two");
        System.out.println(concat(arr[0],arr[1]));
        System.out.println("Concat of First Three");
        System.out.println(concat(arr[0],arr[1],arr[2]));
        System.out.println("Concat of All Strings");
        System.out.println(concat(arr));
    }
    public String concat(String A,String B){
        return A+B;
    }
    public String concat(String A,String B,String C){
        return A+B+C;
    }
    public String concat(String intArray[]){
        String strOfInts = Arrays.toString(intArray).replaceAll("\\[|\\]|,|\\s", "");
        return strOfInts;
    }
}
class MaxFinder{
    public void printa(){
        Scanner sc=new Scanner(System.in);
        int n=0;
        Scanner sc=new Scanner(System.in);
        while(n<3){
            System.out.println("Enter How many Numbers you want Consider(Please Select More Than 3)");
            n=sc.nextInt();
        }

        System.out.println();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Max of First Two Numbers");
        System.out.println(concat(arr[0],arr[1]));
        System.out.println("Max of First Three Numbers");
        System.out.println(concat(arr[0],arr[1],arr[2]));
        System.out.println("Max of Total Numbers");

        System.out.println(concat(arr));
    }
    public int concat(int A,int B){
        return Math.max(A, B);
    }
    public int concat(int A,int B,int C){
        return Math.max(Math.max(A,B),C);
    }
    public int concat(int intArray[]){
        for (int i:
             intArray) {
        intArray[0]=Math.max(i,intArray[0]);
        }
        return intArray[0];
    }
}