import javax.swing.JPanel;

public class Grid {
	
	private int rows;
	private int columns;
	private GridBlock[][] blocks;
	private JPanel panel;
	
	public Grid(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		blocks = new GridBlock[rows][columns];
		panel = new JPanel();
	}
	
}
