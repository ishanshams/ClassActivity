
/**
 * Jack Carrubba G00740902 jcarrubb@masonlive.gmu.edu
 * Gabriel Querbes G00801940 gquerbes@gmu.edu
 * Jake Rose G00709889 jrose12@gmu.edu
 * Ishan SHams G00936815 ishams@gmu.edu
 * Daniel De Souza G00623081 ddesouz2@gmu.edu
 */


import java.util.Vector;


public class ActivityApplication {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<String>(); 
		Vector<Double> v2 = new Vector<Double> ();


	    v1.addElement(new String("Tom"));
	    v1.addElement(new String("Jon"));
	    v1.addElement(new String("Mary"));
	    v1.addElement(new String("Sam"));
	    v1.addElement(new String("Nina"));
	    v1.addElement(new String("Tara"));
		
		
		for (int i = 0; i< 5; i++){
			v2.addElement(new Double(i+99));  
		}
		
		
		//*********DotProduct***************
		Vector<Pair<String,Double>> product = DotProduct.calcDotProduct(v1, v2);
		System.out.println("Printing Dot Product ************\n"+Combination.display(product));
		System.out.println("\n\n");
		
		//*********Permutations***************
		Vector<Pair<String,Double>> permutation = Combination.getPermutation(v1, v2);
		System.out.println("Printing Permutation ************\n"+Combination.display(permutation));
		System.out.println("\n\n");
	}

}
