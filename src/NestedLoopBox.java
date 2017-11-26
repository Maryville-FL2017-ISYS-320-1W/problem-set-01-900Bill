/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 4. Your pseudocode algorithm here
set rows to 6, set I and J less than the number of rows so it will continue to go until that number set(6)
set * to the print out design/character 

*/
public class NestedLoopBox {
	public static void main(String args[]) {
        int rows = 6, i, j;
        for(i = 0; i < rows; i++){
            for(j = 0; j < rows; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
