package hust.soict.globalict.virusDemo.viruses;

public abstract class LipidVirus {
	protected String envelope;
	protected String genetics;
	protected String infectionProcess1, infectionProcess2, infectionProcess3; 
	
	public LipidVirus() {
		// TODO Auto-generated constructor stub
	}
	
	private String getEnvelope() {
		return envelope;
	}
	
	private String getGenetics() {
		return genetics;
	}

}
