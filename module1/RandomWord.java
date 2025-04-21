import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

	public static void main(String args []){

		String champion = "";
		int i = 1;

		while(!StdIn.isEmpty()){
			String nextChampion = StdIn.readString();
			double p = 1.0 / i++;
			champion = StdRandom.bernoulli(p) ? nextChampion : champion;			
		}

		StdOut.println(champion);
		
	}
}
