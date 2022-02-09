package ZooKeeper;

public class Bat extends Mammal{

	public Bat() {
		super();
		this.energyLevel = 300;
		}
	
	public void fly() {
		System.out.println("EEEEKKKKK");
		this.setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("I hungry for human flesh");
		this.setEnergyLevel(getEnergyLevel() + 25);
		
	}
	
	public void attackTown() {
		System.out.println("*town burning*");
		this.setEnergyLevel(getEnergyLevel() - 100);
	}

	
}

