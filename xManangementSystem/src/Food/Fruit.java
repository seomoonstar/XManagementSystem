package Food;

import java.util.Scanner;

public class Fruit extends Vegetable{
		protected String season;
		
		
		public String getSeason() {
			return season;
		}


		public void setSeason(String season) {
			this.season = season;
		}

		public void print_ifo() {
			
			System.out.printf("Foodname: %s, deadline: %s, quantity: %s, origin: %s, organic: %c, best season: %s",name,deadline,quantity,origin,organic,season);
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
			System.out.println(" 1. 이름 수정 ");
			System.out.println(" 2. 유통기한 수정 ");
			System.out.println(" 3. 저장량 수정 ");
			System.out.println(" 4. 원산지 수정 ");
			System.out.println(" 5. 유기농 여부 수정 ");
			System.out.println(" 6. 제철 계절 수정 ");
			System.out.println(" 7. 나가기");
			System.out.print("1 ~ 7 사이에 원하는 옵션을 선택해주세요: ");
			num = scan.nextInt();
			System.out.println();
			if (num == 1) {
				System.out.print("수정할 식자재 이름: ");
				String name = scan.next();
				setName(name);
			}
			else if (num == 2) {
				System.out.print("수정할 유통기한: ");
				String deadline = scan.next();
				setDeadline(deadline);
			}
			else if (num == 3) {
				System.out.print("수정할 저장량: ");
				String quantity = scan.next();
				setQuantity(quantity);
			}
			else if (num == 4) {
				System.out.print("수정할 원산지: ");
				String origin = scan.next();
				setOrigin(origin);
			}
			else if (num == 5) {
				System.out.println("유기농 여부 수정: ");
				char organic = scan.next().charAt(0);
				setOrganic(organic);
			}
			else if (num == 6) {
				System.out.println("유기농 여부 수정: ");
				String season = scan.next();
				setSeason(season);
			}
			else {
				continue;
			}	
		}
	}
}
