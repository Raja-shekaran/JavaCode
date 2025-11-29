package practise;

public class Practise {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++)
        {
            //Spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=0;j<2*i+1;j++){
                if(j==0 || j==2*i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            //Spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=0;j<2*i+1;j++){
                if(j==0 || j==2*i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
