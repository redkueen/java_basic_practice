public class ArraySumEvenSumO {
    public static long arraySumEvenSumO(){
        int[] A = new int[1000];
        int x = 0;
        int SumEven = 0;
        int SumO =0;
        while(x<1000){
            A[x] = x +1;

            if(A[x] % 2 ==1){
                SumEven =SumEven + A[x];
            }
            else if(A[x] % 2 ==0){
                SumO = SumO + A[x];
            }
            x++;
        }
        return SumEven + SumO;

    }
    public static void main (String[]args) {
       Long t = arraySumEvenSumO();

    }
}
