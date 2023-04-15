package xManangementSystem;

public class FoodMaterials {

	String name;
	String deadline;
	int quantity;
	String origin;
	
	public FoodMaterials() {
		
	}
	
	public FoodMaterials(String name, int quan) {
		this.name = name;
		quantity = quan;
	}
	
	public FoodMaterials(String name, String deadline, int quan) {
		this.name = name;
		this.deadline = deadline;
		quantity = quan;
	}
	
	public void print_ifo() {
		System.out.printf("Foodname: %s, deadline: %s, quantity: %d, origin: %s",name,deadline,quantity,origin);
		System.out.println();
	}

}
