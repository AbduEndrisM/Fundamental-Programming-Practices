package lesson2;

import java.util.Random;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		// Question 1   1-9  
		int a =r.nextInt(9-1+1)+1; // r.nextInt(max - min + 1) + min
		double x= Math.pow(Math.PI, a);
		System.out.println(x);
		
		
			
		
		//Question 2	3-14
		int b =r.nextInt(14-3+1)+3; // r.nextInt(max - min + 1) + min
		double y= Math.pow(b, Math.PI);
		System.out.println(y);
		
		
	}

}
