package org.example;
import java.util.*;

public class ArrayPractice4MinElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int min;

        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();

        int []arr = new int [n];
        System.out.println("Enter the Array elements: ");
        for (int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("The Array Elements are: ");
        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }

        min = arr[0];
        for(int i=0 ; i<n ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum Element in the array is : " + min);
    }
}
