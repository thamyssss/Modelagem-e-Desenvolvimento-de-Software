package questão_2;

public class GofObserver {
	public static void main(String args[]) {
		Subject sub;
		
		sub = new Subject();
		int value = 15;
		
		System.out.printf("Primeiro valor = %d\n", value);
		sub.setState(value);
		sub.attach(new BinaryObserver(sub));
		sub.attach(new HexaObserver(sub));
		sub.attach(new OctalObserver(sub));
		sub.notifyAllObservers();
		
		sub = new Subject();
		value = 10;
		
		System.out.printf("Segundo valor = %d\n", value);
		sub.setState(value);
		sub.attach(new BinaryObserver(sub));
		sub.attach(new HexaObserver(sub));
		sub.attach(new OctalObserver(sub));
		sub.notifyAllObservers();
	}
}
