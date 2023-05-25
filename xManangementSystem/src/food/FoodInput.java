package food;

import java.util.Scanner;

import exceptionAll.DeadlineFormatException;

public interface FoodInput {
	
	public String getName();
	public void getFoodinput(Scanner scan);
	public void editFoodinfo(Scanner scan);
	public void print_ifo();
	public void setFoodMaterialName(Scanner scan);
	public void setFoodMaterialDeadline(Scanner scan);
	public void setFoodMaterialQuantity(Scanner scan);
	public void setFoodMaterialOrigin(Scanner scan);
}


