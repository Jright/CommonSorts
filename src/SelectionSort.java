/**
 * Created by jeremy on 2017Y 7M 3D.
 */
public class SelectionSort {


    /*
     *
     * */

    private static int[] array = {5,7,3,2,9,0,1};

    public static void main(String[] args){
        selectionSort(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] arr){

        int i,j,min,temp;
        int len = arr.length;
        for(i = 0;i < len - 1;i++){
            //First select every element to compare
            min = i;
            for(j = i + 1;j < len;j ++){
                //then run a loop,search for the minimum value,record it.
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //after the inner loop ends,swap the value of the element we located in the outer loop and the minimum
            //value we found inside the inner loop.
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
