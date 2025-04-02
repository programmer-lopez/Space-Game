import javax.swing.JFrame;
/**
 * Constructor && JFrame && 
 */
public class Windows extends JFrame{
	public static final int  WIDTH = 800, HEIGHT = 600;
	public Windows(){
		setTitle("Space Game");		
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	public static void main(String args[]) {
		new Windows();
	}

}
