/*
Write a program to create a record by taking inputs using Scanner class as first name as string ,last name as string ,roll number as integer ,subject1 mark as float,subject2 mark as float. Your program should print in the format 
  "name  rollnumber avgmark".

For example:
input:
ram
das
123
25.5
24.5
output:
ramdas 123 25.0
*/

import java.util.*;
public class Question3{
  public static void main(String[] args){
      Scanner s1 = new Scanner(System.in);
          //Read your first name in string
	String fname=s1.nextLine();
    
    //Read  your last name in string
   String lname=s1.nextLine();
     //Read  rollnumber in integer
    int roll=s1.nextInt();
    //Read  1st subject mark in float
    double s1mark=s1.nextDouble();
    //Read  2nd subject mark in float
	double s2mark=s1.nextDouble();
    // find the avg mark in the subject
	double avg=(s1mark+s2mark)/2;
    //Print the record in the format: name+" "+rollnumber+" "+avg_mark  
     System.out.print(fname+lname+" "+roll+" "+avg);
     }
     }
     
     /*
https://youtube.com/c/StudyFun for explanation you can see here please subscribe if you like my video
 Mail your queries on studyizfun@gmail.com
connect me on linkedin
https://www.linkedin.com/in/kameshshekhar/
If you like my video 
Please donate at least RS 10 to my paytm wallet 8809692924
It will help me financially and encourage me to make more videos
*/
