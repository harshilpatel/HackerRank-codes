import java.util.*;
import java.io.*;

class array2d{
    public static void main(String args[]){
        int a[][] = new int[6][6];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i<6; i++){
            for(int j = 0; j<6; j++){
                a[i][j] = s.nextInt();
            }
        }
        int max = -100;
        for(int i = 0; i<=3; i++){
            for(int j = 0; j<=3; j++){
                int temp = 0;
                for(int k = i; k<i+3; k++){
                    for(int l = j; l<j+3; l++){
                        temp += a[k][l];
                    }
                }
                temp -= (a[i+1][j] + a[i+1][j+2]);
                if(max < temp) max = temp;                
            }
        }

        System.out.println(max);
    }
}