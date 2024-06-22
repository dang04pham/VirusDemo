package hust.soict.globalict.virusDemo.viruses;

import java.util.ArrayList;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;

public class HIVVirus extends LipidVirus {
	ArrayList<String> capsidProteins = new ArrayList<String>();
	ArrayList<String> functionProteins = new ArrayList<String>();
	Capsid capsid = new Capsid("conical", capsidProteins, "The capsid is crucial for protecting the viral RNA and enzymes like reverse transciptase, integrase, and protease");
	AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "two identical copies of single-stranded, positive-sense RNA");
	Envelope envelope = new Envelope("The envelope is derived from the host cell membrane and is studded with viral glycoproteins, primarily gp120 and gp41.", functionProteins, "The envelope makes HIV more susceptible to environmental factors like detergents, heat, and drying, which can inactivate the virus");
	
	public HIVVirus(String name, String type, Capsid capsid, AcidNu acidNu, Envelope envelope, boolean isLipidEnveloped, int size, String shape) {
		super(name, type, capsid, acidNu, envelope, isLipidEnveloped, size, shape);
	}
	
	public void attach() {
		System.out.println(getName() + " binds to the CD4 receptor on the surface of the target cell using " + getCapsid().getProteins().get(1));
	}
	
	public void penetrate() {
		System.out.println(getName() + " fuse with the host cell membrane");
	}
	
	public void replicate() {
		System.out.println(getName() + " reverse transcription of RNA into DNA, then integrate into host genome");
	}
	
	public void assemble() {
		System.out.println(getName() + " assemble new virions in the host cell");
	}
	
	public void release() {
		System.out.println("New virions bud off from the host cell, acquiring a portion of the host cell membrane as their envelope, and go on to infect other cells");
	}
	
	public String infectionProcessToString() {
		String text = 
				getName() + " binds to the CD4 receptor on the surface of the target cell using " + getCapsid().getProteins().get(1) + "\r\n"
				+ getName() + " fuse with the host cell membrane\r\n"
				+ getName() + " release viral RNA into the cytoplasm\r\n"
				+ getName() + " reverse transcription of RNA into DNA, then integrate into host genome\r\n"
				+ getName() + " assemble new virions in the host cell\r\n"
				+ "New virions bud off from the host cell, acquiring a portion of the host cell membrane as their envelope, and go on to infect other cells\r\n";
		return text;
	}
	
//	public static void main(String[] args) {
//		HIVVirus v = new HIVVirus("HIV", "Retrovirus", capsid, acidNu, true, 120, "spherical");
//		v.showStructure();
////		v.attach();
//		v.showInfectionProcess();
//	}
	
}
