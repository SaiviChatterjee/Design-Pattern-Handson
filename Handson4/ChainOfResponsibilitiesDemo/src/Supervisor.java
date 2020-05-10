
public class Supervisor implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler;
	@Override
	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;

	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<3) {
			System.out.println(request + " handled by Supervisor");
		}
		else {
			this.nextHandler.handleRequest(request);
		}

	}

}
