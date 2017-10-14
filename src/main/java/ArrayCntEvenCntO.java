public class ArrayCntEvenCntO {
    public static void arrayCntEvenCntO(){
        int[] A = new int[1000];
        int x = 0;
        int cntEven=0;
        int cntO = 0 ;
        while (x<A.length){
            A[x] = x +10;
            if(A[x]%2 ==1){
                cntEven = cntEven + 1;
            }else if (A[x]%2 ==0){
                cntO = cntO + 1;
            }
            x++;
        }
    }
    public static void main(String[]args){
        arrayCntEvenCntO();

    }
}
