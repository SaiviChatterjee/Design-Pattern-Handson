import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		ILeaveRequestHandler supervisor = new Supervisor();
		ILeaveRequestHandler projectmanager = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		
		supervisor.setNextHandler(projectmanager);
		projectmanager.setNextHandler(hr);
		
		LeaveRequest request = new LeaveRequest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		request.setEmployee(sc.nextLine());
		System.out.println("Enter Number of leave days:");
		request.setLeaveDays(sc.nextInt());
		
		supervisor.handleRequest(request);

		sc.close();
	}

}
