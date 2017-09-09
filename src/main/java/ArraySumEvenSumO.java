public class ArraySumEvenSumO {
    public static SumEven_SumO arraySumEvenSumO(){
        int[] A = new int[1000];
        int x = 0;
        int sumEven = 0;
        int sumOdd =0;
        while(x<1000){
            A[x] = x +1;

            if(A[x] % 2 ==0){
                sumEven =sumEven + A[x];
            }
            else if(A[x] % 2 ==1){
                sumOdd = sumOdd + A[x];
            }
            x++;
        }
       SumEven_SumO sumEven_sumO= new SumEven_SumO(sumEven,sumOdd);
        return sumEven_sumO;

    }
    public static void main (String[]args) {
       SumEven_SumO t = arraySumEvenSumO();
       System.out.println(t.s_even);
       System.out.println(t.s_odd);

    }
}
