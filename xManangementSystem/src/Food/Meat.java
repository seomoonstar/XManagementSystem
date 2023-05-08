package Food;

import java.util.Scanner;

public class Meat extends FoodMaterials{
	
	protected String part;

	
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	public void print_ifo() {
		
		System.out.printf("Foodname: %s, deadline: %s, quantity: %s, origin: %s, meat of part or form: %s",name,deadline,quantity,origin,part);
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
	    
	    System.out.print("FoodM part: ");
	    String part = scan.next();
	    this.setPart(part);
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
			System.out.println(" 5. ���� �Ǵ� ���� ���� ");
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
			else if(num == 5) {
				System.out.println("������ ����: ");
				String part = scan.nextLine();
				setPart(part);
				}
			else {
				continue;
			}	
		}
	}
}
