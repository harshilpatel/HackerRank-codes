// harshil912@gmail.com 

import java.util.*;

class strings{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        
        System.out.println(a.length() + b.length());
        
        if (a.compareTo(b) > 0) System.out.println("Yes");
        else System.out.println("No");
        
        System.out.print( a.toUpperCase().substring(0, 1) + a.substring(1, a.length()) + " ");
        System.out.println( b.toUpperCase().substring(0, 1) + b.substring(1, b.length()) );
    }
}