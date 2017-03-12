package problem6;

public class SumSquareDifference {
	
	public static void main(String[] args){
		new SumSquareDifference();
	}
	
	public SumSquareDifference(){
		int sumOfSquares = 0;
		int sums = 0;
		
		for(int i = 1; i<=100; i++){
			sumOfSquares +=(int) Math.pow(i, 2);
			sums+=i;
		}
		
		int squaresOfSums = (int)Math.pow(sums, 2);
		System.out.println(squaresOfSums-sumOfSquares);
		
	}

}
