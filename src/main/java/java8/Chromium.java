package java8;

public interface Chromium {
	public void launch();

	public default void quit() {
		System.out.println("Quit the Policy...");
	}
}
