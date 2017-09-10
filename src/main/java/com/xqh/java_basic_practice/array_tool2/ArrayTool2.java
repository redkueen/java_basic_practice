package com.xqh.java_basic_practice.array_tool2;
public class ArrayTool2 {
    public static MaxMin findMax_finrMin(int[]arr){
       int max=arr[0];
       int min = arr[0];
       int x = 0;
       while(x<arr.length){
           if(arr[x] > max){
               max = arr[x];
           }else if(arr[x]<min){
               min = arr[x];
           }
           x++;
       }
       MaxMin maxMin = new MaxMin(max,min);
       return maxMin;
    }
    public static void main (String[]args){
        int[] arr = {9, 5, 17, 3, 2};
        MaxMin t = ArrayTool2.findMax_finrMin(arr);
        System.out.println(t.m_max);
        System.out.println(t.m_min);

    }
}
