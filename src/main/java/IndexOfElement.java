public class IndexOfElement {
    public static int indexOfElement(int[]arr,int element){
      int x = 0;
      while(x<arr.length){
          if(arr[x] == element){
              return x;
          }
          x++;
      }
      return x;
    }
 public static void main(String[]args){
        int[] arr = {50,2,-9,7};
        int index = indexOfElement(arr,-9);
 }
}
