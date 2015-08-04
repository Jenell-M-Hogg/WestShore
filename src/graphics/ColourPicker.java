package graphics;

import java.util.Random;

import javafx.scene.paint.Color;

public class ColourPicker {
	
	Random rand= new Random();
	
	Color[] colours={Color.WHITE, Color.BEIGE,Color.CORAL,Color.PALEVIOLETRED, Color.PALEGREEN};
	
	
	
	
	public Color pickRandomColour(){
		int m= rand.nextInt(colours.length);
		return colours[m];
	}
}
