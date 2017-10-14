public class ArraySum {
    public static long arraySum(){
        int[] a = {10,38,300,45};
        int sum = 0;
        int x = 0;
        while(x<a.length){
            sum = sum +a[x];
            x++;
        }
        return sum;
    }
    public static void main(String[]args){
        long t =arraySum();

    }
}
