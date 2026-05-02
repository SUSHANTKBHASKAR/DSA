package org.example;
import java.util.Scanner;
public class SecondLargest {
    public int getSecondLargest(int[]arr){
        if(arr.length<2){
            return -1;
        }
        int max;
        int secondMax = Integer.MIN_VALUE;

        max=arr[0];

        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max) {
                secondMax=arr[i];
            }
        }
        return (secondMax== Integer.MIN_VALUE) ? -1 :secondMax;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: ");
        n= sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter the elements : " + (i+1));
            arr[i]= sc.nextInt();
        }
        System.out.println("Array is : ");
        for(int i=0 ;i< arr.length ;i++){
            System.out.println(arr[i]);
        }
        SecondLargest obj = new SecondLargest();
        int result = obj.getSecondLargest(arr);

        System.out.println("Result: "+ result);
    }
}
