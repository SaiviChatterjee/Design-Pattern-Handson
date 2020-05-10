
public interface ILeaveRequestHandler {

	public ILeaveRequestHandler nextHandler = null;
	public void setNextHandler(ILeaveRequestHandler nextHandler);
	public void handleRequest(LeaveRequest request);
	
}
