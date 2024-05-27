package hust.soict.globalict.virusDemo.viruses;

public abstract class LipidVirus {
	protected String envelope;
	protected String genetics;
	protected String infectionProcess1, infectionProcess2, infectionProcess3; 
	
	public LipidVirus() {
		// TODO Auto-generated constructor stub
	}
	
	String getEnvelope() {
		return envelope;
	}
	
	String getGenetics() {
		return genetics;
	}
	
	String getInfectionProcess1() {
		return infectionProcess1;
	}

	String getInfectionProcess2() {
		return infectionProcess2;
	}

	String getInfectionProcess3() {
		return infectionProcess3;
	}

}
