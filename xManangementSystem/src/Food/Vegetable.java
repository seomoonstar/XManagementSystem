package Food;

import java.util.Scanner;

public class Vegetable extends FoodMaterials{
	
	private char organic;
	
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
	    
	}
}
