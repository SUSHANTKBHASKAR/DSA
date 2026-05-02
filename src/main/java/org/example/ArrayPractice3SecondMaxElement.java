package org.example;
import java .util.*;

public class ArrayPractice3SecondMaxElement {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int max;
        int secondMax = Integer.MIN_VALUE;
        System.out.println("Enter the size of the array: ");
        n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are : ");
        for(int i = 0 ; i<n ;i++){
            System.out.println(arr[i]);
        }
        max = arr[0];
        for(int i =1 ; i < n ;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Max Array element is : "+ max);

        if(secondMax == Integer.MIN_VALUE){
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second Max Array element is : " + secondMax);
        }

    }

}
