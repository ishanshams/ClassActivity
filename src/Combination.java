import java.util.Iterator;
import java.util.Vector;

public class Combination {
	/**
	 * This method adds and returns every sort of combination between two vectors.
	 * @param v1
	 * @param v2
	 * @return all combinations
	 */
	public static <T,S>  Vector<Pair<T,S>> getPermutation(Vector<T> v1 , Vector<S> v2){
		if (v1.isEmpty() || v2.isEmpty()) return null;
		Vector<Pair<T,S>> permutation = new Vector<Pair<T,S>>();
		
		for(int i=0; i<v1.size(); i++){
			for (int j = 0; j < v2.size(); j++) {
				Pair<T, S> p = new Pair<T, S>(v1.get(i), v2.get(j));
				permutation.add(p);
			}
			
		}
		return permutation;
	}
	/**
	 * This method displays all of the combinations calculated by the getPermutation method
	 * @param pairVect
	 * @return String output
	 */
	public static <T,S> String display(Vector<Pair<T,S>> pairVect){
		String out="";
		Iterator<Pair<T, S>> it = pairVect.iterator(); 
		while(it.hasNext()){
			Pair<T,S> cursor= ((Pair<T, S>)it.next());
			out+= cursor.getFirst() + "," +cursor.getSecond() + "\n"; 
		}
		return out;
	}
}
