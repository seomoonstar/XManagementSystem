package xManangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import Food.FoodMaterials;
import Food.Fruit;
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
				System.out.println("2 - Fruit");
				System.out.println("3 - Vegetable");
				System.out.print("Select FoodMaterial Kind between 1 and 2: ");
					kind = scan.nextInt();
				
				if(kind == 1) {
					food = new FoodMaterials();
					food.getFoodinput(scan);
				    foods.add(food);
					break;
				}
				else if(kind == 2) {
					food = new Fruit();
					food.getFoodinput(scan);
				    foods.add(food);
					break;
				}
				else if(kind == 3) {
					food = new Vegetable();
					food.getFoodinput(scan);
					foods.add(food);				}
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
	        	System.out.printf("�Է��Ͻ� %s�� �����Ͽ����ϴ�.\n",FoodName);
	        }
	        else {
	        	System.out.println("�Է��Ͻ� ������� �������� �ʽ��ϴ�.\n");
	        }

		}
		
		public  void editFoodMaterials() {
			System.out.print("������ ������ �̸��� �Է��� �ּ���: ");
	        String FoodName = scan.next();

	        for(int i = 0 ; i<foods.size();i++) {
	        	FoodMaterials food = foods.get(i);
	        	if(food.getName().equals(FoodName) ) {
	        	
	        		int num = -1;
	        		while(num != 5) {
	        			System.out.println("** FoodMaterial Info Edit Menu **");
	        			System.out.println(" 1. �̸� ���� ");
	        			System.out.println(" 2. ������� ���� ");
	        			System.out.println(" 3. ���差 ���� ");
	        			System.out.println(" 4. ������ ���� ");
	        			System.out.println(" 5. ������");
	        			System.out.println("1 ~ 5 ���̿� ���ϴ� �ɼ��� �������ּ���: ");
	        			num = scan.nextInt();
	        			if (num == 1) {
	        				System.out.println("������ ������ �̸�: ");
	        				String name = scan.next();
	        				food.setName(name);
	        			}
	        			else if (num == 2) {
	        				System.out.println("������ �������: ");
	        				String deadline = scan.next();
	        				food.setDeadline(deadline);
	        			}
	        			else if (num == 3) {
	        				System.out.println("������ ���差: ");
	        				String quantity = scan.next();
	        				food.setQuantity(quantity);
	        			}
	        			else if (num == 4) {
	        				System.out.println("������ ������: ");
	        				String origin = scan.next();
	        				food.setOrigin(origin);
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
