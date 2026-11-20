import java.util.*;
public class stringss {
    public static void palin(String n){
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)!=n.charAt(n.length()-1-i)){
                System.out.println("not a palindrome");
                break;
            }
            else{
                System.out.print("palindrome");
                break;
            }

        }
    }
    public static int shortest(String s){
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W'){
                x=x-1;
            }
            else if (s.charAt(i)=='E'){
                x=x+1;
            }
            else if (s.charAt(i)=='N'){
                y=y+1;
            }
            else{
                y=y-1;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (int)Math.sqrt(x2+y2);
         
    }
    public static void main(String[] args){
        char arr[]={'a','b','c','d'};
        String mrr="abcd";
     Scanner sc=new Scanner(System.in);
     String name=sc.nextLine();
     System.out.println(name +" " +name.length()+ mrr.charAt(3));
palin(name);
int g=shortest(name);
System.out.print(g);
     }
    
}