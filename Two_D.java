// I AM WRITING THIS BASIC CODE TO SEE HOW IT WORKS
// NOT REALLY A GOOD GOOD TO BE UNDERSTOOD BY EVERYONE
import java.util.Scanner;

public class Two_D {
    public static void main(String[] args) {
    
        int m, n;
        System.out.println("Enter the values of m and n");
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
    
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println("\n");
        }
    }
}
