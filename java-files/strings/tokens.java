import java.io.*;
import java.util.*;

class tokens{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String result = "";
        int resultTokens = 0;

        for(int i=0; i<a.length(); i++){
            char b = a.charAt(i);
            if(((int)b >= 97 && (int)b <= 122) || ((int)b >= 65 && (int)b <= 90)){
                result += b;
            } else if(i>0 && result.charAt(result.length()-1) != '\n'){
                    result += "\n"; 
                    resultTokens++;
            }
        }
        System.out.println(resultTokens);
        System.out.print(result);
    }
}