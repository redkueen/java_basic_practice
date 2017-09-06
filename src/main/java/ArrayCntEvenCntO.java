public class ArrayCntEvenCntO {
    public static void arrayCntEvenCntO(){
        int[] A = new int[1000];
        int x = 0;
        int CntEven=0;
        int CntO = 0 ;
        while (x<1000){
            A[x] = x +10;
            if(A[x]%2 ==1){
                CntEven = CntEven + 1;
            }else if (A[x]%2 ==0){
                CntO = CntO + 1;
            }
            x++;
        }
    }
    public static void main(String[]args){
        arrayCntEvenCntO();

    }
}
