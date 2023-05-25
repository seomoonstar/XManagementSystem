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
			System.out.println(" 1. 이름 수정 ");
			System.out.println(" 2. 유통기한 수정 ");
			System.out.println(" 3. 저장량 수정 ");
			System.out.println(" 4. 원산지 수정 ");
			System.out.println(" 5. 부위 또는 형태 수정 ");
			System.out.println(" 6. 나가기");
			System.out.print("1 ~ 6 사이에 원하는 옵션을 선택해주세요: ");
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
				System.out.println("수정할 내용: ");
				String part = scan.nextLine();
				setPart(part);
				}
			else {
				continue;
			}	
		}
	}
}
