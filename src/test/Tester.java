package test;

import javax.swing.JFrame;

import boat.Boat;
import boat.BoatGraphic;
import boat.BoatModel;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame win= new JFrame();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setTitle("TestOut");
		
		
		
		Boat b= new Boat("Test");
		
		win.add(b.getGraphic());
		
		win.setVisible(true);
	}

}
