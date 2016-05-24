import java.util.*;

public class output_formatting{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String words[] = new String[3];
        int numbers[] = new int[3];
        
        for(int i = 0; i < 3; i++){
            words[i] = s.next();
            numbers[i] = s.nextInt();
        }
        
        System.out.println("================================");
        for(int i=0; i<3; i++){
            System.out.print(words[i]);
            for(int j=words[i].length() ; j<15;j++){
                System.out.print(" ");
            }
            if( numbers[i] < 10){
                System.out.print("00");
            }
            else if( numbers[i] < 100){
                System.out.print("0");
            }
            System.out.print(numbers[i]);
            System.out.println("");            
            
        }
        System.out.println("================================");
    }
}