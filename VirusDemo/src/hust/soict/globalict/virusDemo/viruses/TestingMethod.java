package hust.soict.globalict.virusDemo.viruses;

public class TestingMethod {

	public static void main(String[] args) {
		RotaVirus rotavirus = new RotaVirus();
		System.out.println(rotavirus.getCapsid());
		System.out.println(rotavirus.getGenome());
		System.out.println(rotavirus.getInfectionProcess1());
		
		System.out.println(rotavirus.getInfectionProcess2());
		System.out.println(rotavirus.getInfectionProcess3());
	}

}
