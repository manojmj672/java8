package java8features.methodreference;

import java.util.function.IntBinaryOperator;



//default interface



interface Myinterface{
  
  //default method
  default void newMethod() {
      System.out.println("Newly added default method");
  }




  //abstract method
  public void existingMethod(String str);
  
}



//Inheritance concept
class Example implements Myinterface{



 @Override
  public void existingMethod(String str) {
      
      
  }
  
}




//creating our own functional interface
interface MyFunctionalInterface{
  //single abstract method
  public int addMethod(int a, int b);
}



public class Functionalinterface {



 public static void main(String[] args) {
      
      //Lambda Operation
      MyFunctionalInterface sum=(a,b)-> a+b;
      System.out.println("Result="+sum.addMethod(12, 100));
      
      //predefined functional interface
      //lambda expression
      System.out.println("----Printed by the predefined interface---");
      IntBinaryOperator add =(a,b)-> a+b;
      System.out.println("Result="+add.applyAsInt(12,100));
      
      //creating an object to the class Example
      Example instance=new Example();
      //calling the default method of interface
      instance.newMethod();
      //calling the abstract method of interface
      instance.existingMethod("Java 8 is easy to learn");
      
      
      



 }



}
