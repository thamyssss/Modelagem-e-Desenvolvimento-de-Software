package questão_2;

public class OctalObserver extends Observer{
	public OctalObserver(Subject s) {
		this.subject = s;
	}
	
	public void update() {
		super.update();
		System.out.printf("Octal: %s\n", Integer.toOctalString(this.subject.getState()));
	}
	
}
