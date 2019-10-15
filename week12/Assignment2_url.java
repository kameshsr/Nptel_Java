/*
A partial code fragment is given. The URL class object is created in try block.You should write appropriate method( )  to print the protocol name and host name from the given url string.
For example:
https://www.xyz.com:1080/index.htm

protocol://host:port/filename
*/
import java.net.*;  
public class Question2{  
   public static void main(String[] args){  
   try{  
     URL url=new URL("http://www.Nptel.com/java-tutorial");    
    //use appropriate method() to print the protocol name and host name from url 
    //Write the method() by replacing the blank space.
     System.out.println("Protocol: "+url.getProtocol());  
     System.out.println("Host Name: "+url.getHost());
 
      }
   catch(Exception e){System.out.println(e);}  
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
