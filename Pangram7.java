import java.io.*;
import java.util.*;

public class Pangram7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next().toLowerCase();

        if(str.length()>=26)
        {
            boolean arr[] =new boolean[26];
            for(int i=0; i<str.length(); i++)
            {
                int index =str.charAt(i)-'a';
                if(!arr[index]){
                    arr[index]=true;
                }
            }
            boolean flag=true;
            for(int i=0; i<arr.length;i++)
            {
                if(arr[i]==false){
                    flag=false;
                    break;}
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}

