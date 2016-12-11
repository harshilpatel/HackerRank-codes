import java.io.*;
import java.util.*;

class tokens{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().trim();
        String reg = "[!,?._'@ ]+";
        String[] tokens = str.split(reg);
        String result = "";
        int resultTokens = tokens.length;
        if(str.length() == 0) resultTokens = 0;

        System.out.println(resultTokens);
        for(int i=0; i<resultTokens; i++){
          System.out.print(tokens[i] + "\n");
        }
    }
}
