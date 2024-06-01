package hust.soict.globalict.virusDemo.screenApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.globalict.virusDemo.viruses.CovidVirus;

public class Covid19Frame extends JFrame{
	CovidVirus virus = new CovidVirus();
	JPanel mainPanel;
	ScrollPane scrollpane = new ScrollPane();
	
	public Covid19Frame() {
		setTitle("SARS-CoV2");
		setSize(800, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JMenu menu = new JMenu("Options");
		JMenuItem showStructure = new JMenuItem("Display Structure");
		showStructure.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		JMenuItem showInfectionProcess = new JMenuItem("Display Infection Process");
		showInfectionProcess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		menu.add(showStructure);
		menu.add(showInfectionProcess);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(menuBar);
		add(north);
		
		
	}
}
