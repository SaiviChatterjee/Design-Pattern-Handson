
public class BasicUser implements IUser {

	ChatMediator mediator = new ChatMediator();
	String name;
	
	public BasicUser(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String message) {
		System.out.println(this.name +" Received: "+message);

	}

	@Override
	public void SendMessage(String message) {
		System.out.println(this.name +" Sent: "+message);
		mediator.sendMessage(this, message);

	}

}
