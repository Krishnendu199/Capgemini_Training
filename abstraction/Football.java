package abstraction;

public class Football extends Game {
	@Override
	public void start() {
		System.out.println("Football starting");
	}
	public void end() {
		System.out.println("Football ending");
	}
}
