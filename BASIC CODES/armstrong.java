import java.util.Scanner;

public class armstrong{
    public static void main(String[] args){
        //TAKING NUMBER AS AN INPUT TO CHECK 

        System.out.println("Enter Any Number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        checkArmstrong(number);
        
    }
    // CREATING FUNCTION OF ARMSTRONG NUMBERs

    static void checkArmstrong(int num){    //COUNTING NUMBER OF DIGITS IN A NUMBER
        int temp,rem, count=0,sum=0;
        temp = num;
        while(temp!=0){
            rem = temp%10;
            count++;
            temp = temp/10;
        }
        
        temp = num;                         // DOING SUM OF DIGITS RAISED TO THE POWER WHICH IS TOTAL NUMBER OF DIGITS
        while(temp!=0){
            rem = temp%10;
            sum = sum + (int)Math.pow(rem,count);
            temp = temp/10;
        }
        
        if (num == sum) { System.out.println("Number is Armstrong."); } //CHECKING IF SUM = NUMBER
        else { System.out.println("Number isn't Armstrong."); }
    }
}