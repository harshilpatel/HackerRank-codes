// harshil912@gmail.com

import java.util.*;

public class loops{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        
        for(int tests = 0; tests< testCases; tests++){
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            
            for(int i=1; i<=n; i++){
                int result = a;
                for(int j=0; j<i ; j++){
                    result += (int)(Math.pow(2, j) * b);
                }
                System.out.print(result + " ");
                
            }
            System.out.println("");            
        }
        
        
    }
}