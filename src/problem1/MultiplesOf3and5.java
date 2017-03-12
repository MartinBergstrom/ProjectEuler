package problem1;

import java.util.ArrayList;

public class MultiplesOf3and5 {
	private ArrayList<Integer> multiples;

	private void calculate(){
		multiples = new ArrayList<Integer>();

		for(int i = 1; i<1000; i++){
			if((i % 3 == 0) || (i % 5 == 0)){
				multiples.add(new Integer(i));
			}
		}
		int sum = 0;
		for(int j = 0; j<multiples.size(); j++){
			sum+= multiples.get(j);
		}
		System.out.println(sum);

	}
	public MultiplesOf3and5(){
		calculate();
	}
	public static void main(String[] args){
		new MultiplesOf3and5();
	}

}
