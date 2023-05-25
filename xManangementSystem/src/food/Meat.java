package food;

import java.util.Scanner;

public class Meat extends FoodMaterials implements FoodInput{
	
	protected String part;

	
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	public Meat(FoodMaterialKind kind) {
		this.kind = kind;
	}
	
	public void print_ifo() {
		
		System.out.printf("Foodname: %s, deadline: %s, quantity: %s, origin: %s, meat of part or form: %s",name,deadline,quantity,origin,part);
		System.out.println();
	}

	public void getFoodinput(Scanner scan) {
		setFoodMaterialName(scan);
        
		setFoodMaterialDeadline(scan);
      
		setFoodMaterialQuantity(scan);
        
		setFoodMaterialOrigin(scan); 
	    
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
				setFoodMaterialName(scan);
			}
			else if (num == 2) {
				setFoodMaterialDeadline(scan);
			}
			else if (num == 3) {
				setFoodMaterialQuantity(scan);
			}
			else if (num == 4) {
				setFoodMaterialOrigin(scan);
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
