package xManangementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLog;

public class MenuManager {
	static EventLog logger = new EventLog("log.txt");
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		FoodMaterialManger foodManage = getObject("foodmmanager.ser");
		if(foodManage == null) {
			foodManage = new FoodMaterialManger(scan);
		}		
		selectMenu(scan, foodManage);
		putObject(foodManage, "foodmmanager.ser");
	}
	
	public static void selectMenu(Scanner scan, FoodMaterialManger foodManage) {
		int num = -1;
		
		while (num != 6){
			try {
				showMenu();
		    	num = scan.nextInt();
		    	System.out.println();
		    
		    	switch(num) {
		    	case 1:
		    		foodManage.addFoodMaterials();
		    		logger.log("add a FoodMaterials");
		    		break;
		    	case 2:
		    		foodManage.deleteFoodMaterials();
		    		logger.log("delete a FoodMaterials");
		    		break;
		    	case 3:
		    		foodManage.editFoodMaterials();
		    		logger.log("edit a FoodMaterials");
		    		break;
		    	case 4:
		    		foodManage.viewFoodMaterials();
		    		logger.log("view a FoodMaterials");
		    		break;
		    	case 5:
		    		foodManage.searchFoodMaterials();
		    		logger.log("search a FoodMaterials");
		    		break;
		    	default :
		    		continue;
		    	}
		    }catch(InputMismatchException e) {
		    	System.out.println("Please put an integer between 1 and 6!\n");
		    	if(scan.hasNext()) {
		    		scan.next();
		    	}
		    	num = -1;
		    }
		}
	}
	
	public static void showMenu() {
		System.out.println("1.Add Food Materials");
		System.out.println("2.Delete Food Materials");
		System.out.println("3.Edit Food Materials");
		System.out.println("4.View Food Materials");
		System.out.println("5 Search Food Materials");
		System.out.println("6.Exit");
    	System.out.print("Select one number between 1 ~ 6: ");
	}
	
	public static FoodMaterialManger getObject(String filename) {
		FoodMaterialManger foodmm = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			foodmm = (FoodMaterialManger)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return foodmm;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return foodmm;
	}
	
	public static FoodMaterialManger putObject(FoodMaterialManger foodmm, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(foodmm);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return foodmm;
	}
}
