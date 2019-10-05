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
