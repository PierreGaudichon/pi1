import Robot.*;

public class extraction {

	public static void initExtraction1() {
		Robot.initialize(3,4);
		Robot.addBlock(0,5);		
		Robot.addBlock(0,3);
		Robot.addBlock(0,1);
	}

	public static void initExtraction2() {
		Robot.initialize(3,4);
	}

	public static void initExtraction3() {
		Robot.initialize(3,4);
		Robot.addBlock(0,5);		
	}
	
	public static void initExtraction4() {
		Robot.initialize(3,4);
		Robot.addBlock(0,3);		
	}
	

	public static void initExtraction5() {
		Robot.initialize(3,4);
		Robot.addBlock(0,4);	
		Robot.addBlock(0,3);		
		Robot.addBlock(0,2);
		Robot.addBlock(0,1);
		
	}

	// fonction extraction: prend deux entiers min et max en paramètre
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// décommentez une ligne à la fois pour tester différents états initiaux
		initExtraction1();
		//initExtraction2();
		//initExtraction3();
		//initExtraction4();
		//initExtraction5();
		
		// appel à la fonction d'extraction, à vous de l'écrire
		//extraction(2,4);
		
		Robot.play();
		
	}

}
