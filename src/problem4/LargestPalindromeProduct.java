package problem4;

public class LargestPalindromeProduct {
	public static void main(String[] args){
		new LargestPalindromeProduct();
	}
	
	private static boolean isPalindrome(char[] numbers){
		int i1 = 0;
		int i2 = numbers.length-1;
		while(i2>i1){
			if(numbers[i1] != numbers[i2]){
				return false;
			}
			i2--;
			i1++;
		}
		return true;
	}
	
	public LargestPalindromeProduct(){
		int firstNbr = 111;
		int secondNbr = 111;

		int largestPalin = 0;
		
		for(int i = firstNbr; i<999; i++){
			for(int j = secondNbr; j<999; j++){
				int product = i*j;
				if(isPalindrome(String.valueOf(product).toCharArray())){
					if(product > largestPalin){
						largestPalin = product;
					}
				}
			}	
		}
		System.out.println(largestPalin);
	}
}
