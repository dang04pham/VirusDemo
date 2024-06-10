package hust.soict.globalict.virusDemo.viruses;

import java.util.ArrayList;

import hust.soict.globalict.virusDemo.virusComponents.AcidNu;
import hust.soict.globalict.virusDemo.virusComponents.Capsid;
import hust.soict.globalict.virusDemo.virusComponents.Envelope;

public class NoroVirus extends NonLipidVirus{
	ArrayList<String> capsidProteins = new ArrayList<String>();
	ArrayList<String> functionProteins = new ArrayList<String>();
	Capsid capsid = new Capsid("icosahedral", capsidProteins, "the icosahedral shape provides stability in various environments, facilitating transmission through contaminated food and water");
	AcidNu acidNu = new AcidNu("RNA", "Single-stranded RNA", "single, positive-sense RNA genome");

	public NoroVirus(String name, String type, Capsid capsid, AcidNu acidNu, boolean isLipidEnveloped, int size,String shape) {
		super(name, type, capsid, acidNu, isLipidEnveloped, size, shape);
	}
	
	public void attach() {
		System.out.println(getName() + " binds to histo-blood group antigens (HBGAs) on the surface of epithelial cells in the gastrointestinal tract");
	}
	
	public void penetrate() {
		System.out.println(getName() + " enters the cell via endocytosis");
	}
	
	public void replicate() {
		System.out.println(getName() + "'s viral RNA-dependent RNA polymerase synthesizes a complementary negative-sense RNA, serving as a template for the production of new positive-sense RNA genomes");
	}
	
	public void assemble() {
		System.out.println(getName() + "'s viral proteins and genomes are assembled into virions in the cytoplasm");
	}
	
	public void release() {
		System.out.println("Virions are released from the host cell, often leading to cell death and contributing to the symptoms of gastroenteritis");
	}
	
	public String infectionProcessToString() {
		String text = 
				getName() + " binds to histo-blood group antigens (HBGAs) on the surface of epithelial cells in the gastrointestinal tract\r\n"
				+ getName() + " enters the cell via endocytosis\r\n"
				+ getName() + " release viral RNA into the cytoplasm\r\n"
				+ getName() + "'s viral RNA-dependent RNA polymerase synthesizes a complementary negative-sense RNA, serving as a template for the production of new positive-sense RNA genomes\r\n"
				+ getName() + "'s viral proteins and genomes are assembled into virions in the cytoplasm\r\n"
				+ "Virions are released from the host cell, often leading to cell death and contributing to the symptoms of gastroenteritis\r\n";
		return text;
	}
}
