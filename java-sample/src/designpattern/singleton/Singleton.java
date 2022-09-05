package designpattern.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("Created singleton instance.");
	}
	public static Singleton getInstance() {
		return singleton;
	}

}
