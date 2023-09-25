import java.util.*;
public class toggleinterchange {
    public static void main(String[] args) {
        String k="";
        String str = "My Name is Himanshi Goyal and I am from Mathura";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                k=k+(char)(str.charAt(i)+32);
                
            }
            else
                k=k+(char)(str.charAt(i)-32);
        }
            System.out.println(k);
    }
}
