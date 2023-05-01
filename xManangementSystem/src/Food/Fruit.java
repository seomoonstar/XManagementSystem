package Food;

import java.util.Scanner;

public class Fruit extends FoodMaterials{
		private String season;
		
		
		public String getSeason() {
			return season;
		}


		public void setSeason(String season) {
			this.season = season;
		}

		public void print_ifo() {
			
			System.out.printf("Foodname: %s, deadline: %s, quantity: %s, origin: %s, season: %s",name,deadline,quantity,origin,season);
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
	    
	    System.out.print("FoodM season: ");
	    String season = scan.next();
	    this.setSeason(season);
	}	
}
