package questão_1;

public class TesteMemento {
	public static void main(String args[]) {
		CareTaker careTaker = new CareTaker();
		int counter = 0;
		
	careTaker.add(new Originator(100.0f)); counter++;
	careTaker.add(new Originator(200.0f)); counter++;
	careTaker.add(new Originator(300.0f)); counter++;
	careTaker.add(new Originator(400.0f)); counter++;
	
	System.out.printf("valor corrente: %f\n", careTaker.get(counter-1).getValor());
	
	while(counter>0) {
		counter--;
		System.out.printf("%d-Valor Salvo: %f\n", counter, careTaker.get(counter).getValor());
		
		}
	
	}

}
