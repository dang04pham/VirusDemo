package hust.soict.globalict.virusDemo.viruses;

public class HIVVirus extends LipidVirus {

	private String envelopeInfo = "HIV is enveloped by a lipid bilayer derived from the host cell membrane.\r\n"
			+ "Embedded in this envelope are viral glycoproteins, particularly gp120 and gp41, which play crucial roles in viral attachment and fusion with host cells.\r\n";
	
	private String GenMatInfo = "HIV carries its genetic information in the form of two identical RNA molecules. These RNA molecules encode the virus's proteins and enzymes necessary for replication."; 
		
	private String infectionProcessInfo1 = "Virus Entry and Reverse Transciption\r\n"
			+ "gp120 binds to CD4 receptor\r\n"
			+ "gp120 binds to co-receptor (CCR5 or CXCR4)\r\n"
			+ "gp41 mediates fusion of viral envelope with host cell membrane\r\n"
			+ "Viral capsid enters host cell\r\n"
			+ "Uncoating of the viral capsid\r\n"
			+ "Reverse transcriptase converts viral RNA into dsDNA";
	
	private String infectionProcessInfo2 = "Integration, Transcription and Translation\r\n"
			+ "   - Transport of viral dsDNA into the nucleus\r\n"
			+ "   - Integrase inserts viral DNA into the host genome (provirus formation)\r\n"
			+ "   - Provirus is transcribed into viral RNA\r\n"
			+ "   - Viral RNA is translated into viral proteins";
	
	private String infectionProcessInfo3 = "Assembly, Budding and Maturation\r\n"
			+ "   - Viral RNA and proteins assemble at the host cell membrane\r\n"
			+ "   - New virions bud off from the host cell\r\n"
			+ "   - Protease cleaves polyproteins, maturing the virions\r\n"
			+ "   - Mature virions become infectious";
	
	public HIVVirus() {
		super();
		
		envelope = envelopeInfo;
		
		genetics = GenMatInfo;
		
		infectionProcess1 = infectionProcessInfo1;
		
		infectionProcess2 = infectionProcessInfo2;
		
		infectionProcess3 = infectionProcessInfo3;
	}
}
