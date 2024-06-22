package hust.soict.globalict.virusDemo.virusComponents;

import java.util.ArrayList;

public class Capsid {
	
	protected String shape;
	protected ArrayList<String> proteins;
	protected String features;
	
	public Capsid(String shape, ArrayList<String> proteins, String features) {
		this.shape = shape;
		this.proteins = proteins;
		this.features = features;
	}
	
	public String getShape() {
		return shape;
	}
	
	public String getFeatures() {
		return features;
	}
	
	public ArrayList<String> getProteins() {
		return proteins;
	}
	
	public void showProteins() {
		for(int i = 0; i < proteins.size(); i++) {
			if(i == proteins.size() - 1) {
				System.out.print(proteins.get(i) + ".");
			}
			else{
				System.out.print(proteins.get(i) + ", ");
			}
		}
		System.out.println("");
	}	

	
	public void displayCapsid() {
		System.out.println("CAPSID: ");
		System.out.println("\tShape: " + shape);
		System.out.print("\tComprises of: ");
		showProteins();
		System.out.println("\tKey features: " + features);
		
	}

	@Override
	public String toString() {
		return "Capsid [shape=" + shape + ", proteins=" + proteins + ", features=" + features + "]";
	}
	
}
