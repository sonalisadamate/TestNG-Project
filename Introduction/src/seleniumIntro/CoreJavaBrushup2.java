package seleniumIntro;

import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {1,2,3,4,5,6,7,8,9,122};
		for (int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
		
			{
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i]+"is not multiple of 2");
			}
			//aarraylist for dynamic arrays- no fixed pre defined size for arraylist, we can add many values
			ArrayList<String> a = new ArrayList<String>();
			a.add("Sonali");
			a.add("Sadamate");
			a.add("selenium");
			a.remove(2);
			a.get(4);
			System.out.println(a.get(3));
		}
			
}
}
