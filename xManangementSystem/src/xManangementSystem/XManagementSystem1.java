package xManangementSystem;

import java.util.Scanner;

public class XManagementSystem1 {

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
		    System.out.println("Select one number between 1 ~ 6: ");
		    num = scan.nextInt();
		    
		    switch(num) {
		    case 1:
		    	// 식재료 추가: 식재료 이름및 유통기한, 갯수등 입력
		    	addFoodMaterials();
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
	public static void addFoodMaterials() {
		Scanner scan = new Scanner(System.in);
		System.out.print("FoodM name: ");
        String FoodName = scan.nextLine();
        System.out.print("FoodM deadline: ");
        String FoodDate = scan.nextLine();
	    String[] YMD = FoodDate.split(".");
	    System.out.print(YMD);
	}

}
