import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readIntTOFile_MoveBit_BitOr_Array {
    public static void main(String []args){
        readIntTOFile_MoveBit_BitOr_Array("d://data0");

    }
    public static int[] readIntTOFile_MoveBit_BitOr_Array(String file_path){

        try {
            FileInputStream fis = new FileInputStream(file_path);
            long file_length= new File(file_path).length();
            int x,x0,x1,x2,x3;
           int[] arr = new int[(int) (file_length / 4)];
           int i=0;
           while(i < file_length/4){
               try {
                   x0 = fis.read();
                   x1 = fis.read();
                   x2 = fis.read();
                   x3 = fis.read();
                   x0 = x0;
                   x1 = (x1 <<1 * 8);
                   x2 = (x2 <<2 * 8);
                   x3 = (x3 <<3 * 8);

                   x = x0|x1|x2|x3;
                   arr[i] = x;
                   i++;

               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
            fis.close();
            return arr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
