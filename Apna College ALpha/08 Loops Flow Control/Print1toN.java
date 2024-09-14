
import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        System.out.print("Enter Number:- ");
        int n = new Scanner(System.in).nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }

    }
    
}
