package java8features.methodreference;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new  ArrayList<String>();
		
		names.add("aaa");
		names.add("bbb");
		names.add("ccc");
		names.add("ddd");
		names.add("eee");
		int count=0;
		for(String ele:names) {
			if(ele.length()<=6)
				count++;
		}
		System.out.println("there are:"+count+"strings with the length less than 6");
		//lets apply stream now! - using lambda Expression.
		int number=(int)names.stream().filter(ele->ele.length()<6).count();
		System.out.println("There are:"+number+"string with length less than 6");

	}

}
