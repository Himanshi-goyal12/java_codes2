import java.util.*;
public class evenoddplaced {
    public static void main(String[] args) {
        int sumOdd=0 ,sumEven=0, c=1;
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            if(c % 2==0)
               sumEven +=n%10;
            else
               sumOdd += n%10;
            n= n/10;
            c++;
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
