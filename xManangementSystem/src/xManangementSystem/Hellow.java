package xManangementSystem;
import java.util.Scanner;

public class Hellow {

	public static void main(String[] args) {
		/*
		int num;
		System.out.print("Input Number: ");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(int i = 0 ; i<num ; i++) {
			int cou = scan.nextInt();
		
			if(cou>0) {
				System.out.println("positive number");
			}
			else if(cou == 0) {
				System.out.println("Zero");
			}
			else {
				System.out.println("negative number");
			}
		}*/
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("숫자를 입력해 주세용: ");
		num = scan.nextInt();
		
		if((num %2 ) == 0 ) {
			System.out.println(num + " 은 짝수입니다.");
		}
		else {
			System.out.println(num + " 은 홀수입니다.");
		}
	}
}
