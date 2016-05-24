import java.util.*;


class java_if_else{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		if (value%2 == 0 && value > 1 && value < 6){
			System.out.println("Not Weird");
		}
		else if (value%2 != 0){
			System.out.println("Weird");
		}
		else if (value%2 == 0 && value > 5 && value < 21){
			System.out.println("Weird");
		}
		else if (value%2 == 0 && value > 20){
			System.out.println("Not Weird");
		}
	}
}