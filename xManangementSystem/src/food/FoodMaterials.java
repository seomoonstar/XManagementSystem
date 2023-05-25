package food;

import java.io.Serializable;
import java.util.Scanner;

import exceptionAll.DeadlineFormatException;

public abstract class FoodMaterials implements FoodInput, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8234309684462878604L;
	
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
	public void setDeadline(String deadline) throws DeadlineFormatException {
		if(!deadline.contains(".")) {
			throw new DeadlineFormatException();
		}
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
	public FoodMaterials(FoodMaterialKind kind) {
		this.kind = kind;
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
	
	public void setFoodMaterialName(Scanner scan) {
		System.out.print("FoodM name: ");   
		String name = scan.next();  //
        this.setName(name);
	}
	public void setFoodMaterialDeadline(Scanner scan) {
		String deadline = "";
		while(!deadline.contains(".")){
			System.out.print("FoodM deadline: ");
	        deadline = scan.next(); // 
	        try {
	            this.setDeadline(deadline);
	        }catch(DeadlineFormatException e) {
	        	System.out.println("Incorrect Deadline Format. put the Deadline that contains '.'\n");
	        }
		}
	}
	public void setFoodMaterialQuantity(Scanner scan) {
		System.out.print("FoodM quantity: ");
        String quantity = scan.next(); // 
	    this.setQuantity(quantity);
	}
	public void setFoodMaterialOrigin(Scanner scan) {
		System.out.print("FoodM origin: ");
	    String origin = scan.next();
	    this.setOrigin(origin);
	}
	
	public abstract void print_ifo();
	public abstract void getFoodinput(Scanner scan) ;
	public abstract void editFoodinfo(Scanner scan) ;
	
	public String getKindString() {
		String skind  = "none";
		switch(this.kind) {
		case Fruit:
			skind = "Fruit";
		case Vegetable:
			skind = "Vegetable";
		case Grain:
			skind = "Middle";
		case Meat:
			skind = "Meat";
		default:
		}
		return skind;
	}

}
