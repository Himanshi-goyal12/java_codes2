import java.util.*;
public class Countdigit {
    public static void main(String args[]) {
		int c=0,N,Digit;
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		Digit=sc.nextInt();
		while(N>0){
			if(N%10==Digit)
			c+=1;
			N/=10;
		}
		System.out.println(c);
        sc.close();
    }
}