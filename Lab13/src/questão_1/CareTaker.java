package questão_1;
import java.util.ArrayList;

public class CareTaker {
	protected ArrayList<Memento>mementoList;
	
	public CareTaker() {
		this.mementoList = new ArrayList<Memento>();
	}
	
	public void add(Memento memento) {
		this.mementoList.add(memento);
	}
	
	public Memento get(int element) {
		return this.mementoList.get(element);
	}
}
