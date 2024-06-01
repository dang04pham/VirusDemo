package hust.soict.globalict.virusDemo.viruses;

public class RotaVirus extends NonLipidVirus{
	
	String structureInfo[] = {
			"1. Capsid\r\n"
			+ "-Protein Shell: Rotavirus is a non-enveloped virus, meaning it lacks a lipid bilayer. Instead, it is encapsulated by a protein shell known as the capsid.\r\n"
			+ "-Triple-Layered Capsid: The capsid of Rotavirus is triple-layered and is composed of three protein layers: inner capsid (VP2), middle capsid (VP6), and outer capsid (VP7 and VP4).",
			"2. Genome\r\n"
			+ "-Double-Stranded RNA (dsRNA): Rotavirus contains a segmented, double-stranded RNA genome. The genome consists of 11 segments, each encoding one or more viral proteins necessary for replication and assembly.",
			"3. Proteins\r\n"
			+ "-VP7 (Glycoprotein): This protein forms the outer layer of the capsid and is involved in host cell attachment and viral entry.\r\n"
			+ "-VP4 (Protease-Cleaved Protein): Also located on the outer layer of the capsid, VP4 is cleaved by proteases to form VP5* and VP8*, which mediate cell attachment and penetration.\r\n"
			+ "-VP6: This protein forms the middle layer of the capsid and contributes to the stability of the viral particle.\r\n"
			+ "-VP2: VP2 is the innermost protein layer of the capsid and provides structural support to the virus.",
			"4. Attachment Proteins\r\n"
			+ "-Ligands: Rotavirus has specific ligands on its capsid surface, including VP4 and VP7, that facilitate attachment to host cell receptors. These interactions are crucial for initiating the infection process.",
			"5. Viral Replication\r\n"
			+ "-Entry and Uncoating: After attachment to host cells, Rotavirus enters the cell by endocytosis. The acidic environment within endosomes triggers the uncoating of the viral particle, releasing the viral RNA into the cytoplasm.\r\n"
			+ "-Replication and Assembly: The viral RNA serves as a template for the synthesis of viral proteins and the replication of the viral genome. New viral particles are assembled within the host cell.",
			"6. Release and Transmission\r\n"
			+ "-Maturation and Release: Mature viral particles are released from the host cell through cell lysis or budding. The newly formed virions are then released into the surrounding environment.\r\n"
			+ "-Transmission: Rotavirus is primarily transmitted through the fecal-oral route, often via contaminated food, water, or surfaces. It can also spread through respiratory droplets and person-to-person contact.",
			"7. Immune Response\r\n"
			+ "-Immune Evasion: Rotavirus has developed various strategies to evade the host immune response, including antigenic variation and modulation of host immune signaling pathways. However, infection can still stimulate the production of neutralizing antibodies and activate immune cells to clear the virus."
	};
	
	String infectionProcessInfo[] = {
			"1. Entry into the Body\r\n"
			+ "-Ingestion: Rotavirus enters the body primarily through the ingestion of contaminated food, water, or objects. It can also be transmitted through respiratory droplets or by contact with contaminated surfaces.\r\n"
			+ "-Attachment to Intestinal Cells: Once ingested, Rotavirus particles travel to the gastrointestinal tract, where they attach to specific receptors on the surface of intestinal epithelial cells.",
			"2. Viral Entry\r\n"
			+ "-Endocytosis: Rotavirus gains entry into host cells through receptor-mediated endocytosis. The attachment proteins on the viral capsid interact with host cell receptors, triggering internalization of the virus into endosomes.",
			"3. Uncoating and Genome Release\r\n"
			+ "-Endosomal Acidification: The acidic environment within the endosomes triggers conformational changes in the viral capsid, leading to the release of the viral RNA into the cytoplasm of the host cell.\r\n"
			+ "-Transcription and Translation: Once released, the viral RNA serves as a template for the synthesis of viral proteins by the host cell machinery. These proteins include enzymes involved in viral replication and structural proteins necessary for assembling new viral particles.",
			"4. Replication and Assembly\r\n"
			+ "-RNA Replication: The viral RNA undergoes replication within the host cell, leading to the synthesis of multiple copies of the viral genome.\r\n"
			+ "-Protein Synthesis: Concurrently, viral proteins are synthesized, including structural proteins such as VP7, VP4, VP6, and VP2.\r\n"
			+ "-Assembly of Viral Particles: Newly synthesized viral RNA and proteins assemble to form mature viral particles within the host cell.",
			"5. Maturation and Release\r\n"
			+ "-Maturation: The assembled viral particles undergo maturation processes, including the cleavage of precursor proteins by viral proteases.\r\n"
			+ "-Release: Mature viral particles are released from the host cell through cell lysis or by budding. The released virions are then able to infect neighboring cells and spread to other parts of the gastrointestinal tract.",
	};
	
	public RotaVirus() {
		super("Rota Virus", "RNA", 70);
	}
	
	public void showStructure() {
		System.out.println("VIRUS STRUCTURE:");
		for(int i = 0; i < structureInfo.length; i++) {
			System.out.println(structureInfo[i]);
		}
		System.out.println("-------------------------");
	}
	
	public void showInfectionProcess() {
		System.out.println("INFECTION PROCESS:\n");
		for(int i = 0; i < infectionProcessInfo.length; i++) {
			System.out.println(infectionProcessInfo[i]);
		}
		System.out.println("-------------------------");
	}
	
//	public static void main(String[] args) {
//		RotaVirus v = new RotaVirus();
//		v.showStructure();
//		v.showInfectionProcess();
//	}
}
