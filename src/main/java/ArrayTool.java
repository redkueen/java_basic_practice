public class ArrayTool {
    public static int findMax_finrMin(int[]arr){
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
       return max + min;//max + "" + min
    }
    public static void main (String[]args){
        int[] arr = {9, 5, 17, 3, 2};
        int t =ArrayTool.findMax_finrMin(arr);

    }
}
