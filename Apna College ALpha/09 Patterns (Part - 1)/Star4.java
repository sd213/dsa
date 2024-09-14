
public class Star4 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        System.out.println();
        for(int line = 1; line<=n ; line++){
            for(int charact = 1; charact<=line; charact++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
