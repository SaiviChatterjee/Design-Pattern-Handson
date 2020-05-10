
public interface Subject {
	
	State state = null;
	
	public void changeState(Message m);
	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyUpdate(Message m);
}
