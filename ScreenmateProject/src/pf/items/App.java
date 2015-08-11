package pf.items;

public class App {

	public static void main(String[] args) {
		Arena arena = new Arena();
		
		System.out.println(arena.getFighters().get(0).getPosture().getImagePath());
		
		arena.engage();
	}
}