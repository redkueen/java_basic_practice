public class ArrayCntEvenCntO1 {
    public static void arrayCntEvenCntO1(){
        int[] A = new int[1000];
        int x = 0;
        int CntEven=0;
        int CntO = 0 ;
        while (x<1000){
            A[x] = x +10;
            int status = A[x] % 2;
        switch (status) {
            case 1:
            CntEven = CntEven + 1;
            System.out.println(CntEven);
            case 0:
            CntO = CntO + 1;
            System.out.println(CntEven);
        }
            x++;
        }
    }
    public static void main(String[]args){
        arrayCntEvenCntO1();

    }
}
