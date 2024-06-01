package hust.soict.globalict.virusDemo.viruses;

public abstract class LipidVirus {
	protected String name;
	protected String geneticMaterial;
	protected boolean isLipid;
	protected double size;
	
	public LipidVirus(String name, String geneticMaterial, double size) {
		this.name = name;
		this.geneticMaterial = geneticMaterial;
		this.isLipid = true;
		this.size = size;
	}
	
	public void showInfectionProcess() {
		
	}
	
	public String getName() {
        return name;
    }

    public String getGeneticMaterial() {
        return geneticMaterial;
    }

    public double getSize() {
        return size;
    }
    
    public boolean isLipidEnveloped() {
    	return true;
    }
}
