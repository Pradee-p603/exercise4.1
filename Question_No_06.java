package in.co.rays.questions;

public class Question_No_06 {
	public static void main(String[] args) {
		int N = 12;
		int num1 = 0, num2 = 1;
		int count = 0;
		while (count < N) {
			System.out.println(num1 +" ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			count = count + 1;
			
		}
		} 
		
	}




