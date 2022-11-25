package questão_2;

public class BinaryObserver extends Observer{
	public BinaryObserver(Subject s) {
		this.subject = s;
	}
	
	public void update() {
		super.update();
		System.out.printf("Binario: %s\n", Integer.toBinaryString(this.subject.getState()));
	}

}
