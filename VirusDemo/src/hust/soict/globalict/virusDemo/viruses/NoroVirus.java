package hust.soict.globalict.virusDemo.viruses;

public class NoroVirus extends NonLipidVirus{
	
	private String capsidInfo = "Norovirus has a non-enveloped capsid, meaning it lacks a lipid envelope.\r\n"
			+ "The capsid is icosahedral in shape and is composed of a single protein called VP1.\r\n"
			+ "The capsid protects the viral RNA genome and plays a crucial role in viral attachment and entry into host cells.\r\n";
	private String genomeInfo = "Norovirus has a single-stranded, positive-sense RNA genome.\r\n"
			+ "The genome is approximately 7.5 to 7.7 kilobases in length and contains three open reading frames (ORFs).\r\n"
			+ "These ORFs encode for various viral proteins involved in replication, translation, and virion assembly.\r\n";
	
	private String infectionProcessInfo1 = " Entry into Host, Attachment and Entry into Cells\r\n"
			+ "Once ingested, the virus travels through the digestive system and reaches the small intestine.\r\n"
			+ "Binding to Receptors: The protruding (P) domain of the VP1 capsid protein binds to specific carbohydrate molecules on the surface of host cells. These carbohydrates are often histo-blood group antigens (HBGAs) present on epithelial cells in the gut.\r\n"
			+ "Cell Entry: The virus then enters the host cell through endocytosis, a process where the cell membrane engulfs the virus particle, forming an endosome.\r\n";
	
	private String infectionProcessInfo2 = "Uncoating and Translation, Replication of Viral RNA\r\n"
			+ "Release of Viral RNA: Inside the host cell, the viral capsid is disassembled, releasing the viral RNA into the cytoplasm.\r\n"
			+ "Translation of Viral Proteins: The positive-sense viral RNA acts directly as mRNA, using the host's ribosomes to translate viral proteins. The first proteins synthesized are non-structural proteins, including the RNA-dependent RNA polymerase (RdRp).\r\n"
			+ "Replication Complex Formation: The non-structural proteins form a replication complex that synthesizes a complementary negative-strand RNA from the original positive-strand RNA.\r\n"
			+ "Production of New RNA Genomes: This negative-strand RNA serves as a template to produce new positive-strand RNA genomes, which will be packaged into new virions.\r\n";

	private String infectionProcessInfo3 = "Assembly and Release of New Virions\r\n"
			+ "Capsid Protein Synthesis: Structural proteins VP1 and VP2 are synthesized in large quantities.\r\n"
			+ "Assembly of Virions: New virions are assembled in the cytoplasm, with VP1 forming the capsid shell and VP2 stabilizing the interaction with the viral RNA.\r\n"
			+ "Cell Lysis or Exocytosis: New virions are released from the host cell either by cell lysis (breaking open the host cell) or through exocytosis (a process where the virions are expelled from the cell in vesicles).\r\n"
			+ "Shedding: Infected individuals shed the virus in their feces. This shedding can continue for weeks after symptoms resolve, contributing to the spread of the virus.\r\n";

	
	public NoroVirus() {
		super();
		capsid = capsidInfo;
		
		genome = genomeInfo;
		
		infectionProcess1 = infectionProcessInfo1;

		infectionProcess2 = infectionProcessInfo2;
				
		infectionProcess3 = infectionProcessInfo3;
	}
	
}
