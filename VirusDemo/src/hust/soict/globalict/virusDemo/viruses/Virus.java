package hust.soict.globalict.virusDemo.viruses;

import java.util.ArrayList;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;

public abstract class Virus {
	protected String name;
	protected String type;
	protected Capsid capsid;
	protected AcidNu acidNu;
	protected boolean isLipidEnveloped;
	protected int size;
	protected String shape;
	protected ArrayList<String> diseases;
	
	public Virus(String name, String type, Capsid capsid, AcidNu acidNu, boolean isLipidEnveloped, int size, String shape) {
		this.name = name;
		this.type = type;
		this.capsid = capsid;
		this.acidNu = acidNu;
		this.isLipidEnveloped = isLipidEnveloped;
		this.size = size;
		this.shape = shape;

	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}

	public Capsid getCapsid() {
		return capsid;
	}

	public AcidNu getAcidNu() {
		return acidNu;
	}

	public boolean isLipidEnveloped() {
		return isLipidEnveloped;
	}

	public int getSize() {
		return size;
	}

	public String getShape() {
		return shape;
	}

	public ArrayList<String> getDiseases() {
		return diseases;
	}
	
	public void setDiseases(String disease) {
		diseases.add(disease);
	}
	
	public void showStructure() {
		
	}
	
	public void attach() {
		
	}
	
	public void penetrate() {
		
	}
	
	public void uncoat() {
		System.out.println(getName() + " release viral RNA into the cytoplasm");
	}
	
	public void replicate() {
		
	}
	
	public void assemble() {
		
	}
	
	public void release() {
		
	}
	
	public void showInfectionProcess() {
		System.out.println(getName() + "'s infection process: ");
		attach();
		penetrate();
		uncoat();
		replicate();
		assemble();
		release();
	}
	
	public void displayDiseases(ArrayList<String> diseases) {
		for(int i = 0; i < diseases.size(); i++) {
			System.out.println(diseases.get(i));
		}
	}
}

