public class InvertedIndex {
    static  int[] arr;
    static  int[] arrInvert;
    public static void createInvertedIndex(){
        arrInvert = new int[51];
        int x = 0;
        while(x<arr.length){
            arrInvert[arr[x]] = x;
            x++;
        }
    }
    public static int indexof(int element){
      int i = arrInvert[element];
      return i;
    }
    public static void main(String[] args){
        InvertedIndex.arr = new int[]{50, 2, 9, 7, 6};
        InvertedIndex.createInvertedIndex();
        int i = InvertedIndex.indexof(7);
    }

}
