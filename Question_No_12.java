package in.co.rays.questions;

public class Question_No_12 {
	public static void main(String[] args) {
		int number = 121;  
		//sidha or ulta same ho;

		int r;
		int n = number;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		//System.out.println(sum);

		if (sum == number) {
			System.out.println(number + "  is palindrone number");
		} else {
			System.out.println(number + "  is not palindrone number");

		}
		
	}

}
