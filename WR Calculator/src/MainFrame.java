import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	JPanel panel_attacker;
	
	public MainFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 400);
		setLocationRelativeTo(null);
		
		JPanel testPanel = new JPanel();
		JLabel testLabel = new JLabel("test");
		testPanel.add(testLabel);
		
		getContentPane().add(testPanel);
	}
}
