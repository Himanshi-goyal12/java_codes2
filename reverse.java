import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int digit= n%10;
            sum=(sum*10)+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
