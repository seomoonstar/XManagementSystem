package xManangementSystem;
import java.util.Scanner;
public class XManangementSystem {

	public static void main(String[] args) {
		int i = 0;
		int count = 10 , num;
		Scanner scan = new Scanner(System.in);
		
		
		while (i < count){
			System.out.println("1.Add Food Materials");
		    System.out.println("2.Delete Food Materials");
		    System.out.println("3.Edit Food Materials");
		    System.out.println("4.View Food Materials");
		    System.out.println("5.Show A Menu");
		    System.out.println("6.Exit");
		    
		    System.out.println("Select one number between 1 ~ 5: ");
		    num = scan.nextInt();
		    switch(num) {
		    case 1:
		    	// 식재료 추가: 식재료 이름및 유통기한, 갯수등 입력
		    	System.out.print("In put Food Name: ");
		    	String nameA = scan.next();
		    	System.out.print("In put Food Deadline: ");
		    	int month = scan.nextInt();
		    	int date = scan.nextInt();
		    	break;
		    case 2:
		    	// 제가할 식재료 이름 입력
		    	System.out.print("In put Food Name" );
		    	String nameD = scan.next();
		    case 3:
		    	System.out.print("In put Food Name");
		    case 4:
		    case 5:
		    case 6:
		    	break;
		    }
		    i++;
		}     
	}
}
