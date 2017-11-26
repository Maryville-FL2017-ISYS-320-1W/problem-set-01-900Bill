/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 6. Your pseudocode algorithm here
Create three rows, set the numbers to appear three times over counting from 0 to 9.
Set all integers to zero and less than 3, create a repetition of the algorithm. 
Set the middle integer less than equal to 9 to create the limit designate the system to print out line J

*/

public class NumberString {
	

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
		    for(int j = 0; j <= 9; j++) {
		        for(int k = 0; k < 3; k++)
		            System.out.print(j);
		    }
		    System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
