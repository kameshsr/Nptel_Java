/*
A program code is given to call the parent class static method and instance method in derive class without  creating object of parent class. You should write the appropriate code so that the program print the contents of static method() and instance method () of parent class.
*/
class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}
public class Child extends Parent {
   public static void testClassMethod() {
        
    }
    public static void main(String[] args) {
        
  Child c=new Child();
  c.testInstanceMethod();
  Parent.testClassMethod();
		
     // Call the static method in the Parent class
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
