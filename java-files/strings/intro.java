// https://www.hackerrank.com/challenges/java-strings-introduction


import java.io.*;
import java.util.*;

class intro{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        System.out.println(a.length() + b.length());
        for(int i=0; i<a.length(); i++){
            int a1 = (int)a.charAt(i);
            int b1 = (int)b.charAt(i);
            if(a1 > b1){
                System.out.println("Yes"); 
                break;
            }
            else{
                System.out.println("No");
                break;
            }

        }
        a = a.substring(0,1).toUpperCase() + a.substring(1);
        b = b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(a+" "+b);
    }
}