import java.io.*;
import java.util.*;

public class static_init{
    static Scanner s = new Scanner(System.in);
    static int B = s.nextInt();
    static int H = s.nextInt();
    static boolean flag = init();

    public static boolean init(){
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
        return true;
    }
    
    public static void main(String args[]){
        if(flag){
            System.out.println(B*H);
        }
    }
}