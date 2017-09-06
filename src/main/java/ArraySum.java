public class ArraySum {
    public static long arraySum(){
        int[] A = {10,38,300,45};
        int Sum = 0;
        int x = 0;
        while(x<A.length){
            Sum = Sum +A[x];
            x++;
        }
        return Sum;
    }
    public static void main(String[]args){
        long t =arraySum();

    }
}
