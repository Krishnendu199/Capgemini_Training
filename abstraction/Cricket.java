package abstraction;

public class Cricket extends Game {
	@Override
	public void start() {
		System.out.println("Cricket starting");
	}
	public void end() {
		System.out.println("Cricket ending");
	}
}
