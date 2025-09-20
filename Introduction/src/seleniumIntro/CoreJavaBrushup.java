package seleniumIntro;

public class CoreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables and data types 
		int myNum = 5;
		String website = "Sonali Sadamate Academy";
		char letter = 'r';
		double dec = 7.99;
		boolean myCard = true;
		
		System.out.println(myNum+"is the value stored in myNum variable");
		System.out.println(website);
		
		//Arrays in Java -requirement of storing more value in one variable, that is array
		
		int[] arr = new int[5];
		arr[0]= 1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,122};
		
		System.out.println(arr2[2]);
		System.out.println(arr[2]);
		
		//for loop
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] name = {"Sonali", "Sadamate", "Selenium"};
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		for (String s : name)
		{
			System.out.println(s);
		}
	}
}
