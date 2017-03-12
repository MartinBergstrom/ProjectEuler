package problem7;

import java.util.ArrayList;

public class TenThousandAndFirstPrime {
	public static void main(String[] args){
		new TenThousandAndFirstPrime();
	}
	
	public TenThousandAndFirstPrime(){
		long number = 1L;
		ArrayList<Long> primes = new ArrayList<Long>();
		
		while(primes.size() <10001){
			if(isPrime(number)){
				primes.add(number);
			}
			number++;
		}
		System.out.println(primes.get(primes.size()-1));
	}
	
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

}
