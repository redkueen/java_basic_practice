public class ArraySumEvenSumO {
    public static SumEven_SumO arraySumEvenSumO(){
        int[] a = new int[1000];
        int x = 0;
        int sumEven = 0;
        int sumOdd =0;
        while(x<a.length){
            a[x] = x +1;

            if(a[x] % 2 ==0){
                sumEven =sumEven + a[x];
            }
            else if(a[x] % 2 ==1){
                sumOdd = sumOdd + a[x];
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
