package hust.soict.globalict.virusDemo.viruses;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;

public abstract class NonLipidVirus extends Virus {
	
	public NonLipidVirus(String name, String type, Capsid capsid, AcidNu acidNu, boolean isLipidEnveloped, int size, String shape) {
		super(name, type, capsid, acidNu, isLipidEnveloped, size, shape);
	}
	
	public void showStructure() {
		System.out.println(getName() + "'s structure: ");
		System.out.println("TYPE: " + getType());
		getAcidNu().displayAcidNu();
		getCapsid().displayCapsid();
		System.out.println("SIZE: " + getSize());	
	}
	
	public String structureToString() {
		String text = 
				  "TYPE:" + getType() + "\r\n"
				+ "ACID NUCLEIC: \r\n"
				+ "	Type: " + acidNu.getType() + "\r\n"
				+ "	Structure: " + acidNu.getStructure() + "\r\n"
				+ "	Genome: " + acidNu.getGenome() + "\r\n"
				+ "CAPSID: \r\n"
				+ "	Shape: " + capsid.getShape() + "\r\n"
				+ "	Comprises of: " + capsid.getProteins() + "\r\n"
				+ "	Key features:" + capsid.getFeatures() + "\r\n"
				+ "SIZE: " + getSize();
		return text;
	}
}
