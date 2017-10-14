package com.xqh.java_basic_practice.quick_sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[]args){
        int[] data = {24,10,90,28,36,89,23,67};
        System.out.println("排序之前："+ Arrays.toString(data));
        quickSort(data,0,data.length -1);
        System.out.println("排序之后："+Arrays.toString(data));
    }
    int start,end;
    private static int subSort(int[] data,int start,int end){
        int tmp = data[start];
        while (start<end){
            while (start<end && data[end] >= tmp){
                end--;
            }
            data[start] = data[end];
            while (start<end && data[start]<= tmp){
                start++;
            }
            data[end] = data[start];
        }
        data[end] = tmp;
        System.out.println(Arrays.toString(data));
        return start;
    }
    public static void quickSort(int[]data,int start,int end){
        if (start<end){
            int key = subSort(data,start,end);
            quickSort(data,start,key-1);
            quickSort(data,key+1,end);
        }
    }
}
