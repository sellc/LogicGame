package shapes;

import java.awt.Color;

public class Square extends Shape{
	
	public Square(char letter, Color color) {
		super(letter, color);
		this.panel.getGraphics().drawRect(0, 0, 100, 100);;
	}

}
