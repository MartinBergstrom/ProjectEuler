package problem5;

public class SmallestMultiplesFirstBruteForce {
	public static void main(String[] args){
		new SmallestMultiplesFirstBruteForce(20);
	}
	
	//funkar men långsam, kika på primes
	
	//smallest multipels by the factors 1 ...n
	public SmallestMultiplesFirstBruteForce(int n){
		int smallest = 0;

		for(int i = Integer.MAX_VALUE; i>=n; i--){
			if(isDivisible(i))
				smallest = i;
		}
		
		System.out.println(smallest);
	}

	private static boolean isDivisible(int number){
		for(int i = 2; i<=20; i++){
			if(number%i != 0){
				return false;
			}
		}
		return true;
	}
}
