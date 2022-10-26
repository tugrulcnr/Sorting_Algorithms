/**
 *
 * @author ertugrul
 */
public class BubbleSort {

    
    static int[] bubleshort(int [] arr){
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        
        
        
        return arr;
    } 
    
    public static void main(String[] args) {

        int[] myarr = {15,90,38,13};
        bubleshort(myarr);
        for (int i = 0; i < myarr.length; i++) {
            System.out.print(myarr[i] + " ");
        }

    }
    
}
