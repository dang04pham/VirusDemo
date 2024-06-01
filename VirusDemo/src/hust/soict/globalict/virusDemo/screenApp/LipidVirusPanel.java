package hust.soict.globalict.virusDemo.screenApp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LipidVirusPanel extends JPanel{
	public JButton covidButton, HIVButton;
	public JPanel mainPanel;
	
	public LipidVirusPanel() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		covidButton = new JButton("SARS-CoV2");
		covidButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Covid19Frame frame = new Covid19Frame();
				frame.setVisible(true);
				
			}
			
		});
		mainPanel.add(covidButton);
		
		HIVButton = new JButton("HIV");
		HIVButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		});
		mainPanel.add(HIVButton);
		add(mainPanel);
	}
}
