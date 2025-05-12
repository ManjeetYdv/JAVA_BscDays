package com.company;



public class kadane {

    public int maxSum(int[] arr) {

        int sum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (sum > 0) {
                sum += arr[i];
            }
            else {
                sum=arr[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
