import java.util.Scanner;

/*
  	ISYS 320
  	Name(s): Antoine Payne
  	Date: 11/26/17
*/

public class ScalableNumbersRight {

	private static Scanner in;

	public static void main(String[] args) {
	in = new Scanner(System.in);
	System.out.print("Desired Number scale: ");
	int sum = in.nextInt();
		for( int line = 1; line <= sum; line++ ) {
			for( int spacesIndex = 1; spacesIndex <= 5 - line; spacesIndex++ ) {
				System.out.print(" ");
			}
			for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) {
				System.out.print( line );
			}
			System.out.println();
		}

	}

}
