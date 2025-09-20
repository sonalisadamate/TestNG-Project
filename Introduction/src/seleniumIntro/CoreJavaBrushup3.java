package seleniumIntro;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is an object / string literal
		//if same values are present it'll be in single object
		
		String s1="Sonali Sadamate Academy";
		String s5="hello";
		
		//new memory locator
		//even if the values are same it'll explicitly go in diff memory space
		String s2= new String("Welcome");
		String s3= new String("Welcome");
		
		String s= "Sonali Sadamate Academy";
		String[] splittedString= s.split("Sadamate");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
	}

}
