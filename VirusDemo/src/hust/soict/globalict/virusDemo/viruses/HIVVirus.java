package hust.soict.globalict.virusDemo.viruses;

public class HIVVirus extends LipidVirus {
	
	String structureInfo[] = {
			"1. Envelope\r\n"
			+ "-Lipid Bilayer: HIV is enveloped by a lipid bilayer derived from the host cell membrane.\r\n"
			+ "-Glycoproteins: Embedded in the lipid bilayer are glycoproteins, including gp120 and gp41. These glycoproteins play a crucial role in viral entry into host cells by binding to specific receptors on the surface of target cells.",
			"2. Capsid\r\n"
			+ "-Protein Shell: Inside the viral envelope is a protein shell called the capsid.\r\n"
			+ "-Capsid Proteins (p24): The capsid is composed of repeating units of a viral protein called p24, which encapsulates the viral RNA genome.",
			"3. RNA Genome\r\n"
			+ "-Single-Stranded RNA (ssRNA): HIV contains a single-stranded, positive-sense RNA genome. This RNA molecule carries the genetic information necessary for viral replication and protein synthesis.",
			"4. Reverse Transcriptase\r\n"
			+ "-Enzyme: HIV carries an enzyme called reverse transcriptase, which converts the viral RNA genome into double-stranded DNA (dsDNA) once inside the host cell. This process is essential for integrating the viral genome into the host cell's DNA.",
			"5. Integrase\r\n"
			+ "-Enzyme: After reverse transcription, another viral enzyme called integrase facilitates the integration of the viral DNA into the host cell's genome. Integration allows the viral genome to be replicated along with the host cell's DNA during cell division.",
			"6. Protease\r\n"
			+ "-Enzyme: HIV also encodes a protease enzyme, which is essential for the processing and maturation of viral proteins during viral assembly. Protease cleaves newly synthesized viral polyproteins into individual functional proteins, allowing the virus to become infectious.",
			"7. Accessory Proteins\r\n"
			+ "-Regulatory Proteins: HIV encodes various accessory and regulatory proteins, including Tat, Rev, Nef, Vif, Vpr, and Vpu. These proteins play diverse roles in viral replication, evasion of host immune responses, and modulation of host cell function.",
	};
		
	String infectionProcessInfo[] = {
			"1. Entry into the Body\r\n"
			+ "-Mucosal Transmission: HIV primarily enters the body through mucosal surfaces, such as the genital or rectal mucosa, during sexual contact. It can also enter through exposure to contaminated blood or from mother to child during childbirth or breastfeeding.",
			"2. Attachment and Entry\r\n"
			+ "-Binding to CD4 Receptors: HIV initially binds to CD4 receptors, which are predominantly found on the surface of certain immune cells, such as CD4+ T lymphocytes, macrophages, and dendritic cells.\r\n"
			+ "-Co-receptor Binding: Following CD4 binding, the viral glycoprotein gp120 interacts with co-receptors on the host cell surface, primarily CCR5 or CXCR4.\r\n"
			+ "-Membrane Fusion: This interaction triggers conformational changes in the viral envelope glycoprotein gp41, leading to the fusion of the viral envelope with the host cell membrane and the release of viral contents into the host cell cytoplasm.",
			"3. Reverse Transcription\r\n"
			+ "-Conversion to DNA: Once inside the host cell, the HIV RNA genome is reverse transcribed into double-stranded DNA (dsDNA) by the viral enzyme reverse transcriptase.\r\n"
			+ "-Integration: The newly synthesized viral DNA is then transported into the host cell nucleus, where it integrates into the host cell genome with the help of another viral enzyme called integrase. This integrated viral DNA is referred to as a provirus.",
			"4. Transcription and Translation\r\n"
			+ "-Transcription: The integrated proviral DNA serves as a template for the transcription of viral RNA by the host cell RNA polymerase.\r\n"
			+ "-Translation: Viral RNA is translated into viral proteins by the host cell ribosomes. These proteins include structural proteins (e.g., Gag, Pol, Env) and regulatory/accessory proteins (e.g., Tat, Rev, Nef).",
			"5. Assembly and Budding\r\n"
			+ "-Viral Protein Synthesis: Newly synthesized viral proteins are transported to the host cell membrane and to the cytoplasm, where they assemble into new viral particles.\r\n"
			+ "-Budding: Viral particles bud from the host cell membrane, acquiring an envelope derived from the host cell membrane studded with viral glycoproteins.",
			"6. Maturation and Release\r\n"
			+ "-Proteolytic Cleavage: Newly formed viral particles undergo proteolytic cleavage by the viral enzyme protease, resulting in the maturation of viral proteins and the formation of infectious virions.\r\n"
			+ "-Release: Mature virions are released from the infected host cell and can infect neighboring CD4+ T cells, macrophages, or dendritic cells, continuing the cycle of infection."
    };
	
	public HIVVirus() {
		super("HIV", "RNA", 100);
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
	
	public String getInfectionSteps(int i) {
		return infectionProcessInfo[i];
	}

//	public static void main(String[] args) {
//		HIVVirus v = new HIVVirus();
//		v.showStructure();
//		v.showInfectionProcess();
//	}
}
