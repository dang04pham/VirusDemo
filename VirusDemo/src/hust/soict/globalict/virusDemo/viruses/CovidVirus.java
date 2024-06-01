package hust.soict.globalict.virusDemo.viruses;

public class CovidVirus extends LipidVirus{

	String structureInfo[] = {
			"1. Envelope\r\n"
			+ "-Lipid Bilayer: Like many other viruses, SARS-CoV-2 is enveloped by a lipid bilayer derived from the host cell membrane.\r\n"
			+ "-Spike (S) Proteins: Embedded in the lipid bilayer are spike (S) glycoproteins, which give the virus its characteristic crown-like appearance. These spike proteins facilitate attachment to host cells and are the primary target of neutralizing antibodies.",
			"2. Membrane (M) Proteins\r\n"
			+ "-Integral Membrane Proteins: The membrane (M) proteins are embedded within the lipid bilayer and provide structural support to the viral envelope.",
			"3. Envelope (E) Proteins\r\n"
			+ "-Accessory Proteins: Envelope (E) proteins are small membrane proteins that play a role in virus assembly and release.",
			"4. Nucleocapsid\r\n"
			+ "-Protein Shell: Inside the viral envelope is a protein shell called the nucleocapsid.\r\n"
			+ "-Nucleocapsid (N) Proteins: Nucleocapsid proteins encapsulate the viral RNA genome, forming a ribonucleoprotein complex.",
			"5. RNA Genome\r\n"
			+ "-Single-Stranded RNA (ssRNA): SARS-CoV-2 contains a single-stranded, positive-sense RNA genome. This RNA molecule serves as the blueprint for viral replication and protein synthesis.",
			"6. Accessory Proteins\r\n"
			+ "-Non-structural Proteins (Nsps): SARS-CoV-2 encodes multiple non-structural proteins involved in viral replication and evasion of the host immune response. These include proteases, RNA-dependent RNA polymerase, and proteins involved in RNA capping and modification.\r\n"
			+ "-Accessory Proteins: SARS-CoV-2 also encodes accessory proteins that modulate host immune responses and viral pathogenesis. Examples include ORF3a, ORF6, ORF7a, ORF7b, ORF8, and ORF10.",
    };
	
	String infectionProcessInfo[] = {
            "1. Entry into the Body\r\n"
            + "-Respiratory Transmission: SARS-CoV-2 primarily enters the body through respiratory droplets released when an infected person coughs, sneezes, talks, or exhales. These droplets can be inhaled by nearby individuals or deposited onto mucous membranes, such as those lining the mouth, nose, or eyes.",
            "2. Attachment and Entry\r\n"
            + "-Attachment to Host Cells: SARS-CoV-2 uses its spike (S) glycoproteins to bind to angiotensin-converting enzyme 2 (ACE2) receptors on the surface of host cells. This binding facilitates viral entry into the host cell.\r\n"
            + "-Fusion and Endocytosis: Upon binding to ACE2 receptors, SARS-CoV-2 undergoes conformational changes that allow the fusion of the viral envelope with the host cell membrane. The virus can then enter the host cell via direct fusion or endocytosis.",
            "3. Release of Viral RNA\r\n"
            + "-Uncoating: Once inside the host cell, the viral envelope is removed, releasing the viral RNA genome into the cytoplasm.",
            "4. Replication and Transcription\r\n"
            + "-Translation of Viral Proteins: The viral RNA serves as a template for the translation of viral proteins by host cell ribosomes. These proteins include replicase-transcriptase complex enzymes and structural proteins.\r\n"
            + "-Replication of Viral Genome: Viral RNA-dependent RNA polymerase replicates the viral RNA genome, producing multiple copies of the viral RNA.",
            "5. Assembly of New Viral Particles\r\n"
            + "-Formation of Replication-Transcription Complexes (RTCs): Newly synthesized viral RNA and proteins form replication-transcription complexes within the host cell.\r\n"
            + "-Assembly of Viral Components: Viral structural proteins and replicated viral RNA assemble to form new viral particles.",
            "6. Maturation and Release\r\n"
            + "-Maturation: Viral particles undergo maturation processes, including the incorporation of viral proteins into the viral envelope.\r\n"
            + "-Release: Mature viral particles are released from the host cell through exocytosis or cell lysis. These released virions can then infect neighboring cells or be expelled from the body through respiratory secretions, contributing to further transmission of the virus.",
	};
	
	public CovidVirus() {
		super("Sars-COV", "RNA", 140);
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
//		CovidVirus v = new CovidVirus();
//		v.showStructure();
//		v.showInfectionProcess();
//	}
}
