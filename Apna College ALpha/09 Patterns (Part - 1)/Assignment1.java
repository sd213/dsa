public class Assignment1{
    public static void main(String[] args) {
        int n = 9;
        for(int i = 1;i<=n;i++)
        {
            
            for(int j = 1;j<=n+1;j++)
            {
                    if(i==1||i==n){
                        System.out.print(" * ");
                    }
                    else if(j==1||j==n+1)
                        System.out.print(" * ");
                    else{
                        System.out.print("   ");
                    }
            }
            
            
            System.out.println();
        }
    }
}