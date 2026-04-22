package org.example;
import java.util.*;

public class ArrayPractice6ArrayReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n= sc.nextInt();

        int []arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array is : ");
        System.out.print("[ ");
        for(int i=0 ; i<n ; i++){
            if(i>0){
                System.out.print(" , ");
            }
            System.out.print(arr[i]);
        }
        System.out.print(" ]");
        System.out.println("\nReversed Array is : ");
        System.out.print("[ ");
        for(int i=n-1 ; i>=0 ; i--){
            System.out.print(arr[i] );
            if(i!=0){
                System.out.print(" , ");
            }
        }
        System.out.print(" ]");



    }

}
