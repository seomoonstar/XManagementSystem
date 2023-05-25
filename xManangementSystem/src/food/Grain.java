package food;

import java.util.Scanner;

public class Grain extends FoodMaterials implements FoodInput{
	
	protected double kcal;
	
	public double getKcal() {
		return kcal;
	}

	public void setKcal(double kcal) {
		this.kcal = kcal;
	}
	
	public Grain(FoodMaterialKind kind) {
		this.kind = kind;
	}
	
	public void print_ifo() {
		
		System.out.printf("Foodname: %s, deadline: %s, quantity: %s, origin: %s , calories per 1g: %f",name,deadline,quantity,origin,kcal);
		System.out.println();
	}
	
	public void getFoodinput(Scanner scan) {
		setFoodMaterialName(scan);
        
		setFoodMaterialDeadline(scan);
      
		setFoodMaterialQuantity(scan);
        
		setFoodMaterialOrigin(scan);

	    System.out.print("FoodM calori per 1g: ");
	    double kcal = scan.nextDouble();
	    this.setKcal(kcal);//
	    System.out.println();

	}
	
	public void editFoodinfo(Scanner scan) {
		
		int num = -1;
		while(num != 6) {
			System.out.println();
			System.out.println("** FoodMaterial Info Edit Menu **");
			System.out.println(" 1. �̸� ���� ");
			System.out.println(" 2. ������� ���� ");
			System.out.println(" 3. ���差 ���� ");
			System.out.println(" 4. ������ ���� ");
			System.out.println(" 5. Į�θ� ���� ");
			System.out.println(" 6. ������");
			System.out.print("1 ~ 6 ���̿� ���ϴ� �ɼ��� �������ּ���: ");
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
				System.out.println("������ Į�θ���: ");
				double kcal = scan.nextDouble();
				setKcal(kcal);
			}
			else {
				continue;
			}	
		}
	}
}
