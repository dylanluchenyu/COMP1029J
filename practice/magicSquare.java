/**
* This class stores and verifies a magic square.
*/
public class magicSquare
{
public static void main(String[] args) {
// Create the magic square array
int[][] magicsquare = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
int i;
// Print the sum of the numbers in the rows
for (i = 0; i < 3; i++) {
System.out.print("The sum in row " + i + " is: ");
System.out.println(magicsquare[i][0] +
magicsquare[i][1] +
magicsquare[i][2]);
}
// Print the sum of the numbers in the columns
for (i = 0; i < 3; i++) {
System.out.print("The sum in column " + i + " is: ");
System.out.println(magicsquare[0][i] +
magicsquare[1][i] +
magicsquare[2][i]);
}
// Print the sum of the numbers in the diagonals
System.out.print("The sum in the downward diagonal is: ");
System.out.println(magicsquare[0][0] +
magicsquare[1][1] +
magicsquare[2][2]);
System.out.print("The sum in the upward diagonal is: ");
System.out.println(magicsquare[2][0] +
magicsquare[1][1] +
magicsquare[0][2]);
}
}