package xManangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import Food.FoodMaterials;
import Food.Fruit;
import Food.Meat;
import Food.Vegetable;

public class FoodMaterialManger {

		ArrayList<FoodMaterials> foods = new ArrayList<FoodMaterials>();
		Scanner scan;
		
		FoodMaterialManger(Scanner scan){
			this.scan = scan;
		}

		public  void addFoodMaterials() {
			int kind = 0;
			FoodMaterials food;
			while(kind != 1 && kind != 2 && kind != 3) {
				System.out.println("1 - FoodMaterials");
				System.out.println("2 - Vegetable");
				System.out.println("3 - Fruit");
				System.out.println("4 - Meat");
				System.out.print("Select FoodMaterial Kind between 1 and 2: ");
				kind = scan.nextInt();
				System.out.println();
				
				if(kind == 1) {
					food = new FoodMaterials();
					food.getFoodinput(scan);
				    foods.add(food);
					break;
				}
				else if(kind == 2) {
					food = new Vegetable();
					food.getFoodinput(scan);
					foods.add(food);	
				}
				else if(kind == 3) {
					food = new Fruit();
					food.getFoodinput(scan);
				    foods.add(food);
					break;
				}
				else if(kind == 4) {
					food = new Meat();
					food.getFoodinput(scan);
					foods.add(food);
					break;
				}
				else {
					System.out.println("Select FoodMaterial Kind between 1 and 2: ");

				}
			}
		}
		
		public  void deleteFoodMaterials() {
			
			System.out.print("FoodM name: ");
	        String FoodName = scan.next();
	        int index = -1;
	        
	        for(int i = 0 ; i<foods.size();i++) {
	        	if(foods.get(i).getName().equals(FoodName)) {
		        	index = i;
		        	break;
		        }
	        }
	        
	        if (index >= 0) {
	        	foods.remove(index);
	        	System.out.printf("입력하신 %s를 삭재하였습니다.\n",FoodName);
	        }
	        else {
	        	System.out.println("입력하신 식자재는 존재하지 않습니다.\n");
	        }

		}
		
		public  void editFoodMaterials() {
			System.out.print("수정할 식자재 이름을 입력해 주세요: ");
	        String FoodName = scan.next();

	        for(int i = 0 ; i<foods.size();i++) {
	        	FoodMaterials food = foods.get(i);
	        	if(food.getName().equals(FoodName) ) {
	        	
	        		food.editFoodinfo(scan);
	        		break;
	        	}
	        }
		}
		
		public void searchFoodMaterials() {
			
			System.out.print("수정할 식자재 이름을 입력해 주세요: ");
	        String FoodName = scan.next();
	        int index = -1;
	        
	        for(int i = 0 ; i<foods.size();i++) {
	        	FoodMaterials food = foods.get(i);
	        	if(food.getName().equals(FoodName) ) {
	        		food.print_ifo();
	        		index = 1;
	        		break;
	        	}
	        }
	        if (index != 1) {
	        	System.out.printf("입력하신 식자재는 존재하지 않습니다.\n\n");
	        }
	        else
	        	System.out.println();
		}
		
		public  void viewFoodMaterials() {
//			System.out.print("FoodM name: ");
//			String FoodName  = scan.next();
	        for(int i = 0 ; i<foods.size();i++) {
	        	foods.get(i).print_ifo();
	        }
	        System.out.println();	        
		}

}
