import java.util.*;
public class alphabetsdigitsspecial {
    public static void main(String[] args) {
        int alphabets =0,digits=0,special=0;
       // String str = "my name is ###234";        
       System.out.println("enter the string");
       Scanner sc = new Scanner(System.in);
        String str= sc.next();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch>='a' && ch<='z'  || ch>='A' && ch<='Z'){
                alphabets++;
            }
            else if(ch >= '0' &&ch<='9'){
                digits++;
            }
            else{
                special++;
            }
           
        }
         System.out.println("alphabets="+alphabets);
            System.out.println("digits="+digits);
            System.out.println("special="+special);
    }    
}
