import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> user;
	public ChatMediator() {
		this.user = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(IUser user, String message) {
		for(IUser u : this.user) {
			if(u != user) {
				u.ReceiveMessage(message);
			}
		}

	}

	@Override
	public void addUser(IUser user) {
		this.user.add(user);

	}

}
