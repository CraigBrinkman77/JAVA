package ZooKeeper;

public class BatTest {

	public static void main(String[] args) {
		Bat fred = new Bat();
		
		fred.attackTown();
		fred.attackTown();
		fred.attackTown();
		
		fred.eatHumans();
		fred.eatHumans();
		
		fred.fly();
		fred.fly();
		
		System.out.println(fred.getEnergyLevel());
		
	}

}
