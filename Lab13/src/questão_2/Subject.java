package questão_2;
import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers;
	private int state;
	
	public Subject() {
		this.observers = new ArrayList<Observer>();
	}
	
	public int getState() {return this.state;}
	public void setState(int s) {this.state = s;}
	
	public void attach(Observer ob) {
		this.observers.add(ob);
	}
	
	public void notifyAllObservers() {
		for(Observer obs : this.observers) {
			obs.update();
		}
	}

}
