import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bully {

	public int processId;
	public ArrayList<Integer> list = null;
	public String status;
	
	public Bully(int id, ArrayList<Integer> processList) {
		// TODO Auto-generated constructor stub
		processId = id;
		list = processList;
		status = "active";
	}
	
	public int getProcessId() {
		return processId;
	}

	public void setProcessId(int processId) {
		this.processId = processId;
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Bully [processId=" + processId + ", list=" + list + ", status=" + status + "]";
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bully> process = new ArrayList<>();
		char ans = 'y';
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		for (int i = 1; i <= 6; i++) {
			process.add(new Bully(i, list));
		}
		System.out.println("Processes: " + process.toString());
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Menu");
			System.out.println("1.Held an Election");
			System.out.println("2.Up a process");
			System.out.println("3.Down a process");
			System.out.println("4.Exit");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Election in process");
				System.out.println("Which process should held the election");
				int ec = sc.nextInt();

				election(ec);

				break;
			case 2:
				System.out.println("Which process is to up??");
				int pro_no = sc.nextInt();

				upProcess(pro_no);

				break;
			case 3:
				System.out.println("Which process to be down??");
				int pro_no1 = sc.nextInt();

				downProcess(pro_no1);

				break;
			case 4:
				break;

			default:
				break;
			}
			
			System.out.println("Do you wish o cont..(y/n)??");
			ans = sc.next().charAt(0);
			
		} while (ans=='y' || ans=='Y');
		
		
		
		

	}


	private static void upProcess(int pro_no) {
		// TODO Auto-generated method stub
		
	}

	private static void downProcess(int pro_no1) {
		// TODO Auto-generated method stub
		
	}

	private static void election(int ec) {
		// TODO Auto-generated method stub
		
	}

	

}
