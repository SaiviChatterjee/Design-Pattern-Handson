
public class ProjectManager implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler;
	@Override
	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;

	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<5) {
			System.out.println(request + " handled by Project Manager");
		}
		else {
			this.nextHandler.handleRequest(request);
		}

	}

}
