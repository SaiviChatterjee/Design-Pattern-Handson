
public class Client {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediator();
		
		IUser user1 = new BasicUser(mediator, "Swaralipi");
		IUser user2 = new BasicUser(mediator, "Puja");
		IUser user3 = new PremiumUser(mediator, "Saivi");
		IUser user4 = new PremiumUser(mediator, "Sejal");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.SendMessage("Good Morning");

	}

}
