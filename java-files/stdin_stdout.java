import java.util.Scanner;

class stdin_stdout{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int intValue = s.nextInt();
        double doubleValue = s.nextDouble(); s.nextLine();
        String stringValue = s.nextLine();
        
        System.out.println("String: " + stringValue);        
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}