package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FoodMaterialAdder extends JFrame{
	public FoodMaterialAdder() {
		JPanel panel = new JPanel(new SpringLayout());
		
		
		JLabel labelName = new JLabel("name: ",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelDeadline = new JLabel("deadline: ",JLabel.TRAILING);
		JTextField fieldDeadline = new JTextField(10);
		labelDeadline.setLabelFor(fieldDeadline);
		panel.add(labelDeadline);
		panel.add(fieldDeadline);
		
		JLabel labelQuantity = new JLabel("quantity: ",JLabel.TRAILING);
		JTextField fieldQuantity = new JTextField(10);
		labelQuantity.setLabelFor(fieldQuantity);
		panel.add(labelQuantity);
		panel.add(fieldQuantity);
		
		JLabel labelOrigin = new JLabel("quantity: ",JLabel.TRAILING);
		JTextField fieldOrigin = new JTextField(10);
		labelOrigin.setLabelFor(fieldOrigin);
		panel.add(labelOrigin);
		panel.add(fieldOrigin);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
