package hust.soict.globalict.virusDemo.viruses;

import java.util.ArrayList;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;

public class RotaVirus extends NonLipidVirus{
	
	private static ArrayList<String> capsidProteins = new ArrayList<String>();
	private static Capsid capsid = new Capsid("triple-layered icosahedral", capsidProteins, "the triple-layered capsid provides robustness and protection for the viral genome and enzymes required for replication");
	private static AcidNu acidNu = new AcidNu("RNA", "Double-stranded RNA", "11 segments pf double-stranded RNA");
	
	public RotaVirus(String name, String type, Capsid capsid, AcidNu acidNu, boolean isLipidEnveloped, int size, String shape) {
		super(name, type, capsid, acidNu, isLipidEnveloped, size, shape);
		capsidProteins.add("VP7 glycoproteins");// outer layer
		capsidProteins.add("VP4 spike proteins");//outer layer
		capsidProteins.add("VP6 proteins");//middle layer
		capsidProteins.add("VP2 proteins");//inner layer
	}
	
	public void attach() {
		System.out.println(getName() + " attaches to host cell surface receptors using " + capsid.getProteins().get(1));
	}
	
	public void penetrate() {
		System.out.println(getName() + " is then taken up by endocytosis");
	}
	
	public void replicate() {
		System.out.println(getName() + "'s viral mRNAs are translated by the host's ribosomes into viral proteins, the viral RNA polymerase replicates the viral RNA");
	}
	
	public void assemble() {
		System.out.println(getName() + "'s new viral particles are assembled in the cytoplasm");
	}
	
	public void release() {
		System.out.println("Mature virions are released either by cell lysis or by budding from the host cell, causing cell damage and leading to the symptoms of gastroenteritis");
	}
	
	public String infectionProcessToString() {
		String text = 
				getName() + " attaches to host cell surface receptors using " + capsid.getProteins().get(1) +  "\r\n"
				+ getName() + " is then taken up by endocytosis\r\n"
				+ getName() + " release viral RNA into the cytoplasm\r\n"
				+ getName() + "'s viral mRNAs are translated by the host's ribosomes into viral proteins, the viral RNA polymerase replicates the viral RNA\r\n"
				+ getName() + "'s new viral particles are assembled in the cytoplasm\r\n"
				+ "Mature virions are released either by cell lysis or by budding from the host cell, causing cell damage and leading to the symptoms of gastroenteritis\r\n";
		return text;
	}
}
