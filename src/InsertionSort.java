/**
 * Created by jeremy on 2017Y 7M 3D.
 */
public class InsertionSort {

    private static int[] array = {5,7,3,2,9,0,1};

    public static void main(String[] args){
        insertionSort(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array){
        int i,j,temp;
        for(i = 0;i < array.length - 1;i++){
            for(j = i + 1; j > 0; j--){
                if(array[j - 1] <= array[j]){
                    break;
                }
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }

        }
    }


}
