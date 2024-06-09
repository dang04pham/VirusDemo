package hust.soict.globalict.virusDemo.virusComponents;

public class AcidNu {
	
	String type;
	String structure;
	String genome;
	
	public AcidNu(String type, String structure, String genome) {
		this.type = type;
		this.structure = structure;
		this.genome = genome;
	}

	public String getType() {
		return type;
	}

	public String getStructure() {
		return structure;
	}

	public String getGenome() {
		return genome;
	}
	
	public void displayAcidNu() {
		System.out.println("ACID NUCLEIC: ");
		System.out.println("\tType: " + type);
		System.out.println("\tStructure: " + structure);
		System.out.println("\tGenome: " + genome);
	}

	@Override
	public String toString() {
		return "AcidNu [type=" + type + ", structure=" + structure + ", genome=" + genome + "]";
	}
}
