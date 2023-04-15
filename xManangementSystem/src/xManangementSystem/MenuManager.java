package xManangementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		FoodMaterialManger foodManage = new FoodMaterialManger(scan);
		
		int num = -1;
		
		while (num != 5){
			System.out.println("1.Add Food Materials");
		    System.out.println("2.Delete Food Materials");
		    System.out.println("3.Edit Food Materials");
		    System.out.println("4.View Food Materials");
		    System.out.println("5.Exit");
		    System.out.println("Select one number between 1 ~ 6: ");
		    num = scan.nextInt();
		    
		    switch(num) {
		    case 1:
		    	// 식재료 추가: 식재료 이름및 유통기한, 갯수등 입력
		    	foodManage.addFoodMaterials();
		    	break;
		    case 2:
		    	// 제가할 식재료 이름 입력
		    	foodManage.deleteFoodMaterials();
		    	break;

		    case 3:
		    	foodManage.editFoodMaterials();
		    	break;

		    case 4:
		    	foodManage.viewFoodMaterials();
		    	break;
		    case 5:
		    	break;
		    }
		}
	}

}
