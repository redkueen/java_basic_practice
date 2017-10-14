public class ArrayAsign {
    public static int[] arrayAsign(){
        int[] a =new int[1000];
        int x = 0;
        while(x <1000){

            a[x] = x+1;

            x++;
        }
    return a;
    }
    public static void main (String[]args){
       int[] t = arrayAsign();

    }
}
