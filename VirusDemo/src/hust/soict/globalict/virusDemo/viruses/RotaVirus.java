package hust.soict.globalict.virusDemo.viruses;

import java.util.ArrayList;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;

public class RotaVirus extends NonLipidVirus{
	
	private static ArrayList<String> capsidProteins = new ArrayList<String>();
	private static ArrayList<String> functionProteins = new ArrayList<String>();
	private static Capsid capsid = new Capsid("triple-layered icosahedral", capsidProteins, "the triple-layered capsid provides robustness and protection for the viral genome and enzymes required for replication");
	private static AcidNu acidNu = new AcidNu("RNA", "Double-stranded RNA", "11 segments pf double-stranded RNA");
	
	public RotaVirus(String name, String type, Capsid capsid, AcidNu acidNu, boolean isLipidEnveloped, int size, String shape) {
		super(name, type, capsid, acidNu, isLipidEnveloped, size, shape);
		capsidProteins.add("VP7 glycoproteins");// outer layer
		capsidProteins.add("VP4 spike proteins");//outer layer
		capsidProteins.add("VP6 proteins");//middle layer
		capsidProteins.add("VP2 proteins");//inner layer
	}
	
	

	public static void main(String[] args) {
		
	}
}
