/*Complete the code to develop a BASIC CALCULATOR that can perform operations like Addition, Subtraction, Multiplication and Division.

Note the following points carefully:
1. Use only double datatype to store calculated numeric values.
2. Assume input to be of integer datatype.
3. The output should be rounded using Math.round() method.
4. Take care of the spaces during formatting output (e.g., single space each before and after =).
5. The calculator should be able to perform required operations on a minimum of two operands as shown in the below example:

Input:
	       5+6 

Output:
	       5+6 = 11
	       
	      
*/
import *;
import java.util.Scanner;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
    
char[] charArray = input.toCharArray();
char operator=charArray[1];
double a = (double) (charArray[0] - '0');

double b = (double) (charArray[2] - '0');

if (operator=='+')
  System.out.print(input+" = "+Math.round(a+b));
else if (operator=='-')
  System.out.print(input+" = "+Math.round(a-b));
else if (operator=='*')
  System.out.print(input+" = "+Math.round(a*b));
else if (operator=='/')
  System.out.print(input+" = "+Math.round(a/b));
}
}
/*
https://youtube.com/c/StudyFun for explanation you can see here please subscribe if you like my video
 Mail your queries on studyizfun@gmail.com
connect me on linkedin
https://www.linkedin.com/in/kamesh-shekhar-5a3467152/
If you like my video 
Please donate at least RS 10 to my paytm wallet 8809692924
It will help me financially and encourage me to make more videos
*/

