public class CountOfBigThan {
    public static int countOfBigThan(int[] A,int n){
        int x = 0;
        int cnt = 0;
        while(x<A.length){
            if (A[x] > n){
                cnt = cnt + 1;
            }
            x++;
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] a = {20,5,7,-9};
        int cnt = countOfBigThan( a,10);

    }
}
