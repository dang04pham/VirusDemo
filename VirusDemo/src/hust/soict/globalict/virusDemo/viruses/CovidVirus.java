package hust.soict.globalict.virusDemo.viruses;

import java.util.ArrayList;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;

public class CovidVirus extends LipidVirus{
	static ArrayList<String> capsidProteins = new ArrayList<String>();
	static ArrayList<String> functionProteins = new ArrayList<String>();
	static Capsid capsid = new Capsid("helical nucleocapsid", capsidProteins, "The envelope and its spike proteins are key for virus attachment and entry into host cells");
	static AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "single, positive-sense RNA genome");
	static Envelope envelope = new Envelope("The envelope is also derived from the host cell membrane, containing viral proteins like the spike (S), envelope (E), and membrane (M) proteins", functionProteins, "The envelope is relatively fragile, making the virus sensitive to disinfectants, heat, and drying. However, the spike protein's affinity for the ACE2 receptor increases its infectivity");

	public CovidVirus(String name, String type, Capsid capsid, AcidNu acidNu, boolean isLipidEnveloped, int size, String shape) {
		super(name, type, capsid, acidNu, envelope, isLipidEnveloped, size, shape);
		capsidProteins.add("spike (S) proteins");
		capsidProteins.add("membrane (M) proteins");
		capsidProteins.add("envelope (E) proteins");
		functionProteins.add("Spike Protein (S): Binds to the ACE2 receptor on host cells, critical for viral entry");
		functionProteins.add("Envelope Protein (E): Involved in virus assembly and release");
		functionProteins.add("Membrane Protein (M): Helps maintain the structure of the virion");
	}
	
	public void attach() {
		System.out.print(getName() + " binds to the ACE2 receptor on respiratory epithelial cells using " + getCapsid().getProteins().get(0));
	}
	
	public void penetrate() {
		System.out.println(getName() + " fuse with the host cell membrane or endocytosis");
	}
	
	public void replicate() {
		System.out.println(getName() + "'s viral RNA is replicated and transcribed by the host cell machinery. The RNA-dependent RNA polymerase synthesizes new viral RNA");
	}
	
	public void assemble() {
		System.out.println(getName() + " assemble new virions in the endoplasmic reticulum and Golgi apparatus");
	}
	
	public void release() {
		System.out.println("New virions are transported to the cell surface in vesicles and released by exocytosis to infect other cells");
	}
	
	public static void main(String[] args) {
		CovidVirus v = new CovidVirus("SARS-CoV2", "Betacoronavirus", capsid, acidNu, true, 120, "spherical");
		v.showStructure();
		v.showInfectionProcess();
		
	}
	
}
