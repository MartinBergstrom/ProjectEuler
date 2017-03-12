package problem10;

public class SummationOfPrimes {
	public static void main(String[] args){
		final long startTime = System.currentTimeMillis();
		new SummationOfPrimes(2000000);
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) + " ms");
	}
	public SummationOfPrimes(int number){
		Long sum = 0L;
		
		Long count = 2L;
		while(count < number){
			if(isPrime(count)){
				sum+=count;
			}
			count++;
		}
		
		System.out.println(sum);
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
