package Food;

import java.util.Scanner;

public class FoodMaterials {
	
	protected FoodMaterialKind kind = FoodMaterialKind.Fruit;
	protected String name;
	protected String deadline;
	protected String quantity;
	protected String origin;
	
	public FoodMaterialKind getKind() {
		return kind;
	}

	public void setKind(FoodMaterialKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public FoodMaterials() {
		
	}
	
	public FoodMaterials(String name, String quan) {
		this.name = name;
		quantity = quan;
	}
	
	public FoodMaterials(String name, String deadline, String quan, String origin) {
		this.name = name;
		this.deadline = deadline;
		quantity = quan;
		this.origin = origin;
	}
	
	public void print_ifo() {
		
		System.out.printf("Foodname: %s, deadline: %s, quantity: %s, origin: %s",name,deadline,quantity,origin);
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
	}

}
