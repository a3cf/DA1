import java.util.*;
public class DA1 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = S1.nextInt();
        int b = S1.nextInt();
        int g = findgcd(a,b);
        System.out.println("GCD = "+g);

    }

    private static int findgcd(int a,int b){
        if(a%b==0)
            return b;
        else
            return findgcd(b,a%b);
    }

}
