import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
    int num, i, count = 0;
    System.out.println("Enter Any Number To Check: ");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    for(i = 1; i <=num; i++){
        if(num%i == 0){
            count++;
        }
    }
    if(count==2){
        System.out.println(num + " is Prime.");
    }
    else{
        System.out.println(num + " isn't Prime.");
    }
        
    }
}
