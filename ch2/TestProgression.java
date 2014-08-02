/** 
 *  Test program for the progression classes 
 * @author hua.zhang
 * 
 *
 */
public class TestProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Progression prog;
		
		//test ArithProgression
		System.out.println("Arithmetic progression with default increment:");
		prog = new ArithProgression();
		prog.printProgression(10);
	
		System.out.println("Arithmetic progression with increment 5:");
		prog = new ArithProgression(5);
		prog.printProgression(10);
		
		//test GeomProgression
		System.out.println("Geometric progression with default base:");
		prog = new GeomProgression();
		prog.printProgression(10);
		System.out.println("Geometric progression with base 3:");
		prog = new GeomProgression(3);
		prog.printProgression(10);
		
		//test FibonacciProgression
		System.out.println("Fibonacci progression with default start values:");
		prog = new FibonacciProgression();
		prog.printProgression(10);
		System.out.println("Fibonacci progression with start values 4 and 6:");
		prog = new FibonacciProgression(4,6);
		prog.printProgression(10);
		
		
	}

}


/** result : */
/*
 * 
 * Arithmetic progression with default increment:
0
 1 2 3 4 5 6 7 8 9
Arithmetic progression with increment 5:
0
 5 10 15 20 25 30 35 40 45
Geometric progression with default base:
1
 2 4 8 16 32 64 128 256 512
Geometric progression with base 3:
1
 3 9 27 81 243 729 2187 6561 19683
Fibonacci progression with default start values:
0
 1 1 2 3 5 8 13 21 34
Fibonacci progression with start values 4 and 6:
4
 6 10 16 26 42 68 110 178 288


 * 
 */
