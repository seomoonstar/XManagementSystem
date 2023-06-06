package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JPanel{
	public MenuSelection() {
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton but1 = new JButton("Add FoodMaterial");
		JButton but2 = new JButton("delete FoodMaterial");
		JButton but3 = new JButton("edit FoodMaterial");
		JButton but4 = new JButton("view FoodMaterial");
		JButton but5 = new JButton("search FoodMaterial");

		panel1.add(label);
		panel2.add(but1);
		panel2.add(but2);
		panel2.add(but3);
		panel2.add(but4);
		panel2.add(but5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.setVisible(true);
	}
}
