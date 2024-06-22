package hust.soict.globalict.virusDemo.virusComponents;

import java.util.ArrayList;

public class Envelope {
	private String composition;
	private ArrayList<String> function;
	private String stability;
	
	public Envelope(String composition, ArrayList<String> function,  String stability) {
		this.composition = composition;
		this.function = function;
		this.stability = stability;
	}

	public String getComposition() {
		return composition;
	}

	public ArrayList<String> getFunction() {
		return function;
	}

	public String getStability() {
		return stability;
	}
	
	public void showFunction() {
		for(int i = 0; i < function.size(); i++) {
			System.out.println("\t\t" + function.get(i));
		}
	}
	
	public void displayEnvelope() {
		System.out.println("ENVELOPE: ");
		System.out.println("\tEnvelope Composition: " + getComposition());
		System.out.println("\tFunction: ");
		showFunction();
		System.out.println("\tStability: " + getStability());
	}
}
