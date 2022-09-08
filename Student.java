package java8features.methodreference;

 
import java.util.function.BiFunction;



@FunctionalInterface
interface Myinterface{
    //a method --abstract method
    public void display();
    
//--->make a reference to the abstract method and instance method
//method reference to an instance method of an object -object::instancemethod
    
    /*
     * method reference to stactic method of cls
     *
     */
    class Addition{
        static int add(int numberone,int numbertwo) {
            return numberone+numbertwo;
        }
    }
public class Student {
    /*
     * method reference is short hand notation of lambda expression to call a method
     *
     * str->system.out.println(str);
     * system.out::println
     */
    //method reference to an instance method  of an object-object::indtancemethod
    public void myMethod() {
        System.out.println("Instance Method");
        System.out.println("----i have been referenced by the abstract------- ");
    }
    public static void main(String[] args) {
        //create an object to cls--student
        Student object=new Student();
        //method  reference using the object of the cls
        Myinterface ref=object::myMethod;



       //calling the method of functional interface
        ref.display();
        
        //if i wanted to call
        //object.myMethod();//instance method cls



       //create an object to access the cls addition
        BiFunction<Integer,Integer,Integer> addition= Addition::add;
        int sum=addition.apply(11, 5);
        System.out.println("addition of given no is:"+sum);
    //    Addition instance=new Addition();
    //    instance.addition(10,10);
        
    }



}
}
}

