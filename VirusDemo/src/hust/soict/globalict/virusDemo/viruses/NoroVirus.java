package hust.soict.globalict.virusDemo.viruses;

public class NoroVirus extends NonLipidVirus{
	
	String structureInfo[] = {
			"1. Capsid:\r\n"
			+ "-Protein Shell: Norovirus is non-enveloped, meaning it lacks a lipid bilayer. Instead, it is encapsulated by a protein shell known as the capsid.\r\n"
			+ "-T=3 Icosahedral Symmetry: The capsid has a characteristic icosahedral shape, composed of 180 copies of a single capsid protein arranged in a T=3 symmetry.",
			"2. Genome:\r\n"
			+ "-Single-Stranded RNA (ssRNA): Norovirus contains a single-stranded, positive-sense RNA genome. This RNA molecule carries the genetic information necessary for viral replication and protein synthesis.",
			"3. Proteins:\r\n"
			+ "-Structural Proteins: The capsid is primarily composed of a single viral protein called VP1. This protein forms the outer shell of the virus and interacts with host cells during infection.\r\n"
			+ "-Non-structural Proteins: Norovirus also encodes non-structural proteins involved in viral replication and assembly.",
			"4. Attachment Proteins:\r\n"
			+ "-Ligands: Norovirus has specific ligands on its capsid surface that facilitate attachment to host cells. These interactions are crucial for initiating the infection process.",
			"5. Antigenic Diversity:\r\n"
			+ "-Genetic Variability: Norovirus exhibits high genetic diversity, with multiple genotypes and variants circulating in different populations and geographic regions. This diversity contributes to the virus's ability to evade host immunity and cause repeated infections.",
			"6. Stability:\r\n"
			+ "-Environmental Stability: Norovirus is known for its remarkable stability in the environment, resisting various physical and chemical agents. This stability contributes to its ability to survive and spread through contaminated surfaces and food."
	};
	
	String infectionProcessInfo[] = {
			"1. Entry into the Body\r\n"
			+ "-Ingestion: Norovirus enters the body primarily through the consumption of contaminated food or water, or by direct contact with contaminated surfaces or objects.\r\n"
			+ "-Attachment to Intestinal Cells: Once ingested, Norovirus particles travel to the gastrointestinal tract, where they attach to specific receptors on the surface of intestinal epithelial cells.",
			"2. Viral Entry\r\n"
			+ "-Penetration into Cells: Norovirus gains entry into host cells, possibly through receptor-mediated endocytosis or other mechanisms that are not fully understood.\r\n"
			+ "-Release of Viral RNA: After entry, the viral RNA is released into the cytoplasm of host cells.",
			"3. Replication\r\n"
			+ "-Translation and Protein Synthesis: The viral RNA serves as a template for the translation of viral proteins by host cell machinery. This includes both structural proteins (such as capsid proteins) and non-structural proteins (involved in replication).\r\n"
			+ "-Replication of Viral RNA: The viral RNA replicates within the host cell, producing multiple copies of the viral genome.",
			"4. Assembly\r\n"
			+ "-Formation of Viral Particles: Newly synthesized viral RNA and structural proteins assemble to form new viral particles within the host cell.",
			"5. Release\r\n"
			+ "-Exocytosis: Mature viral particles are released from the host cell through exocytosis, where they are enclosed in vesicles and transported to the cell membrane.\r\n"
			+ "-Shedding: Infected cells shed viral particles into the intestinal lumen, where they can contaminate the environment and spread to other individuals.",
	};
	
	public NoroVirus() {
		super("Noro Virus", "RNA", 40);
		
	}
	
	public void showStructure() {
		System.out.println("VIRUS STRUCTURE:");
		for(int i = 0; i < structureInfo.length; i++) {
			System.out.println(structureInfo[i]);
		}
		System.out.println("-------------------------");
	}
	
	public void showInfectionProcess() {
		System.out.println("INFECTION PROCESS:");
		for(int i = 0; i < infectionProcessInfo.length; i++) {
			System.out.println(infectionProcessInfo[i]);
		}
		System.out.println("-------------------------");
	}
	
//	public static void main(String[] args) {
//		NoroVirus v = new NoroVirus();
//		v.showStructure();
//		v.showInfectionProcess();
//	}
}
