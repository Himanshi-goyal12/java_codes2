import java.io.*;
import java.util.*;

public class lucky_four3e {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            String str = sc.next();
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='4')
                    count+=1;
            }
            System.out.println(count);
        }
    }
}

