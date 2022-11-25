package questão_2;

public class HexaObserver extends Observer {
	public HexaObserver(Subject s) {
		this.subject = s;
	}
	
	public void update() {
		super.update();
		System.out.printf("Hexa: %s\n", Integer.toHexString(this.subject.getState()).toUpperCase());
	}

}
