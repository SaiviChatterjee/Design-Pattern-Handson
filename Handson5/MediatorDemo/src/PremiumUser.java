
public class PremiumUser implements IUser {

	ChatMediator mediator = new ChatMediator();
	String name;
	
	public PremiumUser(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String message) {
		System.out.println(this.name +" Received(Premium): "+message);

	}

	@Override
	public void SendMessage(String message) {
		System.out.println(this.name +" Sent(Preminum): "+message);
		mediator.sendMessage(this, message);

	}

}
