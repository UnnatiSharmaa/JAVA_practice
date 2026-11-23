import java.util.*;
public class string_2 {
    public static String upper(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == ' '&& i<s.length()){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
       

    } return sb.toString();}
    public static void main(String args[]){
       String s1="apple is rotten";
       String s2="panda";
       String s3=new String("panda");
       StringBuilder sb=new StringBuilder("hw");

       if(s1==s2){
        System.out.println("barabar");

       }
        else{
            System.out.println("not equal");
        }
       if(s1.equals(s3)){
        System.out.println("barabar");

       }
        else{
            System.out.println("not equal");
        }
    
    String y= s2.substring(0,2);
    System.out.println(y);
    System.out.println(s2.compareTo(s1));
    System.out.println(sb.append('h'));
    String j=upper(s1);
    System.out.print(j);
    
}
}