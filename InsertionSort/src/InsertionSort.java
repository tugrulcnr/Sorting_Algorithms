/**
 *
 * @author ertugrul
 */
public class InsertionSort {

    static int[] insertionshort(int [] arr){
        for(int i = 1; i< arr.length;i++){
           int tmp = arr[i];
           int j = i-1;
            while (j>-1 && arr[j]> tmp) {
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = tmp;
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        
        int[] myarr = {15,90,38,13,11,45,78,12,10};
        insertionshort(myarr);
        for (int i = 0; i < myarr.length; i++) {
            System.out.print(myarr[i] + " ");
        }
        
    }
    
}
