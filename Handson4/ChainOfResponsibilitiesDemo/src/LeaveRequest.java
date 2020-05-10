
public class LeaveRequest {

	private String employee;
	private int leaveDays;
	
	public LeaveRequest() {
		
	}

	public LeaveRequest(String employee, int leaveDays) {
		this.employee = employee;
		this.leaveDays = leaveDays;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	@Override
	public String toString() {
		return "LeaveRequest [employee=" + employee + ", leaveDays=" + leaveDays + "]";
	}
	
	
	
}
