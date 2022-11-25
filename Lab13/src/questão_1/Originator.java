package questão_1;

public class Originator extends Memento {
	public Originator(float valor) {
		super(valor);
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}

	public Memento saveValor(){
		return new Memento(this.valor);
	}
	
	public void getValor(Memento memento) {
		this.valor = memento.getValor();
	}
}
