package xManangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodMaterialManger {

		ArrayList<FoodMaterials> foods = new ArrayList<FoodMaterials>();
		Scanner scan;
		
		FoodMaterialManger(Scanner scan){
			this.scan = scan;
		}

		public  void addFoodMaterials() {
			FoodMaterials food = new FoodMaterials();
			
			System.out.print("FoodM name: ");   
			food.name = scan.next();  // 식자재 이름
	          
	        System.out.print("FoodM deadline: ");
	        food.deadline = scan.next(); // 식자제 유통기한
	        
	        System.out.print("FoodM quantity: ");
	        food.quantity = scan.nextInt(); // 식자재 수량
		    
		    System.out.print("FoodM origin: ");
		    food.origin = scan.next(); // 식자재 원산지
		  
		    foods.add(food);
		}
		
		public  void deleteFoodMaterials() {
			
			System.out.print("FoodM name: ");
	        String FoodName = scan.next();
	        int index = -1;
	        
	        for(int i = 0 ; i<foods.size();i++) {
	        	if(foods.get(i).name.equals(FoodName)) {
		        	index = i;
		        	break;
		        }
	        }
	        
	        if (index >= 0) {
	        	foods.remove(index);
	        	System.out.printf("식자재 %s가 삭제되었습니다.\n",FoodName);
	        }
	        else {
	        	System.out.println("입력하신 식자재를 찾지 못하였습니다.");
	        }

		}
		
		public  void editFoodMaterials() {
			System.out.print("FoodM name: ");
	        String FoodName = scan.next();

	        for(int i = 0 ; i<foods.size();i++) {
	        	FoodMaterials food = foods.get(i);
	        	if(food.name.equals(FoodName) ) {
	        	
	        		int num = -1;
	        		while(num != 5) {
	        			System.out.println("** FoodMaterial Info Edit Menu **");
	        			System.out.println(" 1. 이름 수정");
	        			System.out.println(" 2. 유통기한 수정");
	        			System.out.println(" 3. 저장량 수정");
	        			System.out.println(" 4. 원산지 수정");
	        			System.out.println(" 5. 나가기");
	        			System.out.println("1 ~ 5 사이의 숫자를 입력해주세요: ");
	        			num = scan.nextInt();
	        			if (num == 1) {
	        				System.out.println("식자재 이름: ");
	        				food.name = scan.next();
	        				
	        				
	        			}
	        			else if (num == 2) {
	        				System.out.println("식자재 유통기한: ");
	        				food.deadline = scan.next();
	        			}
	        			else if (num == 3) {
	        				System.out.println("식자재 저장량: ");
	        				food.quantity = scan.nextInt();
	        			}
	        			else if (num == 4) {
	        				System.out.println("식자재 원산지: ");
	        				food.origin = scan.next();
	        			}
	        			else {
	        				continue;
	        			}	
	        		}
	        		break;
	        	}
	        }
		}
		
		public  void viewFoodMaterials() {
//			System.out.print("FoodM name: ");
//			String FoodName  = scan.next();

	        for(int i = 0 ; i<foods.size();i++) {
	        	foods.get(i).print_ifo();
	        }
	        
		}
		

	

}
