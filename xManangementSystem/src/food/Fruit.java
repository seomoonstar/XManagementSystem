package food;

import java.util.Scanner;

public class Fruit extends Vegetable {
		protected String season;
		
		
		public String getSeason() {
			return season;
		}
		
		public Fruit(FoodMaterialKind kind) {
			super(kind);
		}

		public void setSeason(String season) {
			this.season = season;
		}

		public void print_ifo() {
			
			System.out.printf("Foodname: %s, deadline: %s, quantity: %s, origin: %s, organic: %c, best season: %s",name,deadline,quantity,origin,organic,season);
			System.out.println();
		}
		
	public void getFoodinput(Scanner scan) {
		setFoodMaterialName(scan);
        
		setFoodMaterialDeadline(scan);
        
		setFoodMaterialQuantity(scan);
		
		setFoodMaterialOrigin(scan);
	    
	    System.out.println("FoodM organic(Y/N): ");
	    char organic = scan.next().charAt(0);
	    this.setOrganic(organic); 
	    
	    System.out.print("FoodM best season: ");
	    String season = scan.next();
	    this.setSeason(season);
	    System.out.println();
	}
	
	public void editFoodinfo(Scanner scan) {
		
		int num = -1;
		while(num != 7) {
			System.out.println();
			System.out.println("** FoodMaterial Info Edit Menu **");
			System.out.println(" 1. �̸� ���� ");
			System.out.println(" 2. ������� ���� ");
			System.out.println(" 3. ���差 ���� ");
			System.out.println(" 4. ������ ���� ");
			System.out.println(" 5. ����� ���� ���� ");
			System.out.println(" 6. ��ö ���� ���� ");
			System.out.println(" 7. ������");
			System.out.print("1 ~ 7 ���̿� ���ϴ� �ɼ��� �������ּ���: ");
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
			else if (num == 5) {
				System.out.println("����� ���� ����: ");
				char organic = scan.next().charAt(0);
				setOrganic(organic);
			}
			else if (num == 6) {
				System.out.println("��ö ���� ����: ");
				String season = scan.next();
				setSeason(season);
			}
			else {
				continue;
			}	
		}
	}
}
