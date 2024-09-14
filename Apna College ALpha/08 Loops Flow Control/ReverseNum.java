public class ReverseNum {
    public static void main(String[] args) {
        int num =10899;
        int revNum = 0;
        int n = num;
        while(n>0){
            revNum = revNum*10 + n%10;
            n = n/10;
        }
        System.out.println("Reverse Of Num :"+ revNum);
    }
}
