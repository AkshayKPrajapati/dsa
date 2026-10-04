package array.twopointer;

import java.util.Scanner;

public class TripletSuminArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lenght of the Array Size (n) ");
        int lenght = scanner.nextInt();
        int[] nums = new int[lenght];
        System.out.print("Enter the Elementn (i) : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Element " + i + ": ");
            nums[i] = scanner.nextInt();
        }
        System.out.print("Target Value:  ");
        int target =scanner.nextInt();
        scanner.close();
        TripletSuminArray demo=new  TripletSuminArray();
        Boolean result = demo.hasTripletSum(nums,target);
        System.out.println(result);
    }
    //brute force approach
    public boolean hasTripletSum(int arr[], int target) {
        int lenght=arr.length;
        for(int  i=0;i<lenght;i++){
            for(int j=i+1;j<lenght;j++){
                for(int k =j+1;k<lenght;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum==target){
                        return  true;
                    }
                }
            }
        }

        return false;

    }
}
