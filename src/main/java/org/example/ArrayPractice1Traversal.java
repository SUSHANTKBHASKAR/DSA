package org.example;
import java.util.*;

public class ArrayPractice1Traversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: ");
        n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i] +" index is: "+ (i+1));
        }
    }
}
