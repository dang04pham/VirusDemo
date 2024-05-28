package hust.soict.globalict.virusDemo.viruses;

public class CovidVirus extends LipidVirus{

	String structureInfo[] = {"1. Spike Protein (S): Facilitates entry into host cells.\n",
            "2. Envelope Protein (E): Involved in virus assembly and release.\n",
            "3. Membrane Protein (M): Gives the virus its shape and helps in virus assembly.\n",
            "4. Nucleocapsid Protein (N): Binds to the RNA genome and helps in replication.\n"
    };
	
	String infectionProcessInfo[] = {
            "COVID-19 Infection Process:\n\n1. Virus Entry: The spike protein binds to ACE2 receptors.",
            "2. RNA Release: Viral RNA is released into the host cell.",
            "3. Translation: Viral proteins are produced.",
            "4. Replication: New viral RNA is synthesized.",
            "5. Assembly: New virions are assembled and released."
	};
	
	public CovidVirus() {
		super();
		
		structure = structureInfo;
		
		infectionProcess = infectionProcessInfo;
	}
}
