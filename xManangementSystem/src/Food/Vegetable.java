package Food;

import java.util.Scanner;

public class Vegetable extends FoodMaterials{
	
	protected char organic;
	
		public char getOrganic() {
		return organic;
	}

	public void setOrganic(char organic) {
		this.organic = organic;
	}
	
	public void print_ifo() {
		
		System.out.printf("Foodname: %s, deadline: %s, quantity: %s, origin: %s, organic: %c",name,deadline,quantity,origin,organic);
		System.out.println();
	}

		
	public void getFoodinput(Scanner scan) {
		System.out.print("FoodM name: ");   
		String name = scan.next();  //
        this.setName(name);
        
        System.out.print("FoodM deadline: ");
        String deadline = scan.next(); // 
        this.setDeadline(deadline);
        
        System.out.print("FoodM quantity: ");
        String quantity = scan.next(); // 
	    this.setQuantity(quantity);
        
	    System.out.print("FoodM origin: ");
	    String origin = scan.next();
	    this.setOrigin(origin);// 
	    
	    System.out.print("FoodM organic(Y/N): ");
	    char organic = scan.next().charAt(0);
	    this.setOrganic(organic);   
	    System.out.println();
	}
	
	
	public void editFoodinfo(Scanner scan) {
		
		int num = -1;
		while(num != 6) {
			System.out.println();
			System.out.println("** FoodMaterial Info Edit Menu **");
			System.out.println(" 1. �̸� ���� ");
			System.out.println(" 2. ������� ���� ");
			System.out.println(" 3. ���差 ���� ");
			System.out.println(" 4. ������ ���� ");
			System.out.println(" 5. ����� ���� ����");
			System.out.println(" 6. ������");
			System.out.print("1 ~ 6 ���̿� ���ϴ� �ɼ��� �������ּ���: ");
			num = scan.nextInt();
			System.out.println();
			if (num == 1) {
				System.out.print("������ ������ �̸�: ");
				String name = scan.next();
				setName(name);
			}
			else if (num == 2) {
				System.out.print("������ �������: ");
				String deadline = scan.next();
				setDeadline(deadline);
			}
			else if (num == 3) {
				System.out.print("������ ���差: ");
				String quantity = scan.next();
				setQuantity(quantity);
			}
			else if (num == 4) {
				System.out.print("������ ������: ");
				String origin = scan.next();
				setOrigin(origin);
			}
			else if (num == 5) {
				System.out.println("����� ���� ����: ");
				char organic = scan.next().charAt(0);
				setOrganic(organic);
			}
			else {
				continue;
			}	
		}
	}
}
