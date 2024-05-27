package hust.soict.globalict.virusDemo.viruses;

public class CovidVirus extends LipidVirus{

	private String envelopeInfo = "Envelope: Like many other viruses, SARS-CoV-2 is enveloped by a lipid bilayer derived from the host cell membrane. "
			+ "Embedded within this envelope are spike (S) glycoproteins, membrane (M) glycoproteins, and envelope (E) proteins. The spike proteins give the virus its distinctive crown-like appearance under electron microscopes and play a crucial role in viral entry into host cells by binding to the ACE2 receptor on the surface of human cells.";
	
	private String GenMatInfo = "The virus's genetic material, a single-stranded RNA, encodes various proteins necessary for replication and infection.";
		
	private String infectionProcessInfo1 = "Attachment and Entry\r\n"
			+ "Spike protein binds to ACE2 receptor\r\n"
			+ "Fusion of viral envelope with host cell membrane\r\n"
			+ "Release of viral RNA into host cell cytoplasm";
	
	private String infectionProcessInfo2 = "Translation, Replication and Protein Synthesis\r\n"
			+ "Translation of ORF1a and ORF1b into polyproteins\r\n"
			+ "Cleavage into nonstructural proteins\r\n"
			+ "Formation of replication-transcription complex (RTC)\r\n"
			+ "Synthesis of negative-sense RNA\r\n"
			+ "Production of new positive-sense RNA genomes and subgenomic RNAs\r\n"
			+ "Translation of structural and accessory proteins";
	
	private String infectionProcessInfo3 = "Assembly and Release\r\n"
			+ "- Assembly of virions in the ERGIC\r\n"
			+ "- Budding into vesicles\r\n"
			+ "- Release of new virions via exocytosis";
	
	public CovidVirus() {
		super();
		
		envelope = envelopeInfo;
		
		genetics = GenMatInfo;
		
		infectionProcess1 = infectionProcessInfo1;
		
		infectionProcess2 = infectionProcessInfo2;
		
		infectionProcess3 = infectionProcessInfo3;
	}
}
