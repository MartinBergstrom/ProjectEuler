package problem5;

import java.util.Arrays;
import java.util.Collections;


public class SmallestMultiplesOptimization1 {
	private int[][] primeFactors;

	public static void main(String[] args){
		new SmallestMultiplesOptimization1(20);
	}

	public SmallestMultiplesOptimization1(int n){
		/*think in prime factors!
		 * what is divisible by 1 to 10? , 1*2*3*4*5*6*7*8*9*10 =3628800 is
		 * but there is a smaller one, 2520
		 * 
		 * possible by multiplying the biggest prime factor
		 * 
		2 =>  2^1
  		3 =>        3^1
  		4 =>  2^2
  		5 =>               5^1
  		6 =>  2^1   3^1
  		7 => 					 7^1
  		8 =>  2^3
  		9 =>  		3^2
  		10=>  2^1	 	   5^1
        -----------------
        	  2^3   3^2    5^1	 7^1        <--- highest exponents
		 * 
		 * (2^3)*(3^2)*5*7= 2520
		 *  */

		primeFactors = new int[n][n]; //represnt that grid of the prime factors expontials
		for(int i = 2; i<=n; i++){
			addPrimeFactors(i);
		}

		int product = 1;
		for(int col = 1; col<primeFactors.length; col++){
			int[] nbrs = new int[primeFactors.length];
			int max = 1;
			//get the column
			for(int j = 0; j<primeFactors.length; j++){
				nbrs[j] = primeFactors[j][col];
			}
			max = Arrays.stream(nbrs).max().getAsInt();
			if(max>0){
				product = (int) (product*Math.pow(col+1, max));		
			}
		}
		System.out.println(product);
	}


	// A function to add all prime factors
	// of a given number n
	public void addPrimeFactors(int number){
		int gridNumber = number;
		while (number%2==0){	
			primeFactors[gridNumber-1][1]+=1;
			number /= 2;
		}
		for (int i = 3; i <= Math.sqrt(number); i+= 2){
			while (number%i == 0){
				primeFactors[gridNumber-1][i-1]+=1;
				number /= i;
			}
		}
		if (number > 2){
			primeFactors[gridNumber-1][number-1] =1;
		}
	}
}
