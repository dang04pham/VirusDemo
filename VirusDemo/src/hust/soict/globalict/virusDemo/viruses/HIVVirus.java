package hust.soict.globalict.virusDemo.viruses;

public class HIVVirus extends LipidVirus {

	
		
	String infectionProcessInfo[] = {
			"HIV Infection Process:\n\n1. Virus Entry: gp120 binds to CD4 receptor and co-receptor.",
            "2. Reverse Transcription: Viral RNA is converted to DNA.",
            "3. Integration: Viral DNA integrates into the host genome (provirus formation).",
            "4. Transcription and Translation: Viral proteins and RNA are produced.",
            "5. Assembly and Budding: New virions are assembled and released."
    };
	
	public HIVVirus() {
		super();
		
		
		infectionProcess = infectionProcessInfo;
	}
}
