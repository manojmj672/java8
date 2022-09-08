package java8features.methodreference;
interface ConstructorInterface{
	Hello display(String say);
}
class Hello{
	Hello(String say){
		System.out.println("good morning guys ...!!"+say);
	}
}

public class Constructormethodreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInterface ref=Hello::new;
		ref.display("how are you doing..!!");

	}

}
