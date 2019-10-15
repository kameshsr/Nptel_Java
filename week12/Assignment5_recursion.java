/*Write a recursive function to print the sum of  first n odd integer numbers. The recursive function should have the prototype
 " int sum_odd_n(int n) ".

For example :

input : 5
output: 25 

input : 6
output : 36
*/

import java.util.*;
public class Question5 { 
    static int sum_odd_n(int n){ 
          if(n==1)
              return 1;
           if (n <= 0) 
                return 0;
int c=n,sum=0;
if(c==n){
	sum=n*2-1;
}
       return sum+sum_odd_n(n-1);
 }
   public static void main(String[] args) {  
      Scanner in=new Scanner(System.in);
      int count=in.nextInt();      
      int r=sum_odd_n(count);
      System.out.println(r); 	  
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
