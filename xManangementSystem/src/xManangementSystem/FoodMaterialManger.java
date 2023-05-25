package xManangementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import food.FoodInput;
import food.FoodMaterialKind;
import food.FoodMaterials;
import food.Fruit;
import food.Grain;
import food.Meat;
import food.Vegetable;

public class FoodMaterialManger implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = -6375476758492600391L;
	ArrayList<FoodInput> foods = new ArrayList<FoodInput>();
	transient Scanner scan;
	
	FoodMaterialManger(Scanner scan){
		this.scan = scan;
	}

	public  void addFoodMaterials() {
		int kind = 0;
		FoodInput food;
		while(kind < 1 || kind >3) {
			try {
				System.out.println("1 - Grain");
				System.out.println("2 - Vegetable"); 
				System.out.println("3 - Fruit");
				System.out.println("4 - Meat");
				System.out.print("Select FoodMaterial Kind between 1 ~ 4: ");
				kind = scan.nextInt();
				System.out.println();
			
				if(kind == 1) {
					food = new Grain(FoodMaterialKind.Grain);
					food.getFoodinput(scan);
					foods.add(food);
					break;
				}
				else if(kind == 2) {
					food = new Vegetable(FoodMaterialKind.Vegetable);
					food.getFoodinput(scan);
					foods.add(food);	
					break;
				}
				else if(kind == 3) {
					food = new Fruit(FoodMaterialKind.Fruit);
					food.getFoodinput(scan);
					foods.add(food);
					break;
				}
				else if(kind == 4) {
					food = new Meat(FoodMaterialKind.Meat);
					food.getFoodinput(scan);
					foods.add(food);
					break;
				}
				else {
					System.out.println("Select FoodMaterial Kind between 1 ~ 4: ");
					
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!\n");
		    	if(scan.hasNext()) {
		    		scan.next();
		    	}
		    	kind = -1;
			}
		}
	}
	
	public  void deleteFoodMaterials() {
		
		System.out.print("FoodM name: ");
        String FoodName = scan.next();
        int index = findIndex(FoodName);

        removefromFoodName(index, FoodName);
	}
	
	public int findIndex(String FoodName) {
		int index = -1;
		for(int i = 0 ; i<foods.size();i++) {
        	if(foods.get(i).getName().equals(FoodName)) {
	        	index = i;
	        	break;
	        }
        }
		return index;
	}
	
	public int removefromFoodName(int index, String FoodName) {
		 if (index >= 0) {
			 foods.remove(index);
			 System.out.printf("입력하신 %s를 삭재하였습니다.\n",FoodName);
			 return 1; 
	     }
		 else {
			 System.out.println("입력하신 식자재는 존재하지 않습니다.\n");
			 return -1;
	    } 
	}
	
	public  void editFoodMaterials() {
		System.out.print("수정할 식자재 이름을 입력해 주세요: ");
        String FoodName = scan.next();

        for(int i = 0 ; i<foods.size();i++) {
        	FoodInput food = foods.get(i);
        	if(food.getName().equals(FoodName) ) {
        	
        		food.editFoodinfo(scan);
        		break;
        	}
        }
	}
	
	public void searchFoodMaterials() {
		
		System.out.print("탐색할 식자재 이름을 입력해 주세요: ");
        String FoodName = scan.next();
        int index = -1;
        
        for(int i = 0 ; i<foods.size();i++) {
        	FoodInput food = foods.get(i);
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
        for(int i = 0 ; i<foods.size();i++) {
        	foods.get(i).print_ifo();
        }
        System.out.println();	        
	}  

}
