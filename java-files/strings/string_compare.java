import java.util.*;


class string_compare{
    public static int compare(String a, String b){
        for(int i=0; i<a.length(); i++){
            if((int)a.charAt(i) < (int)b.charAt(i)) return -1;
            if((int)a.charAt(i) > (int)b.charAt(i)) return 1; 
            // else return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = s.nextInt();
        String max_r2 = "";
        String min_r2 = "";
        for(int i=0; i<=a.length()-b; i++){
                String temp = a.substring(i,i+b);
                // System.out.println(temp);
                if(max_r2.length() == 0){
                    max_r2 = min_r2 = temp;
                }
                if(compare(temp, max_r2) > 0) max_r2 = temp;
                if(compare(temp, min_r2) < 0) min_r2 = temp;
                
        }

        System.out.println(min_r2);
        System.out.println(max_r2);
        
    }
}