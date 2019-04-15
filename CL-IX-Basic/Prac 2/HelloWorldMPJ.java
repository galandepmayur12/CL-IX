import mpi.MPI;

public class HelloWorldMPJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MPI.Init(args);
		int rank = MPI.COMM_WORLD.Rank();
		int size = MPI.COMM_WORLD.Size();
		System.out.println("I am process <"+ rank + "> of total <" + size + "> processes." );
		MPI.Finalize();
	}

}
