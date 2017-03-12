package problem2;

import java.util.ArrayList;

public class EvenFibonaccinNumbers {
	private ArrayList<Integer> numbers;
	
	//calculates the fibonacci 
	private int fibonacci(int n){
		if(n <= 1){
			return n;
		}
		else{
			//numbers.add(new Integer(n));
			return (fibonacci(n-1) + fibonacci(n-2));
		}
	}
	public EvenFibonaccinNumbers(){
		numbers = new ArrayList<Integer>();
		
		int a = 0;
		int b = 1;
		int c = 0;
		// 1 2 3 5 8 13 21 34 55 89
		int even = 0;
		
		while(c < 4000000){
			if(c%2 == 0)
				even+=c;
			
			 c= a+b;
			 a = b;
			 b = c;
		}
		System.out.println(c + " och sum är " + even);
		//System.out.println("11%2 ==?" + (11%2));
//		System.out.println(fibonacci(11));
//		for(int i= 0; i<numbers.size(); i++){
//			System.out.println(numbers.get(i));
//		}
	}
	
	public static void main(String[] args){
		new EvenFibonaccinNumbers();
	
	}

}
