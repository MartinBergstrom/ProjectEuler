package problem8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class LargestProductInASeries {
	public static void main(String[] args){
		final long startTime = System.currentTimeMillis();
		new LargestProductInASeries();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) + " ms");
	}

	public LargestProductInASeries(){
		File file = new File("src/problem8/thousanddigit.txt");
		LinkedList<Integer> searchArray = new LinkedList<Integer>();
		Long maxProduct = 0L;

		try {
			Scanner input = new Scanner(file);
			input.useDelimiter("");

				//InitialRead
				while(input.hasNext() && searchArray.size()<13){
					char nextChar = input.next().charAt(0);
					searchArray.add(Character.getNumericValue(nextChar));	
				}		
				maxProduct = productOfSearch(searchArray);
	
				//read rest
				while(input.hasNext()){
					char nextChar = input.next().charAt(0);
					if(!Character.isWhitespace(nextChar)){
						searchArray.removeFirst();
						searchArray.addLast(Character.getNumericValue(nextChar));
						Long newMax = productOfSearch(searchArray);
						if(newMax>maxProduct){
							maxProduct = newMax;
						}
					}
				}
				input.close();
				System.out.println(maxProduct);
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	private Long productOfSearch(LinkedList<Integer> array){
		Long product = 1L;
		for(int i = 0; i<array.size(); i++){
			product = product * array.get(i);
		}
		return product;
	}
}