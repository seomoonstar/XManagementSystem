package gui;

import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FoodViewer extends JFrame{

	public FoodViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Deadline");
		model.addColumn("Quantity");
		model.addColumn("Origin");

		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
