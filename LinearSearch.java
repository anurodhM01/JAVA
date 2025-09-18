// THIS IS JUST A SAMPLE CODE TO CHECK CONCEPT OF LINEAR SEARCH.
import java.util.Scanner;           //
public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {1, 3, 5, 2, 8, 9, 7};  // DECLARING AN ARRAY
        
        System.out.println("Enter number to search: "); // DISPLAYING MESSAGE FOR TARGET VALUE TO SEARCH IN THE ARRAY

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();                           // TARGET VALUE TO SEARCH IN THE ARRAY  
        boolean search =  false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){                              // CHECKING IF NUMBER EXISTS AT ANY PLACE IN ARRAY   
                System.err.println("Number found at index "+i);
                search = true;
                break;
            }
        }
        if(!search){
            System.out.println("Number isn't present.");// DISPLAYING MESSAGE IF NUMBER DOESN'T EXIST.
        }               
    }
}
