/**
 *
 * @author ertugrul
 */
public class SelectionSort {

    static int[] selectionshort(int [] arr){
        for(int i = 0; i< arr.length-1;i++){
           int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
        
        return arr;
    }
    
    public static void main(String[] args) {

        int[] myarr = {15,90,38,13,11,45,78,12,10};
        selectionshort(myarr);
        for (int i = 0; i < myarr.length; i++) {
            System.out.print(myarr[i] + " ");
        }

    }
    
}
