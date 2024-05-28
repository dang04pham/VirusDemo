package hust.soict.globalict.virusDemo.viruses;

public abstract class NonLipidVirus {
	protected String capsid;
	protected String genome;
	protected String infectionProcess1, infectionProcess2, infectionProcess3; 
	protected boolean isNonLipid;
	
	public NonLipidVirus() {
		isNonLipid = true;
	}
	
	String getCapsid() {
		return capsid;	
	}
	
	String getGenome() {
		return genome;
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
