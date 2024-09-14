
public class Star2 {
    public static void main(String[] args) {
        System.out.println();
        int n = 7;
        for(int line = 1;line <=n ; line++){
            for(int star = 1;star<=n-line+1;star++)
                System.out.print(" * ");
            System.out.println();
        }
        System.out.println();
        
        for(int line = 1;line<=n;line++){
            for(int star = n ;star>=line;star--)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
