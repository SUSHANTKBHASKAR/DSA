package org.example;
import java.util.*;

public class ArrayPractice5SecondMinimumElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int secondMin= Integer.MAX_VALUE;
        System.out.println("Enter the Size of the array: ");
        n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i=0 ;i<n ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array Elements are: ");
        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
        int min = arr[0];
        for(int i=0 ; i<n ; i++){
            if(arr[i]<min){
                secondMin = min;
                min=arr[i];
            } else if (arr[i]<secondMin && arr[i]!=min) {
                secondMin=arr[i];
            }
        }
        System.out.println("Minimum Array Element is : "+min);
        System.out.println("Second Minimum Array Element is : "+secondMin);


    }
}
