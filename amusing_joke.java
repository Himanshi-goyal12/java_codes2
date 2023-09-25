import java.io.*;
import java.util.*;


    public class amusing_joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = s1.concat(s2);
        if(s4.length()<=100 && s4.length()==s3.length())
            System.out.print("YES");
        else
            System.out.print("NO");

    }
}

