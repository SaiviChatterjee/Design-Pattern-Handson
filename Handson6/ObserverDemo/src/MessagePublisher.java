import java.util.*;

public class MessagePublisher implements Subject {

	private State state;
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) { 
		observers.remove(o); 
	} 
	
	@Override public void notifyUpdate(Message m) { 
		for(Observer o: observers) { 
			o.update(m); 
		} 
	}

	@Override
	public void changeState(Message m) {
		if(this.getState().getState() == true) {
			this.setState(new State(false));
			notifyUpdate(m);
		}
		else {
			this.setState(new State(true));
			notifyUpdate(m);
		}
		
	}

	public MessagePublisher() {
		this.state=new State(true);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}


 
}
