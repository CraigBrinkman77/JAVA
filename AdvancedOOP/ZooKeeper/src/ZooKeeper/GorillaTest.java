package ZooKeeper;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla fred = new Gorilla();
		
		fred.throwSomething();
		fred.throwSomething();
		fred.throwSomething();
		
		fred.eatBananas();
		fred.eatBananas();
		
		fred.climb();
		
		System.out.println(fred.getEnergyLevel());
	}

}
