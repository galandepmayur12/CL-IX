import java.util.ArrayList;
import java.util.Arrays;

public class Ring {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> processList = new ArrayList<>(Arrays.asList(7,3,9,4,8));
		
		int leader = sendElectionMsg(2, processList);
		sendCoordinatorMsg(leader, processList);

	}

	
	static int sendElectionMsg(Integer integer, ArrayList<Integer> processList) {
		// TODO Auto-generated method stub
		
		int leader = processList.get(integer);
		int noOfPro = processList.size();
		ArrayList<Integer> possibleLead = new ArrayList<>();
		
		for (int i = 1; i <= noOfPro ; i++) {
			if (i==1) {
				System.out.println("Process " + processList.get((i+integer-1)%noOfPro) + " is now leader and sends an election msg to " + processList.get((i+integer)%noOfPro));
			}
			if (leader < processList.get((i+integer)%noOfPro)) {
//				System.out.println("hi");
				leader = processList.get((i+integer)%noOfPro);
				possibleLead.add(leader);
				System.out.println("Process " + processList.get((i+integer)%noOfPro) + " is now leader and sends an Election msg to " +  processList.get((i+integer+1)%noOfPro));
			} else if (integer == (i+integer)%noOfPro) {
//				System.out.println("Process " + processList.get((i+integer-1)%noOfPro) + " is now leader and sends an election msg to " + processList.get((i+integer)%noOfPro));
				System.out.println("Leader is: " + leader);			
			} else  {
				System.out.println("Process " + processList.get((i+integer)%noOfPro) +  " cannot be a leader and hence passess election msg to" + processList.get((i+integer+1)%noOfPro));
			}
		}
		
		
		return leader;
		
	}


	private static void sendCoordinatorMsg(int leader, ArrayList<Integer> processList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < processList.size(); i++) {
			if (leader != processList.get(i)) {
				System.out.println("Process " + leader + " sends an Coordinator msg to " + processList.get(i) );
			}
			
		}
		
	}

}
