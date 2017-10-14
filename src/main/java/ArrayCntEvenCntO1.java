public class ArrayCntEvenCntO1 {
    public static void arrayCntEvenCntO1(){
        int[] a = new int[1000];
        int x = 0;
        int cntEven=0;
        int cntO = 0 ;
        while (x<a.length){
            a[x] = x +10;
            int status = a[x] % 2;
        switch (status) {
            case 1:
            cntEven = cntEven + 1;
            System.out.println(cntEven);
            case 0:
            cntO = cntO + 1;
            System.out.println(cntEven);
        }
            x++;
        }
    }
    public static void main(String[]args){
        arrayCntEvenCntO1();

    }
}
