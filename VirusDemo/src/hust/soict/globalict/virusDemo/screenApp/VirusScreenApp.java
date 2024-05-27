package hust.soict.globalict.virusDemo.screenApp;

import javax.swing.JFrame;

public class VirusScreenApp extends JFrame{

	public VirusScreenApp() {
		setTitle("Virus Investigation Application");
        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
	}
	
	public void showMainMenu() {
		getContentPane().removeAll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
