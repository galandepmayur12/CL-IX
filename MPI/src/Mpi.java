

import mpi.MPI;

public class Mpi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MPI.Init(args);
		
		int rank = MPI.COMM_WORLD.Rank();
		
		System.out.println("This is a prcoess with rank:" + rank);
		if (rank == 1) {
//			String str = "2,3";
			int op[] = new int[2];
			op[0]=2;
			int result[] = new int[2];
			MPI.COMM_WORLD.Send(op, 0, 1, MPI.INT, 0, MPI.ANY_SOURCE);
			
			MPI.COMM_WORLD.Recv(result, 0, 1, MPI.INT, 0, MPI.ANY_SOURCE);
			
			System.out.println("I'm server with rank " + MPI.COMM_WORLD.Rank() + " and result is: " + result[0]);
		} else {
			String str = "";
			int op[]= new int[2];
			MPI.COMM_WORLD.Recv(op, 0, 1, MPI.INT, 1, MPI.ANY_SOURCE);
//			int a = Operation(str);
			int a[] = new int[2];
			a[0] = 6;
			a[0]+=op[0];
			MPI.COMM_WORLD.Send(a, 0, 1, MPI.INT, 1, MPI.ANY_SOURCE);
			
		}
		
		MPI.Finalize();

	}

	private static int Operation(String str) {
		// TODO Auto-generated method stub
		String arr[] = str.split(",");
		int result = 0;
		for (String string : arr) {
			result += Integer.parseInt(string);
		}
		
		return result;
	}

}
