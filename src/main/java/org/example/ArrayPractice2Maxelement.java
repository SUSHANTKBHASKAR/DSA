package org.example;
import java.util.*;
public class ArrayPractice2Maxelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int max;
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
        max = arr[0];
        for(int i = 0 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element in the array is : "+ max);


    }
}
