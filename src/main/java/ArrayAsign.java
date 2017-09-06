public class ArrayAsign {
    public static int[] arrayAsign(){
        int[] A =new int[1000];
        int x = 0;
        while(x <1000){

            A[x] = x+1;

            x++;
        }
    return A;
    }
    public static void main (String[]args){
       int[] t = arrayAsign();

    }
}
