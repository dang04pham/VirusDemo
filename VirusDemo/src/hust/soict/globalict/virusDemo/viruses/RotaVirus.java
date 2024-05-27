package hust.soict.globalict.virusDemo.viruses;

public class RotaVirus extends NonLipidVirus{
	
	private String capsidInfo = "Outer Layer: Composed mainly of two proteins, VP4 and VP7.\r\n"
			+ "VP4 (Spike Protein): Responsible for the attachment and penetration of the host cell. It is the primary target for neutralizing antibodies.\r\n"
			+ "VP7 (Glycoprotein): Forms the outer layer and also plays a role in cell entry and immunity.\r\n"
			+ "Middle Layer: Made of the protein VP6, which is the most abundant and immunodominant protein.\r\n"
			+ "VP6: It forms the inner shell and is critical for the structural integrity of the virus. This protein is commonly used in diagnostic tests due to its abundance and stability.\r\n"
			+ "Inner Layer: Consists of the protein VP2.\r\n"
			+ "VP2: Encases the viral RNA and the transcription enzymes, forming a protective layer around the core."; 
	
	private String genomeInfo = "Genomic RNA: The rotavirus genome is composed of 11 segments of double-stranded RNA (dsRNA). Each segment encodes one or more viral proteins.\r\n"
			+ "VP1 and VP3: Enzymes involved in the replication and transcription of the viral RNA.\r\n"
			+ "VP1: An RNA-dependent RNA polymerase that synthesizes the viral RNA.\r\n"
			+ "VP3: A guanylyltransferase, which is involved in capping the viral mRNA, a critical step for mRNA stability and translation in host cells.";
	
	private String infectionProcessInfo1 = "Attachment, Entry, and Uncoating\r\n"
			+ "Binding to Host Cells: Rotavirus primarily targets mature enterocytes in the small intestine. The outer capsid protein VP4 facilitates initial attachment by binding to specific receptors on the host cell surface, such as sialic acid-containing glycoproteins and integrins.\r\n"
			+ "Cleavage of VP4: Proteolytic cleavage of VP4 by trypsin (a digestive enzyme) in the gut enhances its ability to mediate viral entry. This cleavage produces two fragments, VP5* and VP8*, which play crucial roles in attachment and penetration.\r\n"
			+ "Cell Entry: The virus can enter the host cell either through direct penetration or by endocytosis. In endocytosis, the virus is engulfed by the cell membrane and taken into an endosome."
			+ "Removal of Outer Layer: Once inside the host cell, the outer layer of the rotavirus capsid, composed of VP4 and VP7, is removed. This uncoating process exposes the double-layered particle (DLP), which consists of VP2 and VP6 and contains the viral genome.";

	
	private String infectionProcessInfo2 = "Transcription, Translation, Replication and Viroplasm Formation\r\n"
			+ "Transcription of Viral RNA: Inside the DLP, the viral RNA-dependent RNA polymerase (VP1) transcribes the double-stranded RNA (dsRNA) genome segments into messenger RNA (mRNA). This transcription occurs within the confines of the DLP to protect the viral RNA from host cell defenses.\r\n"
			+ "Translation of Viral Proteins: The viral mRNAs are released into the cytoplasm, where they are translated by the host cell's ribosomes into viral proteins. These include structural proteins (VP1-VP7) and non-structural proteins (NSP1-NSP5, and NSP6)."
			+ "Replication of Viral RNA: Viral replication occurs in cytoplasmic structures called viroplasms, which are formed by the accumulation of non-structural proteins (NSP2 and NSP5) and other viral components.\r\n"
			+ "Assembly of New Virions: Within the viroplasms, newly synthesized viral RNA segments are packaged into new DLPs. The DLPs are then coated with VP6.";
	
	private String infectionProcessInfo3 = "Maturation and Release\r\n"
			+ "Outer Capsid Assembly: The DLPs acquire the outer capsid proteins VP4 and VP7 as they mature. This occurs in the endoplasmic reticulum (ER), where VP7 is glycosylated.\r\n"
			+ "Release of Progeny Virions: Mature, triple-layered virions are released from the host cell either by cell lysis or through a non-lytic pathway involving vesicle transport. These new virions can then infect neighboring cells or be shed into the environment through feces.";

	
	public RotaVirus() {
		super();
		
		capsid = capsidInfo;
		
		genome = genomeInfo;
		
		infectionProcess1 = infectionProcessInfo1;
		
		infectionProcess2 = infectionProcessInfo2;
		
		infectionProcess3 = infectionProcessInfo3;
	}
	
}
