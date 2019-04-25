package shapes;

import java.awt.Color;

import javax.swing.JPanel;

public abstract class Shape {

	protected char letter;
	protected Color color;
	protected JPanel panel;
	
	public Shape(char letter, Color color) {
		this.letter = letter;
		this.color = color;
		panel = new JPanel();
	}
	
	public char getLetter() {
		return letter;
	}
	
	public Color getColor() {
		return color;
	}
	
}
