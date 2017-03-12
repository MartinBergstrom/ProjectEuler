package problem9;

public class SpecialPythagoreanTriplet {
	private int a = 0;
	private int b = 0;
	private int c = 0;
	
	//fastest method?
	public static void main(String[] args){
		new SpecialPythagoreanTriplet();
		final long endTime = System.currentTimeMillis();
	}
	
	public SpecialPythagoreanTriplet(){
		findTriplets(1000);
	}
	
	private void findTriplets(int sum){
		int sqrt = (int)Math.sqrt(sum);
		for(int m = 2; m<sqrt; m++){
			for(int n = 1; n<sqrt; n++){
				a = (int) (Math.pow(m,2) - Math.pow(n,2));
				b = 2*m*n;
				c = (int) (Math.pow(m,2) + Math.pow(n,2));
				if(a + b + c == sum){
					System.out.println(a + " " + b + " " + c);
					System.out.println("The product is :" + (a*b*c));
				}			
			}
		}
	}
}
