import java.util.Scanner;
public class SchuchmanHW3 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String patternType;

boolean validEntry=false;

do //input validation for patternType
{
  System.out.print("What pattern would you like to display? (checkerboard, hollow, or pyramid) " );
  patternType = input.next();
  if (patternType.equalsIgnoreCase("checkerboard") || patternType.equalsIgnoreCase("hollow") ||patternType.equalsIgnoreCase("pyramid") )
  {
    validEntry = true;
  }
  else
  {
    System.out.println("Invalid entry.");
  }
} while (validEntry == false);

//input size and character
int size;
char character;
System.out.print("Enter desired size of pattern: ");
size=input.nextInt();
System.out.print("Enter a character to be displayed in the pattern: ");
character=input.next().charAt(0);
 
//checkerboard pattern
if (patternType.equalsIgnoreCase("checkerboard"))
{
	for (int i=0; i<size; i++)
	{
		for (int j=0; j<size; j++)
		{
			if (i%2==0)
			{
					System.out.print(character+ " ");
			}
			else
			{
					System.out.print(" " + character);
			}
		}
		System.out.println();
	}
}
//hollow pattern
else if (patternType.equalsIgnoreCase("hollow"))
{
	for (int i=0; i<size; i++)
	{
		for (int j=0; j<size; j++)
		{
			if(i==0 || i== size-1)
				System.out.print(character);
			else if (j==0 || j==size-1)
				System.out.print(character);
			else
				System.out.print(" ");
		} 
		System.out.println();
	}
}
//pyramid pattern
else if (patternType.equalsIgnoreCase("pyramid")) 
{
	int rows=size;				//pyramid has as many rows as inputted size
	int cols=size*2-1;			//pyramid has enough columns to include inputted # of rows
	int midpoint=cols/2;	//midpoint of # of columns
	for (int i=0; i<rows; i++)
	{
		for (int j=0; j<cols; j++)
		{
				if (j==midpoint ||(j>midpoint && j<=midpoint+i) ||(j< midpoint && j>=midpoint-i)) 	//prints character
					System.out.print(character);
				else																				//prints a space
					System.out.print(" ");
			
		} 
		System.out.println();
	}
}

}
	}


