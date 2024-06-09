package hust.soict.globalict.virusDemo.viruses;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;

public abstract class LipidVirus extends Virus {
	protected Envelope envelope;
	
	public LipidVirus(String name, String type, Capsid capsid, AcidNu acidNu, Envelope envelope, boolean isLipidEnveloped, int size, String shape) {
		super(name, type, capsid, acidNu, isLipidEnveloped, size, shape);
		this.envelope = envelope;
	}
	
	public Envelope getEnvelope() {
		return envelope;
	}
	
	public void showStructure() {
		System.out.println(getName() + "'s structure: ");
		System.out.println("TYPE: " + getType());
		getAcidNu().displayAcidNu();
		getCapsid().displayCapsid();
		getEnvelope().displayEnvelope();
		System.out.println("SIZE: " + getSize());	
	}
	
	public String showStructureToString() {
		String str;
		return str;
	}
}
