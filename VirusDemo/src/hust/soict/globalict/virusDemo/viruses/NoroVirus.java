package hust.soict.globalict.virusDemo.viruses;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;

public class NoroVirus extends NonLipidVirus{

	public NoroVirus(String name, String type, Capsid capsid, AcidNu acidNu, boolean isLipidEnveloped, int size,String shape) {
		super(name, type, capsid, acidNu, isLipidEnveloped, size, shape);
	}
	
	
//	public static void main(String[] args) {
//		NoroVirus v = new NoroVirus();
//		v.showStructure();
//		v.showInfectionProcess();
//	}
}
