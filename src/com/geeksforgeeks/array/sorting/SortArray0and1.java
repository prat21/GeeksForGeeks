package com.geeksforgeeks.array.sorting;

import java.util.Arrays;

/*
Given an array A[] consisting 0s, 1s and 2s, the task is to write a function that sorts the given array.
The functions should put all 0s first, then all 1s and all 2s in last.
https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */

public class SortArray0and1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort2(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));
    }

    /* Single iteration approach */
    static void sort2(int[] arr) {
        int low=0, mid=0, high=arr.length-1;
        int temp;
        while(mid<=high) {
            System.out.println(Arrays.toString(arr));
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }

    }

    /* Naive approach by using two traversals of the array */
    static int[] sort1(int[] arr) {
        int[] temparr=new int[arr.length];
        int start=0, end=arr.length-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                temparr[start++]=0;
            else if(arr[i]==2)
                temparr[end--]=2;
        }

        for(int i=start;i<=end;i++)
            temparr[i]=1;

        return temparr;
    }


}


