public class ReverseArray {
    public static void reverseArray (int[]arrA, int[] arrB){
        int x = 0;
        while(x<arrA.length){
            arrB[x]=arrA[arrA.length - x - 1];
            x++;
        }
    }
    public static void main(String[] args){
        int[] arrA ={20,5,-7,9,45};
        int[] arrB = new int[arrA.length];
        reverseArray(arrA,arrB);
    }
}
