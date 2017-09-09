public class IndexOfElement {
    public static int indexOfElement(int[]arr,int element){
      int x = 0;
      while(x<arr.length){
          if(arr[x] == element){
              return x;
          }
          x++;
      }
      return -1;  //返回-1,表示所查询元素不存在于数组中，下标不存在
    }
 public static void main(String[]args){
        int[] arr = {50,2,-9,7};
        int index = indexOfElement(arr,10);
 }
}
