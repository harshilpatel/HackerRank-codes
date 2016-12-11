import java.io.*;
import java.util.*;

class anagram{
    static boolean isAnagram(String a, String b){
        a = a.toUpperCase();
        b = b.toUpperCase();
        int[] a1 = new int[a.length()];
        int[] b1 = new int[b.length()];

        for(int i=0; i<a.length(); i++){
            a1[i] = (int)a.charAt(i);
        }
        for(int i=0; i<b.length(); i++){
            b1[i] = (int)b.charAt(i);
        }

        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1,b1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();

        System.out.println(isAnagram(a,b) ? "Anagram" : "Not Anagram");

    }
}