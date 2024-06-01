package hust.soict.globalict.virusDemo.screenApp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NonLipidVirusPanel extends JPanel {
	public JButton NoroButton, RotaButton;
	public JPanel mainPanel;
	
	public NonLipidVirusPanel() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		NoroButton = new JButton("NoroVirus");
		NoroButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		mainPanel.add(NoroButton);
		
		RotaButton = new JButton("RotaVirus");
		RotaButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		
		});
		mainPanel.add(RotaButton);
		add(mainPanel);
	}
}
