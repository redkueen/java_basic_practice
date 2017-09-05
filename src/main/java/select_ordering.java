public class select_ordering {
    public static void main(String[] args){
        int[] array = {14,5,86,4,12,3};
        int index ;
        int temp ;
        for (int i =0;i<array.length - 1;i++){
            index = i ;
            for(int j = i+1;j<array.length;j++){
                if(array[index]<array[j]){
                    index =j;
                }
            }
            temp = array[i];
            array[i]=array[index];
            array[index]=temp;
        }

    }

}
