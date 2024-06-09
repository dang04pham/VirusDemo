package hust.soict.globalict.virusDemo.viruses;

import java.util.ArrayList;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;

public class HIVVirus extends LipidVirus {
	static ArrayList<String> capsidProteins = new ArrayList<String>();
	static ArrayList<String> functionProteins = new ArrayList<String>();
	static Capsid capsid = new Capsid("conical", capsidProteins, "The capsid is crucial for protecting the viral RNA and enzymes like reverse transciptase, integrase, and protease");
	static AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "two identical copies of single-stranded, positive-sense RNA");
	static Envelope envelope = new Envelope("The envelope is derived from the host cell membrane and is studded with viral glycoproteins, primarily gp120 and gp41.", functionProteins, "The envelope makes HIV more susceptible to environmental factors like detergents, heat, and drying, which can inactivate the virus");
	
	public HIVVirus(String name, String type, Capsid capsid, AcidNu acidNu, boolean isLipidEnveloped, int size, String shape) {
		super(name, type, capsid, acidNu, envelope, isLipidEnveloped, size, shape);
		capsidProteins.add("p24 proteins");
		capsidProteins.add("gp120 glycoproteins");
		capsidProteins.add("gp41 glycoproteins");
		functionProteins.add("gp120: Facilitates binding to the CD4 receptor and co-receptors (CCR5 or CXCR4) on host cells");
		functionProteins.add("gp41: Mediates the fusion of the viral envelope with the host cell membrane, allowing entry");
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
	
	public static void main(String[] args) {
		HIVVirus v = new HIVVirus("HIV", "Retrovirus", capsid, acidNu, true, 120, "spherical");
		v.showStructure();
//		v.attach();
		v.showInfectionProcess();
	}
	
}
