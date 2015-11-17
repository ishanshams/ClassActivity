/**
Jack Carrubba
Ishan Shams
Gabriel Querbes
Daniel De Souza
Jacob Rose

Class Activity
 */

import java.util.Vector;


public class ActivityApplication {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<String>(); 
		Vector<Double> v2 = new Vector<Double> ();

	    v1.addElement(new String("Ishan"));
	    v1.addElement(new String("Gabriel"));
	    v1.addElement(new String("Jack "));
	    v1.addElement(new String("Samuel"));
	    v1.addElement(new String("Daniel"));
	    v1.addElement(new String("Tara"));
		
		
		for (int i = 0; i< 5; i++){
			v2.addElement((double)(int)(Math.random()*100));  
		}
		
		
		//*********DotProduct***************
		Vector<Pair<String,Double>> product = DotProduct.calcDotProduct(v1, v2);
		System.out.println("Printing Permutation ************\n"+Combination.display(product));
		System.out.println("\n\n");
		
		//*********Permutations***************
		Vector<Pair<String,Double>> permutation = Combination.getPermutation(v1, v2);
		System.out.println("Printing Permutation ************\n"+Combination.display(permutation));
		System.out.println("\n\n");
	}

}
