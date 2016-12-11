import java.util.*;
import java.io.*;


class palindrom{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int len = a.length();
		if(len % 2 != 0){
			a = a.substring(0,len/2) + a.substring(len/2+1);
		}
		boolean result = true;
		len = a.length();
		for(int i=0; i<len/2; i++){
			if(a.charAt(i) != a.charAt(len-1-i)){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}