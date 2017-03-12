package problem3;

import java.util.ArrayList;

public class LargestPrimeFactor {

	private static boolean isPrime(long n){
		if(n<2) return false;
		if(n == 2) return true;
		if(n%2 == 0) return false;	
		for(int i = 3; i<=Math.sqrt(n); i+=2){
			if(n%i == 0){ 
				return false;
			}
		}
		return true;
	}

	public LargestPrimeFactor(){
		long number = 600851475143L;
		long largestPrime = 0L;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = 2; i <10000; i++){
			if(isPrime(i)){
				primes.add(i);
			}
		}
		while(!isPrime(number)){
			for(int i = 0; i<primes.size(); i++){
				if(number%primes.get(i) ==0){
					largestPrime = primes.get(i);
					number = number/largestPrime;
					break;
				}
			}
		}
		largestPrime = number;
		System.out.println(largestPrime);
	}
	public static void main(String[] args){
		new LargestPrimeFactor();
	}
}
