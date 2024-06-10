package hust.soict.globalict.virusDemo.viruses;

import java.util.ArrayList;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;

public class CovidVirus extends LipidVirus{
	ArrayList<String> capsidProteins = new ArrayList<String>();
	ArrayList<String> functionProteins = new ArrayList<String>();
	Capsid capsid = new Capsid("helical nucleocapsid", capsidProteins, "The envelope and its spike proteins are key for virus attachment and entry into host cells");
	AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "single, positive-sense RNA genome");
	Envelope envelope = new Envelope("The envelope is also derived from the host cell membrane, containing viral proteins like the spike (S), envelope (E), and membrane (M) proteins", functionProteins, "The envelope is relatively fragile, making the virus sensitive to disinfectants, heat, and drying. However, the spike protein's affinity for the ACE2 receptor increases its infectivity");

	public CovidVirus(String name, String type, Capsid capsid, AcidNu acidNu, Envelope envelope, boolean isLipidEnveloped, int size, String shape) {
		super(name, type, capsid, acidNu, envelope, isLipidEnveloped, size, shape);
	}
	
	public void attach() {
		System.out.println(getName() + " binds to the ACE2 receptor on respiratory epithelial cells using " + getCapsid().getProteins().get(0));
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
	
	public String infectionProcessToString() {
		String text = 
				getName() + " binds to the ACE2 receptor on respiratory epithelial cells using spike (S) proteins\r\n"
				+ getName() + " fuse with the host cell membrane or endocytosis\r\n"
				+ getName() + " release viral RNA into the cytoplasm\r\n"
				+ getName() + "'s viral RNA is replicated and transcribed by the host cell machinery. The RNA-dependent RNA polymerase synthesizes new viral RNA\r\n"
				+ getName() + " assemble new virions in the endoplasmic reticulum and Golgi apparatus\r\n"
				+ "New virions are transported to the cell surface in vesicles and released by exocytosis to infect other cells\r\n";
		return text;
	}
	
}
